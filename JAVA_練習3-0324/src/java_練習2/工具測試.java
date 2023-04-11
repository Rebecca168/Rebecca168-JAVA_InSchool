/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_練習2;

import static java_練習2.工具.sc;

/**
 *
 * @author user
 */

public class 工具測試 {

    public static void main(String[] args) {
        //測試輸入();
        測試加總();
 
    }
   
  public static void 測試輸入(){
        int eng;
        eng = 工具.輸入整數("請輸入英文成績: ");
        System.out.println("eng: " + eng);
        
        int math;
        math =  工具.輸入整數("請輸入數學成績: ");
        System.out.println("math: " + math);
  }
 
    
  public static void 測試加總(){
      int 結果;
      結果 = 工具.加總(93, 99);
      if (結果==192) {
          System.out.println("測試加總 成功 - Test total - OK");
          
      } else {
          System.out.println("測試加總 失敗 - Test total - X");
      }
  }
}
