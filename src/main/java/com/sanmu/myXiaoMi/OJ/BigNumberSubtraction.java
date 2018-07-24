package com.sanmu.myXiaoMi.OJ;

/**
 * ${DESCRIPTION}
 *
 * @author yansen
 * @create 2018-03-12 11:28
 **/
public class BigNumberSubtraction {
    public static void main(String[] args) {

        //System.out.println("1231231237812739878951331231231237812739878951331231231237812".length());
        System.out.println(solution("1231231237812739878951331231231237812739878951331231231237812739878951331231231237812739878951331231231237812739878951331231231237812739870 - 89513312312312378127398789513312312312378127398789513312312312378127398789513"));

    }

    public static String solution(String line){
        if(line != null && line.length() > 0){
            String[] list = line.split("-");
            if(list.length <= 1){
                return null;
            }
            String number1 = list[0].trim();
            String number2 = list[1].trim();

            boolean flag = false;
            for(int i = number1.length() - 1; i >= 0; i--){
                if('0' == number1.charAt(i)){
                    flag = true;
                }
                if(flag && number1.charAt(i) != '0'){
                    number1.substring(0,i + 1);
                }
            }

            for(int i = number2.length() - 1; i >= 0; i--){
                if('0' == number2.charAt(i)){
                    flag = true;
                }
                if(flag && number2.charAt(i) != '0'){
                    number2.substring(0,i + 1);
                }
            }

            int[] int1 = new int[number1.length()];
            int[] int2 = new int[number2.length()];


            for(int i = 0; i < number1.length(); i++){
                int1[i] = number1.charAt(i) - '0';
            }

            for(int i = 0; i < number2.length();i++){
                int2[i] = number2.charAt(i) - '0';
            }



            for(int i = int1.length - 1,j = 0; j < i; i--,j++){
                int temp = int1[i];
                int1[i] = int1[j];
                int1[j] = temp;
            }
            for(int i = int2.length - 1,j = 0; j < i; i--,j++){
                int temp = int2[i];
                int2[i] = int2[j];
                int2[j] = temp;
            }

            int[] length = int1.length > int2.length ? int2 : int1;

            int[] length1 = int1.length > int2.length ? int1 : int2;

            StringBuilder result = new StringBuilder();

            int jinwei = 0;
            int i = 0;
            for(; i < length.length; i++){
                int rNum = int1[i] - int2[i] - jinwei;
                jinwei = 0;
                if(rNum >= 0){
                    result.insert(0,rNum);
                }else if(rNum < 0){
                    result.insert(0,10 + rNum );
                    jinwei = 1;
                }
            }

            if(i < length1.length){
                result.insert(0,length1[i++] - jinwei );
            }

            for(;i < length1.length; i++){
                result.insert(0,length1[i] );
            }
            return result.toString();
        }
        return null;
    }
}
