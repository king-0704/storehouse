package xc.dq;

import java.util.Scanner;

public class demo14 {
    //判断密码是否大于六位
    //字符串求长度 是方法 length()
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名");
        String name=scanner.next();
        System.out.println("请输入密码：");
        String password=scanner.next();
        if (password.length()>=6){
            System.out.println("密码长度符合要求");
        }else{
            System.out.println("密码的长度不符合要求");
        }
        System.out.println("密码的长度为："+password.length());
        //数组 属性
        int[]a=new int[5];
        System.out.println(a.length);

    }
}
