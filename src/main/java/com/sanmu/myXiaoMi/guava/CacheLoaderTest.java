package com.sanmu.myXiaoMi.guava;

import com.google.common.cache.*;
import com.google.common.collect.Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/**
 * ${DESCRIPTION}
 *
 * @author yansen
 * @create 2018-11-16 17:06
 **/
public class CacheLoaderTest {

    public static void main(String[] args) {
        LoadingCache<Long,Map<String,Object>> graphs = CacheBuilder.newBuilder()
                .maximumSize(1000)
                .expireAfterAccess(100000, TimeUnit.SECONDS)
                .expireAfterWrite(1000,TimeUnit.SECONDS)
                .removalListener(new RemovalListener<Long, Map<String,Object>>() {
                    @Override
                    public void onRemoval(RemovalNotification<Long, Map<String, Object>> removalNotification) {

                    }
                })
                .weigher(new Weigher<Long, Map<String,Object>>() {
                    @Override
                    public int weigh(Long aLong, Map<String, Object> stringObjectMap) {
                        return 0;
                    }
                })
                .build(new CacheLoader<Long, Map<String, Object>>() {
            @Override
            public Map<String, Object> load(Long aLong) throws Exception {
                return createExpensiveGraph(aLong);
            }
        });

        try {

           System.out.println( graphs.get(10L));

           System.out.println( graphs.get(11L, new Callable<Map<String, Object>>() {
               @Override
               public Map<String, Object> call() throws Exception {
                   Map<String,Object> map = Maps.newHashMap();
                   map.put("11","11");
                   return map;
               }
           }));

           System.out.println(graphs.get(11L, new Callable<Map<String, Object>>() {
               @Override
               public Map<String, Object> call() throws Exception {
                   Map<String,Object> map = Maps.newHashMap();
                   map.put("11","11");
                   return map;
               }
           }));
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        Map<String,Object> map = Maps.newHashMap();
        map.put("11","111");
        graphs.put(11L,map);

        ConcurrentMap<Long,Map<String,Object>> concurrentMap =  graphs.asMap();


    }

    public static Map<String, Object> createExpensiveGraph(Long id){

        Random random = new Random();
        Map<String,Object> map = new HashMap<String,Object>();
        map.put(String.valueOf(random.nextInt(10)),random.nextInt(100));
        return  map;
    }
}
