﻿import java.util.Scanner;

public class Main{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String[] arr = a.split("");
        for(int i=0; i<arr.length; i++){
            System.out.println("'"+arr[i]+"'");
        }
    }
}
