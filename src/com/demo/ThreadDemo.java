package com.demo;

public class ThreadDemo{
    public static void main(String[] args) {
        String email = args[0];
        if(Validotr.isEmail(email)){
            System.out.println("地址正确");
        }else {
            System.out.println("地址错误");
        }
    }

}

class Validotr{
    private Validotr(){}
    public static boolean isEmail(String email){
        if(email == null || "".equals(email)){
           return false;
        }
        String rex = "\\w+@\\w+\\.\\w+";
        return email.matches(rex);

    }

}