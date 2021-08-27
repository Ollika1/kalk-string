package com.company;

public class Subtraction {
    public void subtract (String str1, String str2){

        try {
            if (str1.length() <= 10 && str2.length() <= 10) {
                 str1 = str1.replace(str2, "");

            System.out.println("\"" + str1 + "\"");}
            else throw new Exception("Строка длиннее 10 символов.");

        }
        catch (Exception var46){
            System.out.println("Некорректный ввод. " + var46.getMessage());
        }
    }
}
