package com.company;

public class SeparateString {
    public String[] separation(String stroka, int znak) {


        String str1 = stroka.substring(0, znak);
        ++znak;
        String str2 = stroka.substring(znak);
        try {
            int startStr1 = str1.indexOf("\"");
            int endStr1 = str1.lastIndexOf("\"");
            int startStr2 = str2.indexOf("\"");
            int endStr2 = str2.lastIndexOf("\"");
            str1 = str1.substring(++startStr1, endStr1);
            str2 = str2.substring(++startStr2, endStr2);
            if (!str1.isEmpty() && !str2.isEmpty()){
            String[]  arr = {str1, str2};
            return arr;}
            else throw new Exception("Пустая строка.");
        }

    catch (Exception var222){
        System.out.println("Некорректный ввод. "+ var222.getMessage());
        String[]  arr = {""};
        return arr;

    }

    }
}
