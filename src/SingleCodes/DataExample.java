package SingleCodes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataExample {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");

        Date now = new Date();
        Date x1 = new Date(System.currentTimeMillis());

        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date y1 = sdf1.parse("25/12/2020");
        Date y2 = sdf2.parse("25/11/2020 21:44:07");

        System.out.println(sdf2.format(y1));
        System.out.println(sdf2.format(y2));
        System.out.println(now);
        System.out.println(x1);
    }
}
