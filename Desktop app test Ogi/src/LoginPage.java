import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
public class LoginPage {


    JFrame frame = new JFrame("LoginPage");


    JLabel email = new JLabel("Ievadi e-pastu");
    JTextField emailinput = new JTextField();
    JLabel password = new JLabel("Ievadi paroli");
    JPasswordField passwordinput = new JPasswordField();

    JButton Register = new JButton("Register");
    JButton Logon = new JButton("Logon");

    LoginPage(){

        Register.setBounds(10,10,100,20);
        Register.setFocusable(false);
        Register.setBackground(Color.YELLOW);

        Logon.setBounds(100,230,200,40);
        Logon.setFocusable(false);

        email.setBounds(100,100,200,20);
        emailinput.setBounds(100,120,200,20);
        password.setBounds(100,140,200,20);
        passwordinput.setBounds(100,160,200,20);
//Adding to frame

        frame.add(email);
        frame.add(emailinput);
        frame.add(password);
        frame.add(passwordinput);
        frame.add(Logon);
        frame.add(Register);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setLocation(200,200);
        frame.setResizable(false);
        frame.getContentPane().setBackground(Color.GRAY);


        Logon.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new LaunchPage();
                frame.dispose();
            }

        });

 //Reģistrācija
        Register.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new UserRegistration();

            }
        });

    }

}
