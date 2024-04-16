import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Te ndertohet nderfaqja grafike ku me klikimin e butonit te kopjohet vlera e shkruar ne fushen 1 tek fusha tjeter e cila eshte e pandryshueshme.
public class Main {
    public static void main(String[] args) {
        Frame frame = new Frame();

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(300,200);
    }

}

class Frame extends JFrame implements ActionListener{

    private JTextField textField1;
    private JTextField textField2;
    private JButton button;

    public Frame(){
        super("Nderfaqe grafike");

        this.setLayout(new GridLayout(3,1));

        JPanel field1panel = new JPanel();
        JLabel textLabel = new JLabel("Fusha 1:");
        textField1 = new JTextField(15);
        field1panel.add(textLabel);
        field1panel.add(textField1);

        JPanel field2Panel = new JPanel();
        textField2 = new JTextField("Fusha e pandryshueshme",20);
        textField2.setEditable(false);
        field2Panel.add(textField2);

        JPanel buttonPanel = new JPanel();
        button = new JButton("Gjenero fushe te re");
        button.addActionListener(this);
        buttonPanel.add(button);

        this.add(field1panel);
        this.add(field2Panel);
        this.add(buttonPanel);

        this.setVisible(true);
    }



    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == button){
            textField2.setText(textField1.getText());
        }
    }
}