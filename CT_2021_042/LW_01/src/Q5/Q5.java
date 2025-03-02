package Q5;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Q5 {
    public static void main(String[] args) {
        Date today = new Date();
        System.out.println(today);
        System.out.println();

        SimpleDateFormat D1 = new SimpleDateFormat("EEEE MMMM d yyyy");
        System.out.println(D1.format(today));

    }
}

