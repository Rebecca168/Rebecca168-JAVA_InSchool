/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package java_練習2;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class 工具 {
    
    public static Scanner sc = new Scanner(System.in);
    
    public static int 輸入整數(String 訊息){
        System.out.println(訊息);
        int x;
        x = sc.nextInt();
        return x ;
    }
   
    public static int 加總(int x, int y ){
        int z;
        z = x +y;
        return z;
    }
      public static int 平均(int x, int y ){
        int avg;
        avg = (x +y)/2;
        return avg;
    }
}
