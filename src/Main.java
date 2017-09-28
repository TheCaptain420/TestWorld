import java.util.Scanner;
import java.util.*;

import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {
        int[] terning={0,1,2,3,4,5,6};
        double random;
        int randomINT;

        double total = 0;

        int k =0;
        while (k<20) {

            Scanner input = new Scanner(System.in);
            System.out.print("Press enter to roll dice:");
            String deadLine = input.nextLine();

            random =((int)6*Math.random()+1);
            randomINT = (int)random;
            System.out.println(terning[randomINT]);

            //bruger det til at udregne gennemsnit(for at sikre mig om det virker:)
            total += terning[randomINT];

            k++;
        }

        System.out.println("Gennemsnit: "+(total/20) );
    }
}
