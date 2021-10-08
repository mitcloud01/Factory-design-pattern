package com.phone;

import java.util.Scanner;

public class MyPhone {
    public static void main(String[] args) {

        Factory MyOS = new Factory();
        String OSName;
        Scanner sc = new Scanner(System.in);
        System.out.print("Which OS do you want to install : ");
        OSName = sc.next().toLowerCase();

        OS obj = MyOS.get(OSName);
        obj.future();
        obj.security();
        obj.availableApps();
        obj.cost();

        sc.close();
    }
}
