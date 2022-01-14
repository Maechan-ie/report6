package jp.ac.uryukyu.ie.e215735;
import java.util.Random;
public class Roulette {
    int bullet;
    int Revolver(){
       Random rnd = new Random();
       this.bullet = rnd.nextInt(6);/*銃には六発の弾丸を込めることができ、
                                     その中のランダムな場所に弾を込める*/
        return this.bullet;    
    }
}
    

