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

// 續看 YouTube----JAVA-20230331_5 6:00

public class Student {
    //物件變數(沒有Static)
    public String name;
    public  int eng;
    public  int math;
    
    //物件方法(沒有Static)
    public void show(){
        System.out.println("name: " + this.name );
        System.out.println("eng: " + this.eng );
        System.out.println("math: " + this.math );
        System.out.println("total: " + 工具.加總(this.eng, this.math));
        System.out.println("avg: " + 工具.平均(this.eng, this.math));
        System.out.println("-------------------------");
    }
        public void set(){
        System.out.println("set");
        eng = 100;
        math= 92;
        name= "Charlie";
    }
}
