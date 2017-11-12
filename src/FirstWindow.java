import javax.swing.*;

public class FirstWindow extends JFrame {
    public FirstWindow(){
        //Er overskriften
        super("Your computer has a virus");

        //Bestemmer størrelsen på window
        setSize(600,400);

        //gør at man ikke kan lukke viduet..
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);

        //Gør at man kan lukke viduet
       // setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //Laver et "panel", hvor man kan have eks. knapper og lign.
        JPanel p = new JPanel();

        //Laver ny knap + Hvad knappen skal hedde
        JButton b1= new JButton("Knap 1");
        JButton b2= new JButton("Knap 2");

        //tilføjer knapper til jpanel
        p.add(b1);
        p.add(b2);

        //tilføjer JPanel til JFrame
        add(p);


    }

}
