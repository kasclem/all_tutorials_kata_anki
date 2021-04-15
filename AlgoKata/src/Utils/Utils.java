package Utils;

import java.util.Random;

public class Utils {
    static Random r = new Random();
    public static int randInt(int startInclu, int endExclu){
        int result = Utils.r.nextInt(endExclu - startInclu) + startInclu;
        return result;
    }

    public static void expect(boolean value, String msg) throws Exception {
        if(value) throw new Exception(msg);
    }
}
