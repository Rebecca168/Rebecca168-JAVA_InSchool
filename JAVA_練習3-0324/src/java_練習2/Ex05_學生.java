/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_練習2;

/**
 *
 * @author user
 */
public class Ex05_學生 {
    public static String name;
    public static int eng;
    public static int math;
    
    public static void set(){
        System.out.println("set");
        eng = 100;
        math= 92;
        name= "Charlie";
    }
    
    public static void show(){
        System.out.println("name: " + name);
        System.out.println("eng: " + eng);
        System.out.println("math: " + math);
        System.out.println("total: " + 工具.加總(eng, math));
    }
    
}
