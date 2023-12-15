import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

public class otsikko extends JLabel {

    public otsikko(String teksti) {

    this.setOpaque(true);
    this.setText(teksti);
    this.setBackground(Color.WHITE);
    this.setForeground(Color.BLACK);
    this.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
    this.setHorizontalAlignment(JLabel.LEFT);
    this.setVerticalAlignment(JLabel.BOTTOM);

    }
    
}
