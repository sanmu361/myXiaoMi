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

        String ret = "{\"header\":{\"code\":200,\"msg\":\"\"},\"body\":{\"order\":{\"order_id\":\"1170629367504589\",\"user_id\":\"1209058799\",\"order_status\":50,\"consignee\":\"\\u6c6a\\u5149\\u542f\",\"country\":1,\"province\":10,\"city\":108,\"district\":1132,\"area\":1132004,\"address\":\"\\u6842\\u5e73\\u8def391\\u53f7\\u65b0\\u6f15\\u6cb3\\u6cfe\\u56fd\\u9645\\u5546\\u52a1\\u4e2d\\u5fc3a\\u5ea722\\u5c422201\\u5ba4\",\"zipcode\":\"200030\",\"tel\":\"18616747192\",\"email\":\"anonymous@xiaomi.com\",\"best_time\":1,\"postscript\":\"\",\"invoice_title\":\"\\u4e9a\\u6570\\u4fe1\\u606f\\u79d1\\u6280\\uff08\\u4e0a\\u6d77\\uff09\\u6709\\u9650\\u516c\\u53f8\",\"invoice_type\":2,\"invoice_company_code\":\"\",\"express_id\":0,\"pay_id\":14,\"pay_bank\":\"\",\"pickup_id\":420,\"currency\":\"CNY\",\"goods_amount\":\"2899.00\",\"imprest\":\"0.00\",\"shipment_id\":1,\"shipment_expense\":\"0.00\",\"tax\":\"0.00\",\"weight\":\"0.000\",\"express_sn\":\"\",\"express_update_time\":0,\"add_time\":1498703260,\"close_time\":0,\"ttl\":1498746460,\"p_order_id\":\"0\",\"related_order_id\":0,\"complete_time\":0,\"trade_no\":\"2017062921001004800226125682\",\"notes\":\"\",\"order_type\":5,\"order_flow\":0,\"wms_acc\":\"N\",\"push_time\":0,\"country_name\":\"CHN\",\"wms_name\":\"WMS\",\"sales_type\":25,\"order_from\":11,\"invoice_stat\":0,\"push_stat\":1,\"lock_status\":0,\"discount\":\"0.00\",\"pay_time\":1498703318,\"wms_acc_time\":0,\"from_ip\":\"10.112.74.172\",\"channel\":\"\",\"consignee_c\":\"GBD91YiDpEQkfGBvCofBay3EGBJKPpazAytGRLxgG1smsz0ObwEYEORHYtJLhEmfqpDV5CDMzgwYFNVgHHmE1aUMcMXmtkzTKodUL2d6EwEA\",\"tel_c\":\"GBAzzbJQbdAdDY\\/VwqnQ0RDKGBJAIML2m0dA\\/I6hYElwernSHgEYEFPIW0Ajok3mnVKLIEGJLdsYFARBb48LbL9W1pRe4WDRuz\\/cECJeEwEA\",\"address_c\":\"GECT96y8PEjiYV+t5DrVW2V0WppPspvPcso\\/PToy6WTbi0TRLa\\/M0ynbO9DWeAAL32VpVLjBxFQQubiCG8ZRv+l3GBKhTSqXid1OcI8CUho3qge5ygEYEAFU39xw70UZg4pPZUYZDpoYFAdD4TdE3RH9KakvvYLQS\\/3+dtsmEwEA\",\"tel_idx\":\"8d8f2ba96f992ea2\",\"is_cod\":0,\"update_time\":\"2017-06-29 10:28:40\",\"consignee_idx\":\"53d24443a71ea8f3\",\"est_out_of_wh_time\":1498876118,\"est_delivered_time\":-1,\"est_delivered_time_l\":-1,\"stockout_status\":1,\"top_order_id\":0,\"goods_amount_no_shipment\":2899,\"province_name\":\"\\u4e0a\\u6d77\",\"city_name\":\"\\u4e0a\\u6d77\\u5e02\",\"district_name\":\"\\u5f90\\u6c47\\u533a\",\"area_name\":\"\"},\"order_extentions\":{\"id\":383393230,\"internal_order_id\":469045,\"order_id\":\"1170629367504589\",\"item_no\":1,\"goods_id\":15590,\"shop_price\":\"2899.00\",\"cart_price\":\"2899.00\",\"origin_price\":\"2899.00\",\"goods_count\":1,\"is_promoted\":0,\"batch_goods_id\":0,\"scenario\":0,\"seq\":0,\"mode\":0,\"deliver_id\":0,\"stock_channel\":\"cn-innova\",\"insurance_sku\":\"0\",\"shipment_id\":1,\"shipment_expense\":\"0.00\",\"pre_sale_order_id\":0,\"pre_sale_sku\":\"0\",\"stockover_status\":0,\"dealer\":0,\"item_type\":0,\"mihome\":420},\"order_item\":[{\"id\":383393230,\"internal_order_id\":469045,\"order_id\":\"1170629367504589\",\"item_no\":1,\"goods_id\":15590,\"shop_price\":\"2899.00\",\"cart_price\":\"2899.00\",\"origin_price\":\"2899.00\",\"goods_count\":1,\"is_promoted\":0,\"batch_goods_id\":0,\"scenario\":0,\"seq\":0,\"mode\":0,\"deliver_id\":0,\"stock_channel\":\"cn-innova\",\"insurance_sku\":\"0\",\"shipment_id\":1,\"shipment_expense\":\"0.00\",\"pre_sale_order_id\":0,\"pre_sale_sku\":\"0\",\"stockover_status\":0,\"dealer\":0,\"item_type\":0,\"mihome\":420,\"spec_name\":\"\\u989c\\u8272\",\"spec_value\":\"\\u9ed1\\u8272\",\"content\":{\"spec_name_info\":\"\\u5bb9\\u91cf\",\"spec_value_info\":\"128GB\"},\"gallery\":[\"pms_1492571566.59849687.jpg\"]}],\"waybill\":[{\"waybill_id\":\"117062936750458901\",\"express_sn\":\"199188761808\",\"express_name\":\"\\u987a\\u4e30(\\u5357\\u4eac)\",\"waybill_status\":\"3000\",\"item_info\":[{\"goods_id\":\"15590\",\"shop_price\":\"2899.00\",\"cart_price\":\"2899.00\",\"origin_price\":\"2899.00\",\"content\":{\"spec_name_info\":\"\\u5bb9\\u91cf\",\"spec_value_info\":\"128GB\"},\"gallery\":[\"pms_1492571566.59849687.jpg\"],\"goods_name\":\"\\u5c0f\\u7c736 \\u5168\\u7f51\\u901a\\u7248 6GB\\u5185\\u5b58 \\u4eae\\u9ed1\\u8272\",\"spec_name\":\"\\u989c\\u8272\",\"spec_value\":\"\\u9ed1\\u8272\",\"goods_count\":\"1\"}]}]}}";

        Gson gson = new GsonBuilder().create();

        Map map = gson.fromJson(ret,HashMap.class);

        System.out.println(map);

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