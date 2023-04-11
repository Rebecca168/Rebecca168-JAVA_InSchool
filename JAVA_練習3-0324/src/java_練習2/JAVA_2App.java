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
public class JAVA_2App {
    
    public static void main(String[] args) {
       JAVA_練習2_3_24評語.顯示note();
        JAVA_練習2_3_24評語.設定初值();
    
        java_練習2.JAVA_練習2_3_24評語.修改資料();
         java_練習2.JAVA_練習2_3_24評語.顯示資料();
         
         java_練習2.JAVA_練習2_3_24評語.評語();
     
        //JAVA_練習2_2_24亂數.跑流程();
        
        int eng;
        eng = 工具.輸入整數("請輸入英文成績: ");
        System.out.println("eng" + eng);
        
        int math;
        math =  工具.輸入整數("請輸入數學成績: ");
        System.out.println("math" + math);
    }

    
}
