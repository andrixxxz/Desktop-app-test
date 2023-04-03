import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
public class LaunchPage implements ActionListener {
    JFrame frame = new JFrame("Aplikācija");

    JButton Register = new JButton("Reģistrēt pacientu");
    JButton View = new JButton("Apskatīt pacientus");
    JButton Exit = new JButton("Iziet");
    LaunchPage(){

        Register.setBounds(100,60,200,40);
        Register.setFocusable(false);
        Register.addActionListener(this);

        View.setBounds(100,160,200,40);
        View.setFocusable(false);
        View.addActionListener(this);

        Exit.setBounds(370,390,100,20);
        Exit.setFocusable(false);
        Exit.addActionListener(this);

        frame.add(View);
        frame.add(Register);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setLocation(200,200);
        frame.setResizable(false);
        frame.add(Exit);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==Register){
            Register RegisterWindow = new Register();
        } else if (e.getSource()==View) {
            ViewInfo Viewinfo = new ViewInfo();

        } else if (e.getSource()==Exit){
            System.exit(0);
        }


    }




}
