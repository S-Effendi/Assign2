/**
 * Created by Sulaiman Samaai on 2017/03/18.
 */
public class Assign2 {

    public static float subtract(float x, float y)
    {
        float c = x - y;

        return c;
    }

    public static int addition(int x, int y)
    {
        int c = x + y;

        return c;
    }

    public static String equality(String obj1, String obj2)
    {

        obj1 = "Hi";
        obj2 = "Bye";

        obj2 = obj1;

        return obj1;
    }

    public static String nonEquality(String obj1, String obj2)
    {

        obj1 = "Hi";
        obj2 = "Bye";

        return obj2;
    }

    public static boolean trueOrFalse(int x) {

        if (x == 7) {

            return true;
        }
        else

            return false;
        }

    public static String nullification()
    {
        String zan;
        zan = null;

        return zan;
    }

    public static String nonNullification()
    {
        String zan;
        zan = "Hello Zany";

        return zan;
    }

    public static void failure()
    {
        System.out.println("System failure");
        failure();

        System.out.println("System succession");
    }

    public static void timeout()
    {
        int x = 1;
        while(x < 30001){
            System.out.println(x);
            x++;
        }
    }



}
