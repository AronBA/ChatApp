import javax.swing.*;
import java.awt.*;

public class MainGui extends JFrame {

    public  JTextArea chat = new JTextArea();
    MainGui() {

        this.setSize(500, 500);
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout(10,10));


        chat.setEditable(false);
        chat.setLineWrap(true);
        chat.setWrapStyleWord(true);
        chat.setLineWrap(true);
        JButton submit = new JButton();
        JTextArea message = new JTextArea("type new message here");

        this.add(chat, BorderLayout.NORTH);
        this.add(message, BorderLayout.CENTER);
        this.add(submit,BorderLayout.SOUTH);


        this.setVisible(true);


    }
    public void displaymessage(String msg){
            this.chat.append(msg + "/n");


    }



}