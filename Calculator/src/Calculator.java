
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {


    public static JFrame frame;
    public static JPanel panel;
    public static JButton b1;
    public static JButton b2;
    public static JButton b3;
    public static JButton b4;
    public static JButton b5;
    public static JButton b6;
    public static JButton b7;
    public static JButton b8;
    public static JButton b9;
    public static JButton b0;
    public static JButton badd;
    public static JButton bsub;
    public static JButton bmult;
    public static JButton bdiv;
    public static JButton bmod;
    public static JButton beq;
    public static JTextField text;



    public  static void buttons(){
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        b0 = new JButton("0");
        badd = new JButton("+");
        bsub = new JButton("-");
        bmult = new JButton("*");
        bdiv = new JButton("/");
        bmod = new JButton("%");
        beq = new JButton("=");

        b1.setBounds(70,120,50,30);
        b1.setBackground(Color.RED);
        panel.add(b1);

        b2.setBounds(120,120,50,30);
        b2.setBackground(Color.RED);
        panel.add(b2);

        b3.setBounds(170,120,50,30);
        b3.setBackground(Color.RED);
        panel.add(b3);

        b4.setBounds(70,170,50,30);
        b4.setBackground(Color.RED);
        panel.add(b4);

        b5.setBounds(120,170,50,30);
        b5.setBackground(Color.RED);
        panel.add(b5);

        b6.setBounds(170,170,50,30);
        b6.setBackground(Color.RED);
        panel.add(b6);

        b7.setBounds(70,220,50,30);
        b7.setBackground(Color.RED);
        panel.add(b7);

        b8.setBounds(120,220,50,30);
        b8.setBackground(Color.RED);
        panel.add(b8);

        b9.setBounds(170,220,50,30);
        b9.setBackground(Color.RED);
        panel.add(b9);

        badd.setBounds(70,270,50,30);
        badd.setBackground(Color.RED);
        panel.add(badd);

        b0.setBounds(120,270,50,30);
        b0.setBackground(Color.RED);
        panel.add(b0);

        bsub.setBounds(170,270,50,30);
        bsub.setBackground(Color.RED);
        panel.add(bsub);

        bmult.setBounds(220,120,50,30);
        bmult.setBackground(Color.RED);
        panel.add(bmult);

        bdiv.setBounds(220,170,50,30);
        bdiv.setBackground(Color.RED);
        panel.add(bdiv);

        bmod.setBounds(220,220,50,30);
        bmod.setBackground(Color.RED);
        panel.add(bmod);

        beq.setBounds(220,270,50,30);
        beq.setBackground(Color.RED);
        panel.add(beq);

    }

    public static void main(String[] args) {

        Calculator c = new Calculator();

        frame = new JFrame();
        frame.setSize(400,500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Calculator");



        panel = new JPanel();
        frame.add(panel);
        panel.setBounds(20,20,400,300);
        panel.setBackground(Color.LIGHT_GRAY);
        panel.setBorder(BorderFactory.createLineBorder(Color.RED));


        buttons();


        text = new JTextField("");
        text.setBackground(Color.cyan);
        text.setBounds(20, 20, 300, 70);
        panel.add(text);




        b1.addActionListener(c);
        b2.addActionListener(c);
        b3.addActionListener(c);
        b4.addActionListener(c);
        b5.addActionListener(c);
        b6.addActionListener(c);
        b7.addActionListener(c);
        b8.addActionListener(c);
        b9.addActionListener(c);
        b0.addActionListener(c);
        badd.addActionListener(c);
        bsub.addActionListener(c);
        bmult.addActionListener(c);
        bdiv.addActionListener(c);
        bmod.addActionListener(c);

    }



    @Override

        public void actionPerformed(ActionEvent e) {

            if (e.getSource()==b1)
                text.setText("1");
        }

    }





