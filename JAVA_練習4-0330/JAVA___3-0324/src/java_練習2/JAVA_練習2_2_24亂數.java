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
public class JAVA_練習2_2_24亂數 {
    
  //public static double r;
//public static int egg;
    public static void main(String[] args) {
        // TODO code application logic here
      顯示結果();
      跑流程();
    }
 public static double r;
 public static int eng; 
 public static void 設定初值(){
     r = Math.random(); // 0.0 <=Math.random() < 1.0
 }
 
 public static void 顯示結果(){
     System.out.println("亂數" + r);
 }

 
  public static void 產生英文成績(){
      //eng = (int)(Math.random() * 100.0);
      eng = (int)(r *101.0);
  }
  
   public static void 顯示英文成績(){
      System.out.println("英文成績" + eng);  
   }
  
  public static void 跑流程(){
      設定初值();
      顯示結果();
      產生英文成績();
      顯示英文成績();
  }
  

}





