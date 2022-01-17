package jp.ac.uryukyu.ie.e215735;
import java.util.Scanner;
public class Person extends Roulette{
    void Pleyer(){
        int gan[] = {0,1,2,3,4,5};
        for(int i:gan ){
            Scanner sc = new Scanner(System.in);
            System.out.println("打つなら1を、打たないなら2を入力してください。");
            int num = sc.nextInt();
            
            if(num==1){
                if(Revolver()==i){
                    System.out.println("死にました。");
                    break;
                }
                if(Revolver()!=i){
                    System.out.println("大丈夫でした。");
                    continue;
                }    
            }
            if(num==2){
                break;
            }
        }

    }
}
