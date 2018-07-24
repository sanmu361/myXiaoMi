package com.sanmu.myXiaoMi;

import com.DashBoardModel;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Hello world!
 *
 */
public class App 
{

//    private static Set<String> mix2 = Sets.newHashSet("16329","16650","16330");
//    private static Set<String> note3 = Sets.newHashSet("16320","16322" ,"16323","16321");
//    private static Set<String> mi5x = Sets.newHashSet("15955","15956","15957","15959","15960","15961");
//    private static Set<String> mi5A = Sets.newHashSet("16336","16296","16297","16337","16881","16880","17071");
//    private static Set<String> mi6 = Sets.newHashSet("15589","15590","15592","15794","15591","15792");
//    private static Set<String> mi4x = Sets.newHashSet("17006","14664","14665","15268","15410","15409","15418","14666","15762","15763","15764","15765","15759");
//    private static Set<String> hongmi4x = Sets.newHashSet("15575","15098","15097","15328","15329","15691","15690","15689","15576");
//    private static Set<String> hongmi4A = Sets.newHashSet("14464","14463","15614");
//    private static Set<String> miMax2 = Sets.newHashSet("15829","16652");
//    private static Set<String> tv = Sets.newHashSet("10701","8913","10309","10485","11099","11348","11351","11354","12389","12272","12907","13222","13224","12275","12569","12566","14592","14590","14588","16147","14068","15559","14070","15561","14072","15563","14074");
//    private static Set<String> computer = Sets.newHashSet("15668","15669","15670","15671","15667","15988","15987","15986","13135","13136","13138","13140","16771","16772","16773");
//    private static Set<String> luyou = Sets.newHashSet("5610","6816","6044","10508","10511","13779","15796","12941","15754","10935","12937","12939","15757","12284","15756");
//    private static Set<String> all = Sets.newHashSet();
//    static {
//        all.addAll(mix2);
//        all.addAll(note3);
//        all.addAll(mi5x);
//        all.addAll(mi5A);
//        all.addAll(mi6);
//        all.addAll(mi4x);
//        all.addAll(hongmi4A);
//        all.addAll(hongmi4x);
//        all.addAll(miMax2);
//        all.addAll(tv);
//        all.addAll(computer);
//        all.addAll(luyou);
//    }

    public static void main( String[] args )
    {
//        String a = "SELECT g.category_name as `name`,SUM(good_info.price * good_info.num) as `num` from goods as `g`,"
//                +"(SELECT og.goods_id,og.price,og.num from order_goods as `og` ,"
//                +"(SELECT id from `order` where #if(:start_time>0){`pay_time` >= :start_time AND}"
//                +" #if(:end_time>0 && :end_time>:start_time){`pay_time`< :end_time AND} `status` IN(##(:status))"
//                +"#if(:scope!=''){ AND `scope` like '%##(:scope)%'} ORDER BY `added_time` DESC) as `o`"
//                +" where og.order_id=o.id) as `good_info`"
//                + "WHERE good_info.goods_id=g.goods_id GROUP BY g.category_id;";
//        System.out.println(a);
//
//        HelloClassLoader classLoader = new HelloClassLoader();
//
//        classLoader.println();
//
//        ExecutorService  executorService = Executors.newSingleThreadExecutor();
//        List<Integer> list = Lists.newArrayList(2,1,5,7,3,1,3,7);
//
//        Collections.sort(list, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2.compareTo(o1);
//            }
//        });
//
//        for(Integer integer : list){
//            System.out.println(integer);
//        }


//        DashBoardModel model = new DashBoardModel();
//        model.setRegionId(2);
//        model.setRegionName("北京");
//        model.setActiveUser(3);
//        model.setAvgAmount(new BigDecimal(1235.233).setScale(2,BigDecimal.ROUND_HALF_UP));
//        model.setPhoneNum(345);
//        model.setTradeAmount("2,345.34");
//        Gson gson = new GsonBuilder().create();
//
//       System.out.println(gson.toJson(model));

//        DecimalFormat df = new DecimalFormat("#,###.00");
//
//        System.out.println(df.format(new BigDecimal(123456789.01)));

        //executorService.submit(new Thread());

//        Map<String,Set<String>> map = Maps.newHashMap();
//        map.put("mix2",mix2);
//        map.put("note3",note3);
//        map.put("mi5x",mi5x);
//        map.put("mi5A",mi5A);
//        map.put("mi6",mi6);
//        map.put("mi4x",mi4x);
//        map.put("hongmi4x",hongmi4x);
//        map.put("hongmi4A",hongmi4A);
//        map.put("miMax2",miMax2);
//        map.put("tv",tv);
//        map.put("computer",computer);
//        map.put("luyou",luyou);
//        map.put("all",all);
//
//       Gson gson = new GsonBuilder().create();
//
//       System.out.println(gson.toJson(map));

        String name = "{1234}";

        int index1 = name.indexOf("{");
        int index2 = name.indexOf("}");

        System.out.println(name.subSequence(index1 + 1,index2));
    }
}
