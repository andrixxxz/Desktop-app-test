import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LaunchPage implements ActionListener {
    JFrame frame = new JFrame("Reģistrācijas sistēma");

    JButton Register = new JButton("Register");
    JButton View = new JButton("View");

    LaunchPage(){

        Register.setBounds(100,60,200,40);
        Register.setFocusable(false);
        Register.addActionListener(this);

        View.setBounds(100,160,200,40);
        View.setFocusable(false);
        View.addActionListener(this);


        frame.add(View);
        frame.add(Register);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setLocation(200,200);
        frame.setResizable(false);



    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==Register){
            Register RegisterWindow = new Register();
        } else if (e.getSource()==View) {
            View Viewinfo = new View();

        }
    }




}
