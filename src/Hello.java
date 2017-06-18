import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by Oli on 2017/6/18.
 */
public class Hello {
    public static void main(String args[])
    {
        System.out.println("Hello there, im back");
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        System.out.println(sdf.format(cal.getTime()));
    }

}
