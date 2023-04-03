import javax.swing.*;
import java.awt.*;

public class ViewInfo {


    JFrame frame = new JFrame();
    JLabel label = new JLabel("Hello");
    JButton View = new JButton("View");
    JButton Clear = new JButton("CLear");
    ViewInfo(){

        label.setBounds(9,0,100,50);
        label.setFont(new Font(null, Font.BOLD, 24));

        frame.add(label);
//frame
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setLocation(700,620);
        frame.add(View);
        frame.add(Clear);
    }
}
