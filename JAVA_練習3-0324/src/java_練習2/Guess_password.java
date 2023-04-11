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
    
    public static void main(String[] args) {
        Guess_password.跑流程();
    }
    // 資料
    public static int 答;
    public static int 答2;
    public static int guess;
    public static int guess2;
   
    // 功能
    public static void 設答(){
        答=1;
        答2=0;
    }
    public static void guess(){
        guess=(int)(Math.random()*3); //0~2
        guess2=(int)(Math.random()*3); //0~2
    }
  
    public static void 比對() {
        System.out.println("答 : " + 答);
        System.out.println("答2 : " + 答2);
        System.out.println("guess : " + guess);
        System.out.println("guess2 : " + guess2);
        
        if (答 == guess && 答2==guess2) {
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
