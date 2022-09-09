import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Gui extends JFrame implements ActionListener {
    private int ip;
    GridLayout gridLayout = new GridLayout(0, 1);
    Panel panel = new Panel();
    Panel theirPanel = new Panel();
    Panel yourPanel = new Panel();
    JSpinner inputIp = new JSpinner();
    JButton connectButton = new JButton("Connect");
    JTextField yourIp = new JTextField();

    Gui() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setSize(500, 500);
        this.setLocationRelativeTo(null);
        connectButton.addActionListener(this);
        //try {
        //    yourIp.setText(String.valueOf(InetAddress.getLocalHost()));
        //} catch (Exception ex) {
        //    ex.printStackTrace();
        //}
        Dimension size = new Dimension(100, 30);
        inputIp.setPreferredSize(size);
        yourIp.setPreferredSize(size);
        theirPanel.add(new JLabel("Your friends Ip:"));
        theirPanel.add(inputIp);
        theirPanel.add(connectButton);
        yourPanel.add(yourIp);
        panel.setLayout(gridLayout);
        panel.add(theirPanel);
        panel.add(yourPanel);
        this.add(panel);
    }

    public int getIp() {
        return ip;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == connectButton) {
            int ip = (int) this.inputIp.getValue();
            this.ip = ip;
        }
    }
    public static void main(String[] args) {
        new Gui();
    }
}