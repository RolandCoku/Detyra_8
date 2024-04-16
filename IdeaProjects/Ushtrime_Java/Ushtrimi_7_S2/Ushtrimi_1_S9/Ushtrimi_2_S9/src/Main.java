import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.jar.JarEntry;

//Te ndertohet nderfaqja e meposhtme ku futen dy numra ,
// pasi zgjidhet veprimi dhe pasi shtypet butoni rezultati vendoset ne nje fushe te paeditueshme.
// Klikimi I butonit OK mbyll nderfaqen.
public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.setSize(400,300);
        calculator.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}

class Calculator extends JFrame implements ActionListener{
    private JRadioButton mbledhje;
    private JRadioButton zbritje;
    private JRadioButton shumezim;
    private JButton kryejVeprimin;
    private JButton OK;
    JTextField nr1TextField;
    JTextField nr2TextField;
    JTextField resultTextField;

    public Calculator(){

        super("Calculator");
        this.setLayout(new GridLayout(3,1));
        JPanel panel = new JPanel();
        nr1TextField = new JTextField(10);
        nr2TextField = new JTextField(10);

        panel.add(nr1TextField);
        panel.add(nr2TextField);

        JPanel panel1 = new JPanel();

        zbritje = new JRadioButton("Zbrit");
        mbledhje = new JRadioButton("Mblidh");
        shumezim = new JRadioButton("Shumezo");

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(zbritje);
        buttonGroup.add(mbledhje);
        buttonGroup.add(shumezim);

        panel1.add(zbritje);
        panel1.add(mbledhje);
        panel1.add(shumezim);

        JPanel panel2 = new JPanel();

        kryejVeprimin = new JButton("Kryej veprimin");
        resultTextField = new JTextField(20);
        resultTextField.setEditable(false);
        OK = new JButton("OK");

        kryejVeprimin.addActionListener(this);
        OK.addActionListener(this);

        panel2.add(kryejVeprimin);
        panel2.add(resultTextField);
        panel2.add(OK);

        this.add(panel);
        this.add(panel1);
        this.add(panel2);
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == kryejVeprimin){
            int nr1 = Integer.parseInt(nr1TextField.getText());
            int nr2 = Integer.parseInt(nr2TextField.getText());
            if (zbritje.isSelected()){
                resultTextField.setText(nr1-nr2+"");
            } else if (mbledhje.isSelected()) {
                resultTextField.setText(nr1+nr2+"");
            } else if (shumezim.isSelected()) {
                resultTextField.setText(nr1*nr2+"");
            }
        } else if (e.getSource() == OK){
            this.dispose();
        }
    }
}