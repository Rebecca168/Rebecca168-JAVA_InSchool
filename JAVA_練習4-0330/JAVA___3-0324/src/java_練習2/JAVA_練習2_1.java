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
public class JAVA_練習2_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
 public static String Name;
 public static int eng;
  public static int math;
    
    public static void 顯示note(){
         System.out.println("Hello! Hello! Hello!Charlie");
    }
     
     public static void 設定初值()  {
         System.out.println("---設定初值---");
         Name = "未命名";
         eng = 0;
         math = 0;
         
        
    }
     public static void 顯示資料(){
         System.out.println("------------顯示資料----------");
         System.out.println (Name);
         System.out.println(eng);
         System.out.println(math);
     }
     
     public static void 修改資料() {
         System.out.println("------修改資料---------");
         Name = "Charlie";
         eng = 100;
         math = 99;
     }
}
