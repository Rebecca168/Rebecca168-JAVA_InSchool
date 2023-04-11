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
public class Account_test {
    
    // not finished - 20230407

    public static void main(String[] args) {
        //宣告  物件變數
        Account a;
        Student b;
        
        // new 建立物件
        // = 設定給變數來代表它
        a =new Account();  // 有空間填資料
        a.name="Charlie";
        a.eng=100;
        a.math=92;
        
        a.show();  //執行show 的物件對象

        b =new Student();   
        b.name="Rebecca";
        b.math=99;
        b.eng=92;
        b.show();   //執行show 的物件對象
        
        Account x;
                x=new Account();
                x.提款();
    }
    
}
