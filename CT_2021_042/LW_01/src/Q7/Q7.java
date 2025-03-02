package Q7;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Q7 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        Date today = new Date();
        System.out.println(today);
        System.out.println();

        SimpleDateFormat D1 = new SimpleDateFormat("hh:mm:ss a");
        System.out.println(D1.format(today));

        frame.setTitle(D1.format(today));
    }
}
