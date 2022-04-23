package Utils;

import java.util.Random;

public class RandomUsername {
    Random rand = new Random();


    public String randomUsername(){
        return "JennieeRuby" +  + rand.nextInt(1000);

    }
}
