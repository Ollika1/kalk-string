package com.company;

public class Division {
    public void division(String str1, String str2){

        int k = str1.length() ;
        try {  int n = Integer.parseInt(str2);
            if (n >= 1 && n <= 10 && k <= 10){

            int p = k / n;
            str1 = str1.substring(0, p);
            System.out.println("\"" +str1 + "\"");
        } else throw new Exception("Только строки до 10 символов и числа от 1 до 10.");

        }
        catch (Exception var78){
            System.out.println("Некорректный ввод. "+ var78.getMessage());

        }
    }
}
