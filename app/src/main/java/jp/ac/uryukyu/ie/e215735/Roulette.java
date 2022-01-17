package jp.ac.uryukyu.ie.e215735;
import java.util.Random;
public class Roulette {
    private int bullet;
    Roulette(){
    
       Random rnd = new Random();
       this.bullet = rnd.nextInt(6);/*銃には六発の弾丸を込めることができ、
<<<<<<< HEAD
                                    その中のランダムな場所に弾を込める*/
    }
    public int getBullet(){
        return this.bullet;
    }


=======
                                     その中のランダムな場所に弾を込める*/
        return this.bullet;    
    }
>>>>>>> 3f312ceece4c417a6c919c2c81feaa7bfd5d531b
}
    

