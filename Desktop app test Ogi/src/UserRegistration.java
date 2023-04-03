import javax.swing.*;
import java.awt.*;

public class UserRegistration {

    JFrame frame = new JFrame("Lietotāja reģistrācija");

    JLabel label = new JLabel("Lūdzu ievadiet personas informāciju");
    JLabel label2 = new JLabel("Šeit");
    JLabel name = new JLabel("Vārds");
    JLabel surname = new JLabel("Uzvārds");
    JLabel email  = new JLabel("E-pasts");
    JLabel password = new JLabel("Parole");
    JTextField nameinput = new JTextField();
    JTextField surnameinput = new JTextField();
    JTextField emailinput = new JTextField();
    JPasswordField passwordinput = new JPasswordField();

    JButton saveButton = new JButton("Saglabāt");
    JButton cancelButton = new JButton("Aizvērt");



    UserRegistration(){

        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setLocation(700,200);
        frame.setResizable(false);

        label.setBounds(0,0,400,20);
        label.setFont(new Font(null,Font.PLAIN,20));
        label2.setBounds(10, 300, 400, 20);
        label2.setFont(new Font(null, Font.PLAIN, 20));
        frame.add(label);
        frame.add(label2);
// Lietotāja vards
        name.setFont(new Font(null,Font.ITALIC,15));
        name.setBounds(10,30,200,20);
        nameinput.setBounds(10,50,200,20);
// Lietotāja uzvārds
        surname.setFont(new Font(null,Font.ITALIC,15));
        surname.setBounds(10,70,200,20);
        surnameinput.setBounds(10,90,200,20);
// Lietotāja epasts
        email.setFont(new Font(null,Font.ITALIC,15));
        email.setBounds(10,110,200,20);
        emailinput.setBounds(10,130,200,20);
// Lietotāja parole
        password.setFont(new Font(null,Font.ITALIC,15));
        password.setBounds(10,150,200,20);
        passwordinput.setBounds(10,170,200,20);
//Addding to Frame
        frame.add(name);
        frame.add(nameinput);
        frame.add(surname);
        frame.add(surnameinput);
        frame.add(email);
        frame.add(emailinput);
        frame.add(password);
        frame.add(passwordinput);
        frame.add(saveButton);
        frame.add(cancelButton);
        cancelButton.setBounds(210,250,150,30);
        saveButton.setBounds(10, 250,200,30);
    }
}
