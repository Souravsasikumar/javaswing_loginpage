import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
public class loginpage implements ActionListener {
    JFrame frame =new JFrame();
    JButton loginbutton=new JButton("Login");
    JButton resetbutton=new JButton("Reset");
    JTextField useridfeild=new JTextField();
    JPasswordField userpassword=new JPasswordField();
    JLabel useridlabel=new JLabel("UserID");
    JLabel userpasswordlabel=new JLabel("Passwod");
    JLabel messagelabel=new JLabel();
    HashMap<String,String> logininfo=new HashMap<>();
    loginpage(HashMap<String,String> logininfoOriginal){
        logininfo=logininfoOriginal;
        useridlabel.setBounds(50,100,75,25);
        userpasswordlabel.setBounds(50,150,75,25);
        messagelabel.setBounds(125,250,250,35);
        messagelabel.setFont(new Font(null, Font.ITALIC,25));
        useridfeild.setBounds(125,100,200,25);
        userpassword.setBounds(125,150,200,25);
        loginbutton.setBounds(125,200,100,25);
        loginbutton.setFocusable(false);
        loginbutton.addActionListener(this);
        resetbutton.setBounds(225,200,100,25);
        resetbutton.setFocusable(false);
        resetbutton.addActionListener(this);

        frame.add(useridlabel);
        frame.add(userpasswordlabel);
        frame.add(messagelabel);
        frame.add(useridfeild);
        frame.add(userpassword);
        frame.add(loginbutton);
        frame.add(resetbutton);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);



    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==resetbutton){
            useridfeild.setText("");
            userpassword.setText("");
        }
        if(e.getSource()==loginbutton){
            String userID=useridfeild.getText();
            String password=String.valueOf(userpassword.getPassword());
            if(logininfo.containsKey(userID)){
                if(logininfo.get(userID).equals(password)){
                    messagelabel.setForeground(Color.green);
                    messagelabel.setText("login successful");
                    frame.dispose();
                    workingpage welcomepage=new workingpage(userID);
                }
                else{
                    messagelabel.setForeground(Color.red);
                    messagelabel.setText("wrong password");

                }
            }
            else{
                messagelabel.setForeground(Color.red);
                messagelabel.setText("username not found");


            }
        }

    }
}
