package jp.ac.uryukyu.ie.e215735;
import java.util.Scanner;
public class Person {
    int money;
    boolean test;
    void Pleyer(){
        money = 1000;
        int gan[] = {0,1,2,3,4,5};
        Roulette a = new Roulette();
        for(int s:gan ){
            Scanner sc = new Scanner(System.in);
            System.out.println("打つなら1を、打たないなら2を入力してください。");
            int num = sc.nextInt();
    
            if(num==1){
                if(a.getBullet()==s){
                    System.out.println("死にました。");
                    System.out.println(a.getBullet());
                    test = true;
                    break;
                }else{
                
                    System.out.println("大丈夫でした。");
                    money*=10;
                    System.out.println("今のお金は"+money+"円です。");
                }
            }
            if(num==2){
                System.out.println(money+"円ゲット");
                break;
            }
        }
        
    }
    
    void Employee(){
        System.out.println("ようこそロシアンルーレット会場へ");
        System.out.println("ここでは銃を一発打つごとに賭け金が10倍になっていきます");
        System.out.println("打たない選択をとるとその時のお金を全て得ることができます");
        System.out.println("");
    }
}
