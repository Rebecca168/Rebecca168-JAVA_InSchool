/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// 自我挑戰: 使用亂數 產生英文與數學成績, 計算總分與平均,最後顯示評語
// 自我挑戰: 銀行帳戶
// 變數
//-帳戶名稱
//-帳戶餘額
//功能
//(1) 設定初始餘額5000
//(2) 存款
//(3) 提款
//(4) 顯示帳戶資訊
package java_練習2;

/**
 *
 * @author user
 */
public class JAVA_練習2_4_24銀行 {
    
     public static void main(String[] args) {
        // TODO code application logic here
    顯示帳戶名稱();
    跑帳戶資訊();
          
     }

public static String Account_name;
public static int Account_balance;
public static int x;
public static int sum1;
public static int sum2;
public static int sum3;


public static void 設定初值(){
System.out.println("------設定初值--------");
       Account_name ="待輸入 ";
       Account_balance =x+sum1+sum2+sum3;
       x=0;
       sum1=x+0;
       sum2=sum1+0;
       sum3=sum2+0;
       
               
       
}

    public static void 顯示帳戶名稱() {
        System.out.println("------顯示帳戶名稱--------");
        System.out.println(Account_name);
        System.out.println(Account_balance);
        System.out.println(sum1);
    System.out.println(sum2);
    System.out.println(sum3);  
    
    }

    public static void 修改資料() {
        System.out.println("------修改資料--------");
        Account_name= "CHARLIE";
        Account_balance=x+sum1+sum2+sum3;
        x=500;
        sum1=x+0;
        sum2=sum1+250;
        sum3= sum2+250;
                
                
 
    }
    
    public static void 跑帳戶資訊() {
       
        
    }
    
}
