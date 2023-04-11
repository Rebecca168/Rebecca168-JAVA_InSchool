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
public class JAVA_練習2_3_24評語 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        java_練習2.JAVA_練習2_3_24評語.修改資料();
         java_練習2.JAVA_練習2_3_24評語.顯示資料();
         
         java_練習2.JAVA_練習2_3_24評語.評語();
     
        JAVA_練習2_2_24亂數.跑流程();
        
    }
 public static String Name;
 public static int eng;
  public static int math;
  public static int total;
   public static double Avg;
   public static String 評語;
    public static double r;
    
    public static void 顯示note(){
         System.out.println("Hello! Hello! Hello!Charlie");
    }
     
     public static void 設定初值()  {
         System.out.println("---設定初值---");
         Name = "未命名";
         eng = 0;
         math = 0;
         total = 2;
         Avg = total / 2.0;
         評語 = 評語;
         r=Math.random();  // 0.0 <=math.random() < 1.0
        
    }
     public static void 顯示資料(){
         System.out.println("------------顯示資料----------");
         System.out.println (Name);
         System.out.println(eng);
         System.out.println(math);
         System.out.println("total");
         System.out.println(eng + math);
         System.out.println("Avg");
         System.out.println(total / 2.0);
          System.out.println(評語);
     }
     
     public static void 修改資料() {
         System.out.println("------修改資料---------");
         Name = "Charlie";
         eng = 92;
         math = 69;
         total = eng + math;
         Avg = total / 2.0;
         評語 = 評語;
     }
    
     public static void 評語(){
          System.out.println("------講評---------");
          if (Avg >= 90.0) {
              System.out.println("You are the best, 超棒");
         } 
          else if(Avg >= 80.0) {
              System.out.println("You are very good, 很棒");
         }
         else {
              System.out.println("You need to study hard, 請再加油");
          }
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
       System.out.println("------跑跑流程---------");
      設定初值();
      顯示結果();
      產生英文成績();
      顯示英文成績();
  }
}
