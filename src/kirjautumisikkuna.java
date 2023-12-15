import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class kirjautumisikkuna extends JFrame implements ActionListener{

    private JLabel paaotsikko;

    private otsikko kayttajaotsikko;
    private otsikko salasanaotsikko;

    private kentta kayttajakentta;
    private kentta salasanakentta;

    private Kirjautumisnappi kirjautumisnappi;
    private otsikko vaarinotsikko;

    private Map<String,String> luettelo;

    public kirjautumisikkuna() {
    
    paaotsikko = new JLabel("Tervetuloa!");
    paaotsikko.setBounds(200, 100, 150, 50);
    paaotsikko.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
    paaotsikko.setBackground(Color.WHITE);
    paaotsikko.setForeground(Color.BLACK);
    paaotsikko.setVerticalAlignment(JLabel.CENTER);
    paaotsikko.setHorizontalAlignment(JLabel.CENTER);
    paaotsikko.setOpaque(true);

    kayttajaotsikko = new otsikko("Käyttäjätunnus:");
    kayttajaotsikko.setBounds(150, 190, 125, 30);

    kayttajakentta = new kentta("Anna käyttäjänimi...");
    kayttajakentta.setBounds(150, 230, 300, 50);

    salasanaotsikko = new otsikko("Salasana:");
    salasanaotsikko.setBounds(150, 290, 125, 30);

    salasanakentta = new kentta("Anna salasana...");
    salasanakentta.setBounds(150, 330, 300, 50);

    kirjautumisnappi = new Kirjautumisnappi("Kirjaudu");
    kirjautumisnappi.setBounds(150, 390, 125, 30);
    kirjautumisnappi.addActionListener(this);

    vaarinotsikko = new otsikko("Väärin");
    vaarinotsikko.setBounds(150, 450, 250, 30);
    vaarinotsikko.setBackground(Color.WHITE);
    vaarinotsikko.setForeground(Color.RED);
    vaarinotsikko.setVisible(false);

    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setTitle("Haapanen Johannes Kirjautumisikkuna");
    this.setSize(600, 600);
    this.setResizable(false);
    this.getContentPane().setBackground(Color.WHITE);
    this.setLayout(null);
    
    this.add(paaotsikko);
    this.add(kayttajaotsikko);
    this.add(kayttajakentta);
    this.add(salasanaotsikko);
    this.add(salasanakentta);
    this.add(kirjautumisnappi);
    this.add(vaarinotsikko);
    this.setVisible(true);

    luettelo = new HashMap<>();
    luettelo.put("KalleAnkka", "12345");
    luettelo.put("LupuAnkka", "54321");

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == kirjautumisnappi) {

            String kayttaja = kayttajakentta.getText();

            if (luettelo.containsKey(kayttaja)) {

                if (luettelo.get(kayttaja).equals(salasanakentta.getText()) == true) {

                    vaarinotsikko.setVisible(false);
                    new sisaanikkuna();

                }

                else {

                    vaarinotsikko.setVisible(true);
                    vaarinotsikko.setText("Väärä salasana");

                }

            }

            else {

                vaarinotsikko.setVisible(true);
                vaarinotsikko.setText("Tunnusta ei löytynyt");

            }

        }

    }
    
}
