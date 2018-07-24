package com.sanmu.myXiaoMi;

import com.google.common.collect.Lists;
import jxl.Cell;
import jxl.CellType;
import jxl.Sheet;
import jxl.Workbook;

import jxl.write.Label;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author yansen
 * @create 2017-10-24 12:07
 **/
public class Excel {
    public static void main(String args[]) throws Exception {

        jxl.Workbook readwb = null;
        InputStream instream = new FileInputStream("E:/GDP1.xls");

        readwb = Workbook.getWorkbook(instream);

        List<GDP> list = Lists.newArrayList();

        //Sheet的下标是从0开始

        //获取第一张Sheet表

        Sheet readsheet = readwb.getSheet(0);

        //获取Sheet表中所包含的总列数

        int rsColumns = readsheet.getColumns();

        //获取Sheet表中所包含的总行数

        int rsRows = readsheet.getRows();

        //获取指定单元格的对象引用

        for (int i = 1; i < rsRows; i++)
        {
            GDP gdp = new GDP();

            Cell cell = readsheet.getCell(1, i);
            if(cell != null && cell.getContents() != null && String.valueOf(cell.getContents()) != "null" && StringUtils.isNotEmpty(String.valueOf(cell.getContents()))){
                gdp.setRegionName(String.valueOf(cell.getContents()));
                continue;
            }
            Cell cell1 = readsheet.getCell(2, i);
            if(cell1 != null && cell1.getContents() != null && String.valueOf(cell1.getContents()) != "null"&& isNumber(String.valueOf(cell1.getContents())) &&StringUtils.isNotEmpty(String.valueOf(cell1.getContents()))){
                gdp.setAvgGdp(new BigDecimal(String.valueOf(cell1.getContents())));
            }else{
                gdp.setAvgGdp(null);
            }
            Cell cell2 = readsheet.getCell(3, i);
            if(cell2 != null && cell2.getContents() != null && String.valueOf(cell2.getContents()) != "null" && isNumber(String.valueOf(cell2.getContents())) &&StringUtils.isNotEmpty(String.valueOf(cell2.getContents()))){
                gdp.setAvgPer(new BigDecimal(String.valueOf(cell2.getContents())));
            }else{
                gdp.setAvgPer(null);
            }
            Cell cell3 = readsheet.getCell(4, i);
            if(cell3 != null && cell3.getContents() != null && String.valueOf(cell3.getContents()) != "null"&& StringUtils.isNotEmpty(String.valueOf(cell3.getContents()))){

                gdp.setPerNum(new BigDecimal(String.valueOf(cell3.getContents())));
            }else{
                gdp.setPerNum(null);
            }
            Cell cell4 = readsheet.getCell(5, i);
            if(cell4 != null && cell4.getContents() != null && String.valueOf(cell4.getContents()) != "null"&& isNumber(String.valueOf(cell4.getContents())) && StringUtils.isNotEmpty(String.valueOf(cell4.getContents()))){
                gdp.setSquerKil(new BigDecimal(String.valueOf(cell4.getContents())));
            }else{
                gdp.setSquerKil(null);
            }
            Cell cell5 = readsheet.getCell(6, i);
            if(cell5 != null && cell5.getContents() != null && String.valueOf(cell5.getContents()) != "null"&& StringUtils.isNotEmpty(String.valueOf(cell5.getContents()))){
                gdp.setGdp(new BigDecimal(String.valueOf(cell5.getContents())));
            }else{
                gdp.setGdp(null);
            }
            list.add(gdp);
        }

        System.out.println(list);

//        //利用已经创建的Excel工作薄,创建新的可写入的Excel工作薄
//
//        jxl.write.WritableWorkbook wwb = Workbook.createWorkbook(new File(
//
//                "F:/红楼人物1.xls"), readwb);
//
//        //读取第一张工作表
//
//        jxl.write.WritableSheet ws = wwb.getSheet(0);
//
//        //获得第一个单元格对象
//
//        jxl.write.WritableCell wc = ws.getWritableCell(0, 0);
//
//        //判断单元格的类型, 做出相应的转化
//
//        if (wc.getType() == CellType.LABEL)
//
//        {
//
//            Label l = (Label) wc;
//
//            l.setString("新姓名");
//
//        }
//
//        //写入Excel对象
//
//        wwb.write();

//        wwb.close();
        readwb.close();
}

    public static boolean isNumber(String number) {
        int index = number.indexOf(".");
        if (index < 0) {
            return StringUtils.isNumeric(number);
        } else {
            String num1 = number.substring(0, index);
            String num2 = number.substring(index + 1);

            return StringUtils.isNumeric(num1) && StringUtils.isNumeric(num2);
        }
    }
}
