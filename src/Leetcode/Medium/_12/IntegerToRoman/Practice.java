package Leetcode.Medium._12.IntegerToRoman;

public class Practice {
    public String intToRoman(int num) {
        StringBuilder answer= new StringBuilder();
        while(num>0){
            if(num>=1000){
                num-=1000;
                answer.append("M");
            }else if(num>=900){
                num-=900;
                answer.append("CM");
            }else if(num>=500){
                num-=500;
                answer.append("D");
            }else if(num>=400){
                num-=400;
                answer.append("CD");
            }else if(num>=100){
                num-=100;
                answer.append("C");
            }else if(num>=90){
                num-=90;
                answer.append("XC");
            }else if(num>=50){
                num-=50;
                answer.append("L");
            }else if(num>=40){
                num-=40;
                answer.append("XL");
            }else if(num>=10){
                num-=10;
                answer.append("X");
            }else if(num>=9){
                num-=9;
                answer.append("IX");
            }else if(num>=5){
                num-=5;
                answer.append("V");
            }else if(num>=4){
                num-=4;
                answer.append("IV");
            }else{
                num-=1;
                answer.append("I");
            }
        }
        return answer.toString();

    }
    public static void main(String[] args){
        Practice instance = new Practice();
        int num = 1994;

        String result = instance.intToRoman(num);
        System.out.println("Result: " + result);    // Should be 'MCMXCIV'
    }
}
