package com.company;

public class Addiction {
    public void addict(String str1, String str2) {
       try {
           if (str1.length() <= 10 && str2.length() <= 10) {
               System.out.println("\"" + str1 + str2 + "\"");
           } else throw new Exception("Строка длиннее 10 знаков.");
       }
       catch (Exception var65){
           System.out.println("Некорректный ввод. "+ var65.getMessage());

        }
    }
}