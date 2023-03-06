import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class Register {

    DBlogic DB = new DBlogic();


    JFrame frame = new JFrame("Dzīvnieka reģistrācija");

    JLabel label = new JLabel("Ievadiet informāciju par dzīvnieku!");
    JLabel label2 = new JLabel("Šeit");
    JLabel petNameLabel = new JLabel("Dzīvnieka vārds");
    JLabel petTypeLabel = new JLabel("Dzībnieka tips");
    JLabel petAgeLabel  = new JLabel("Dzīvnieka vecums");
    JLabel petIllnessLabel = new JLabel("Dzīvnieka simptomi");
    JTextField petNameInput = new JTextField();
    JTextField petTypeInput = new JTextField();
    JTextField petAgeInput = new JTextField();
    JTextField petIllnessInput = new JTextField();

    JButton saveButton = new JButton("Saglabāt");
    JButton cancelButton = new JButton("Aizvērt");

    Register(){



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
// Dzivnieka vards
        petNameLabel.setFont(new Font(null,Font.ITALIC,15));
        petNameLabel.setBounds(10,30,200,20);
        petNameInput.setBounds(10,50,200,20);
// Dzivnieka tips
        petTypeLabel.setFont(new Font(null,Font.ITALIC,15));
        petTypeLabel.setBounds(10,70,200,20);
        petTypeInput.setBounds(10,90,200,20);
// Dzivnieka gadi
        petAgeLabel.setFont(new Font(null,Font.ITALIC,15));
        petAgeLabel.setBounds(10,110,200,20);
        petAgeInput.setBounds(10,130,200,20);
// Dzivnieka simptomi
        petIllnessLabel.setFont(new Font(null,Font.ITALIC,15));
        petIllnessLabel.setBounds(10,150,200,20);
        petIllnessInput.setBounds(10,170,200,20);
//Addding to Frame
        frame.add(petNameInput);
        frame.add(petNameLabel);
        frame.add(petTypeInput);
        frame.add(petTypeLabel);
        frame.add(petAgeInput);
        frame.add(petIllnessInput);
        frame.add(petAgeLabel);
        frame.add(petIllnessLabel);
        frame.add(saveButton);
        frame.add(cancelButton);
        cancelButton.setBounds(210,250,150,30);
        saveButton.setBounds(10, 250,200,30);

 // Jauni mainīgie, kas nelielasās datubāzē ja tiek likti iekš insert funkcijas
//         String petname = petNameInput.getText();
//         String tips = petTypeInput.getText();
//         String age = petAgeInput.getText();
//         int age2 = Integer.parseInt(age);
//         String symptoms = petIllnessInput.getText();


         saveButton.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 try {
                     DB.insert2(petNameInput.getText(),petTypeInput.getText(),petAgeInput.getText(),petIllnessInput.getText());
                 } catch (SQLException ex) {
                     throw new RuntimeException(ex);
                 }
                 label2.setText("Dati saglabāti");
                 petNameInput.setText("");
                 petTypeInput.setText("");
                 petAgeInput.setText("");
                 petIllnessInput.setText("");


             }
         });


        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                frame.dispose();
            }
        });





    }
}
