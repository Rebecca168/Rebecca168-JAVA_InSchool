package java_練習2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Guess_password {
    // 資料
    public static int 答;
    public static int guess;
   
    // 功能
    public static void 設答(){
        答=6;
    }
    public static void guess(){
        guess=(int)(Math.random()*10); //0~9
    }
  
    public static void 比對() {
        System.out.println("答 : " + 答);
        System.out.println("guess : " + guess);
        if (答 == guess) {
            System.out.println("------O--good guess-O----");
        } else {
            System.out.println("------X--guess wrong--X----");
        }
    }
     
    public static void 跑流程(){
        設答();
         guess();
         比對();
                 
    }
}
