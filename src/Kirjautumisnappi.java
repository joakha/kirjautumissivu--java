import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JButton;

public class Kirjautumisnappi extends JButton {

    public Kirjautumisnappi(String teksti) {

        this.setText(teksti);
        this.setForeground(Color.WHITE);
        this.setBackground(Color.GRAY);
        this.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        this.setFocusable(true);
        this.setBorder(BorderFactory.createEtchedBorder());

    }
    
}
