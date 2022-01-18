package jp.ac.uryukyu.ie.e215735;
import java.util.Random;
public class Roulette {
    boolean test;
    private int bullet;
    Roulette(){
       Random rnd = new Random();
       this.bullet = rnd.nextInt(6);/*銃には六発の弾丸を込めることができ、
                                    その中のランダムな場所に弾を込める*/
        if(this.bullet<6){
            test=true;
        }
    }
    public boolean getTest(){
        return this.test;
    }
    public int getBullet(){
        return this.bullet;
    }
  
}    


    

