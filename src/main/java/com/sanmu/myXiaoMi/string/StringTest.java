package com.sanmu.myXiaoMi.string;

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.google.common.collect.Lists;

import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author yansen
 * @create 2018-11-08 17:23
 **/
public class StringTest {

    public static void main(String[] args) {
        String temp = " private BigDecimal useRebate;\n" +
                "\n" +
                "    private int orderStatus;\n" +
                "    private int province;\n" +
                "    private int city;\n" +
                "    private int district;\n" +
                "    private String address;\n" +
                "    private int invoiceType;\n" +
                "    private long orderId;\n" +
                "    private long payTime;\n" +
                "    private long addTime;\n" +
                "    private long userId;\n" +
                "    private long miliao;\n" +
                "    private String zipcode;\n" +
                "    private String tel;\n" +
                "    private String consignee;\n" +
                "    private InvoiceInfo invoiceInfo;\n" +
                "    private BigDecimal goodsAmount;\n" +
                "    private BigDecimal shipmentExpense;\n" +
                "    private Order order;\n" +
                "    private String orderLogss;\n" +
                "    private List<CorpWayBill> waybill;\n" +
                "    private List<GoodsItem> goodsItems;";

        List<String> list = Splitter.on("\n").trimResults().omitEmptyStrings().splitToList(temp);

        List<String> result = Lists.newArrayList();

        for(String str : list){
            List<String> tempList = Splitter.on(" ").trimResults().omitEmptyStrings().splitToList(str);
            result.add(tempList.get(2).replace(";",""));
        }

        System.out.println(Joiner.on(",").join(result));
    }
}
