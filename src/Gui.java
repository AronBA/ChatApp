import javax.swing.*;
import java.awt.*;

public class Gui extends JFrame {
    Panel panel = new Panel();

    Gui() {
        this.setVisible(true);
        this.setSize(500, 500);
        this.setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        new Gui();
    }
}