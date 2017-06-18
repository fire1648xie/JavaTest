import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by Oli on 2017/6/18.for Test1
 */
public class Hello {
    public static void main(String args[])
    {
        Hello h = new Hello();
        h.test();
    }
    private void test()
    {
        System.out.println("Hello there, im back");
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        System.out.println(sdf.format(cal.getTime()));
        System.out.println("What should I do?");
    }
}
