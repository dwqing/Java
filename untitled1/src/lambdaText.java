import javax.swing.*;
import java.util.Arrays;
import java.util.Date;

public class lambdaText {
    public static void main(String[] args) {
        var planets = new String[]{"Mercury","Mats","Venus","Jupiter","Saturn"
                ,"Uranus"};
        System.out.println(Arrays.toString(planets));
        System.out.println("Sorted in dictionary order:");
        Arrays.sort(planets);
        System.out.println(Arrays.toString(planets));
        System.out.println("Sorted by length");
        Arrays.sort(planets,(first , second) ->first.length()-
                second.length());

        var timer = new Timer(1000, event -> System.out.println("The time  is "+ new Date()));
        timer.start();

        JOptionPane.showMessageDialog(null,"Quit program");
        System.exit(0);

    }
}
