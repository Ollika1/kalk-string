package com.company;

public class Multiplication {
    public void multi (String str1, String str2){

    try {  int n = Integer.parseInt(str2);
        if (str1.length() <= 10 && n <= 10 && n >= 1){
        str1 = str1.repeat(n);
        if (str1.length() > 40) {
        System.out.printf("\"%.40s...\"" ,str1 );
        }
        else {
            System.out.println("\"" + str1 + "\"" );
        }
    } else throw new Exception("Только строки до 10 символов и числа от 1 до 10.");
    }
    catch (Exception var345){
        System.out.println("Некорректный ввод. " + var345.getMessage());
    }
    }
}
