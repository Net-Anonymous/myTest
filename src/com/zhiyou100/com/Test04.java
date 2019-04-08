package com.zhiyou100.com;

/**
 * @author 戎码岁月(微信 : Net - Anonymous)
 * @date 2019/4/6 - 23:47
 */
public class Test04 {

    public static void main(String[] args) {

        System.out.println("args = [" + args + "]");
        System.out.println("Test04.main");

        int var =10;
        int var1 = 11;
        System.out.println("var = " + var);

        System.out.println(var1);
        
        String[] arr = new  String[]{"Tomg","Asrg","asg"};
       /* for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }*/

        for (String s : arr) {
            System.out.println(s);
        }
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }

    }
}
