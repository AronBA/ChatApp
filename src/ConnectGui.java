import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.Inet4Address;

public class ConnectGui extends JFrame implements ActionListener {
    private int ip;
    GridLayout gridLayout = new GridLayout(0, 1);
    Panel panel = new Panel();
    Panel theirPanel = new Panel();
    Panel yourPanel = new Panel();
    JSpinner inputIp = new JSpinner();
    JButton connectButton = new JButton("Connect");
    JTextField yourIp = new JTextField();
    JButton copyIp = new JButton("Copy");

    ConnectGui() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLocationRelativeTo(null);
        connectButton.addActionListener(this);
        copyIp.addActionListener(this);
        try {
            System.out.println(Inet4Address.getLocalHost().getHostAddress());
            yourIp.setText("172.31.34.206");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        Dimension size = new Dimension(100, 30);
        inputIp.setPreferredSize(size);
        yourIp.setPreferredSize(size);
        theirPanel.add(new JLabel("Your friends Ip:"));
        theirPanel.add(inputIp);
        theirPanel.add(connectButton);
        yourPanel.add(yourIp);
        yourPanel.add(copyIp);
        panel.setLayout(gridLayout);
        panel.add(theirPanel);
        panel.add(yourPanel);
        this.add(panel);
        this.setVisible(true);
    }

    public int getIp() {
        return ip;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == connectButton) {
            this.ip = (int) this.inputIp.getValue();
        }
        if (e.getSource() == copyIp) {
            String ownIp = yourIp.getText();
            StringSelection stringSelection = new StringSelection(ownIp);
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(stringSelection, null);
        }
    }
    public static void main(String[] args) {
        new ConnectGui();
    }
}