import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;

public class kentta extends JTextField {

    public kentta(String teksti) {

        this.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
        this.setText(teksti);
        this.setCaretColor(Color.WHITE);
        this.setForeground(Color.WHITE);
        this.setBackground(Color.DARK_GRAY);

    }
    
}
