package com.sanmu.myXiaoMi;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ${DESCRIPTION}
 *
 * @author yansen
 * @create 2018-07-13 15:06
 **/
public class A {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        List<Map> jsonList = new ArrayList<>();
        Map<String,Object> map = new HashMap<>();
        map.put("group","股氯气");
        Map<String,Object> map1 = new HashMap<>();
        map1.put("k","12345");
        map1.put("v","456987");
        map.put("params", Lists.newArrayList(map1));
        jsonList.add(map);
        sb.append("<table cellpadding=\"0\" cellspacing=\"1\" width=\"100%\" border=\"1\" class=\"Ptable\">\n");
        sb.append("    <tbody>\n");
        for(Map m1:jsonList) {
            sb.append("        <tr>\n");
            sb.append("            <th class=\"tdTitle\" colspan=\"2\">"+m1.get("group")+"</th>\n");
            sb.append("        </tr>\n");
            List<Map> list2 = (List<Map>) m1.get("params");
            for(Map m2:list2) {
                sb.append("        <tr>\n");
                sb.append("            <td class=\"tdTitle\">"+m2.get("k")+"</td>\n");
                sb.append("            <td>"+m2.get("v")+"</td>\n");
                sb.append("        </tr>\n");
            }
        }
        sb.append("    </tbody>\n");
        sb.append("</table>");
        System.out.println(sb.toString());
    }
}
