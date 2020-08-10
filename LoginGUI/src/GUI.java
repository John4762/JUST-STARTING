import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {

    private static JFrame frame;
    private static JPanel panel;
    private static JLabel userlabel;
    private static JTextField userText;
    private static JLabel pswdlabel;
    private static JPasswordField pswdText;
    private static JButton button;
    private static JLabel success;
    
    public static void main(String[] args) {

        frame = new JFrame();
        panel = new JPanel();
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(panel);

        panel.setLayout(null);
        userlabel = new JLabel("User");
        userlabel.setBounds(10,20,80,25);
        panel.add(userlabel);
        userText = new JTextField(20);
        userText.setBounds(100,20,165,25);
        panel.add(userText);

        pswdlabel = new JLabel("Password");
        pswdlabel.setBounds(10,50,80,25);
        panel.add(pswdlabel);
        pswdText = new JPasswordField();
        pswdText.setBounds(100,50,165,25);
        panel.add(pswdText);

        button= new JButton("Login");
        button.setBounds(150,100,80,25);
        panel.add(button);
        button.addActionListener(new GUI());
        success = new JLabel("");
        success.setBounds(10,130,300,25);
        panel.add(success);





        frame.setVisible(true);



    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String user = userText.getText();
        String pswd = pswdText.getText();

        if (user.equals("John") && pswd.equals("CuteDoggo987")) {
            success.setText("Login Successful!!");
        } else {

            success.setText("Login Failed\n\n Please Try Again");

        }

    }
}
