package com.sanmu.myXiaoMi.string;

import java.util.ArrayList;
import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author yansen
 * @create 2018-11-27 10:31
 **/
public class Solution {
    public static List<String> fullJustify(String[] words, int maxWidth) {

        ArrayList<String> result = new ArrayList<String>();

        int index = 0;

        while(index < words.length){

            int start = index;
            int length = 0;

            for(int i = words[index].length(); i <= maxWidth; i += words[index].length() ){
                length += words[index].length();
                i++;
                index++;
                if(index == words.length){
                    break;
                }
            }

            StringBuilder builder = new StringBuilder();

            if(index == words.length){
                for(int i = start; i < index - 1; i++){
                    builder.append(words[i]);
                    builder.append(" ");
                }
                builder.append(words[index - 1]);
                while(builder.length() < maxWidth){
                    builder.append(" ");
                }
            }else{
                int nums = 1;
                if(index - start - 1 > 0){
                    nums = (maxWidth - length) / (index - start - 1);
                    int temp = (maxWidth - length) % (index - start - 1);
                    for(int i = start; i < index; i++){
                        builder.append(words[i]);
                        for(int j = 0; j < nums; j++){
                            builder.append(" ");
                        }
                    }
                    if(temp-- > 0){
                        builder.append(" ");
                    }
                    builder.append(words[index - 1]);
                }else{
                    builder.append(words[start]);
                    while(builder.length() < maxWidth){
                        builder.append(" ");
                    }
                }
            }
           result.add(builder.toString());
        }

        for(String str : result){
            System.out.println(str);
        }

        return result;

    }

    public static void main(String[] args) {
        String[] words = new String[]{"This", "is", "an", "example", "of", "text", "justification."};

        System.out.println(fullJustify(words,16));

//        "[\"This    is    an\",\"example  of  text\",\"justification.  \"]"
//        "[\"This    is    an\",\"example  of text\",\"justification.  \"]"
    }
}
