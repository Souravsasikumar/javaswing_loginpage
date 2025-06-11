import javax.swing.*;
import java.awt.*;

public class workingpage {
    JFrame frame=new JFrame();
    JLabel welcomelabel=new JLabel("hello");
    workingpage(String userid){
        welcomelabel.setBounds(0,0,200,35);
        welcomelabel.setFont(new Font(null,Font.PLAIN,25));
        welcomelabel.setText("Hello "+userid);
        frame.add(welcomelabel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
