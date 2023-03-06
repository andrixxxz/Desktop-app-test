import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBlogic {

    String DB = "jdbc:mysql://localhost:3306/java_db";
    String USER = "root";
    String PASS = "Pikmens123";

    // method - insert, connection, insert
    public void insert2(String name, String type, String age, String symptoms) throws SQLException {
        Connection conn = DriverManager.getConnection(DB, USER, PASS);
        Statement stmt = conn.createStatement();

        String sql = "INSERT INTO dzivnieki (name, type, age, symptoms) VALUES ('"+ name +"','"+type+"','"+age+"','"+symptoms+"')";

        stmt.executeUpdate(sql);

        System.out.println("Dati tika ierakstīti");

    }
}

//    String petname = petNameInput.getText();
//    String tips = petTypeInput.getText();
//    String age = petAgeInput.getText();
//    int age2 = Integer.parseInt(age);
//    String symptoms = petIllnessInput.getText();