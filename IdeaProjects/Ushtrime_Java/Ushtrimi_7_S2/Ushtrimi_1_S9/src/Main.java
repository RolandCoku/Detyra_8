import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Te ndertohet nderfaqja grafike e meposhtme. Me klikimin e butonit te tregohet cfare ngjyre eshte zgjedhur.
public class Main {
    public static void main(String[] args) {
        Nderfaqja windowFrame = new Nderfaqja();
        windowFrame.setSize(300,200);
        windowFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        windowFrame.setVisible(true);
    }
}

class Nderfaqja extends JFrame implements ActionListener {
    private JButton button;
    private JCheckBox checkBox1;
    private JCheckBox checkBox2;
    private JCheckBox checkBox3;

    public Nderfaqja(){
        this.setTitle("Nderfaqja");

        JPanel checkBoxPanel = new JPanel();
        checkBoxPanel.setLayout(new BoxLayout(checkBoxPanel,BoxLayout.Y_AXIS));

        checkBox1 = new JCheckBox("E para");
        checkBox2 = new JCheckBox("E dyta");
        checkBox3 = new JCheckBox("E treta");

        checkBoxPanel.add(checkBox1);
        checkBoxPanel.add(checkBox2);
        checkBoxPanel.add(checkBox3);

        button = new JButton("Lexo zgjidhjen");
        checkBoxPanel.add(button);

        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        centerPanel.add(checkBoxPanel);


        button.addActionListener(this);

        this.add(centerPanel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(checkBox1.isSelected()){
            JOptionPane.showMessageDialog(null,checkBox1.getText());
        }
        if (checkBox2.isSelected()){
            JOptionPane.showMessageDialog(null,checkBox2.getText());
        }
        if (checkBox3.isSelected()){
            JOptionPane.showMessageDialog(null,checkBox3.getText());
        }
        if(!checkBox1.isSelected()&&!checkBox2.isSelected()&&!checkBox3.isSelected()){
            JOptionPane.showMessageDialog(null,"Nothing selected");
        }
    }
}
