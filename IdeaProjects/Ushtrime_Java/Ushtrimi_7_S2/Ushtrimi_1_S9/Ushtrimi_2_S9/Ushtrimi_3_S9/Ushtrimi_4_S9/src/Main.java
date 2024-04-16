import javax.swing.*;
import java.awt.*;
import java.util.Random;

//Ndertoni nderfaqen e meposhtme ku pasi zgjidhet nje prej Check Box-eve dhe shtypet butoni Gjenero numer ,
// gjenerohet nje numer random nga 1-100 dhe perdoruesit i shfaqet nje dritare si ne figuren b)
// ku shfaqet numri i gjeneruar dhe nese zgjedhja e perdoruesit ishte e sakte apo jo.
// Nese asnje apo te dy check box-et jane zgjedhur duhet te shfaqet gabim.
public class Main {
    public static void main(String[] args) {
        MainFrame frame = new MainFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setVisible(true);
    }
}

class MainFrame extends JFrame {
    private JButton gjeneroNumer;
    private JButton OK;
    private JLabel textLabel;
    private JCheckBox checkBox1;
    private JCheckBox checkBox2;

    public MainFrame(){
        super("Gjenerimi i numrit");
        this.setLayout(new GridLayout(3,1));

        JPanel panel1 = new JPanel();
        gjeneroNumer = new JButton("Gjenero numer");
        OK = new JButton("OK");
        panel1.add(gjeneroNumer);
        panel1.add(OK);

        JPanel panel2 = new JPanel();
        textLabel = new JLabel("Zgjidh nje alternative");
        panel2.add(textLabel);

        JPanel panel3 = new JPanel();
        checkBox1 = new JCheckBox("me i vogel se 50");
        checkBox2 = new JCheckBox("me i madh se 50");
        panel3.add(checkBox1);
        panel3.add(checkBox2);

        this.add(panel1);
        this.add(panel2);
        this.add(panel3);

        gjeneroNumer.addActionListener(e -> {
            Random random = new Random();
            int generatedNr = 1 + random.nextInt(101);
            if((!checkBox1.isSelected()&&!checkBox2.isSelected())||(checkBox1.isSelected()&&checkBox2.isSelected())){
                JOptionPane.showMessageDialog(null, "Zgjidhni vetem nje alternative");
            }else if (checkBox1.isSelected()&&generatedNr<50){
                JOptionPane.showMessageDialog(null,"Sakte! Numri i gjeneruar "+generatedNr+" eshte me i vogel se 50");
            } else if(checkBox1.isSelected()&&generatedNr>50) {
                JOptionPane.showMessageDialog(null,"Gabim! Numri i gjeneruar "+generatedNr+" eshte me i madh se 50");
            }else if (checkBox2.isSelected()&&generatedNr>50){
                JOptionPane.showMessageDialog(null,"Sakte! Numri i gjeneruar "+generatedNr+" eshte me i madh se 50");
            } else if (checkBox2.isSelected()&&generatedNr<50){
                JOptionPane.showMessageDialog(null,"Gabim! Numri i gjeneruar "+generatedNr+" eshte me i voge se 50");

            }
        });

        OK.addActionListener(e -> {
            dispose();
        });
    }
}