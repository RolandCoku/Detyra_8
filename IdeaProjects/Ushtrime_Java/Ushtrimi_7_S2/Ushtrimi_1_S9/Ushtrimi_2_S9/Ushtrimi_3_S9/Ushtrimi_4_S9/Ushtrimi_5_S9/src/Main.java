import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

//Ndertoni nderfaqen e meposhtme. Te kater Text Field-et nuk mund te modifikohen.
// Kur mouse hyn ne nje prej Text Field-eve background-i merr ngjyren qe shkruhet ne kete fushe.
// Ne kete moment dhe shkrimi ne etiketen e siperme behet Italic. Shtypja e butonit OK mbyll dritaren.
public class Main {
    public static void main(String[] args) {
        Ngjyrat ngjyrat = new Ngjyrat();
        ngjyrat.setSize(250,300);
        ngjyrat.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ngjyrat.setVisible(true);
    }

}
class Ngjyrat extends JFrame implements ActionListener {
    private JLabel headerText;
    private JTextField color1;
    private JTextField color2;
    private JTextField color3;
    private JTextField color4;
    private JButton OK;

    public Ngjyrat(){
        super("Ngjyrat");

        this.setLayout(new FlowLayout(FlowLayout.CENTER));

        headerText = new JLabel("Ndryshimi i ngjyrave");

        color1 = new JTextField("BLU",20);
        color1.setEditable(false);
        color1.addMouseListener(new MouseHandler(this,headerText,Color.BLUE));

        color2 = new JTextField("VERDHE",20);
        color2.setEditable(false);
        color2.addMouseListener(new MouseHandler(this,headerText,Color.YELLOW));

        color3 = new JTextField("JESHILE",20);
        color3.setEditable(false);
        color3.addMouseListener(new MouseHandler(this,headerText,Color.GREEN));

        color4 = new JTextField("KUQE",20);
        color4.setEditable(false);
        color4.addMouseListener(new MouseHandler(this,headerText,Color.RED));

        this.addMouseListener(new MouseHandler(this, headerText, Color.PINK));
        OK = new JButton("OK");
        OK.addActionListener(this);

        this.add(headerText);
        this.add(color1);
        this.add(color2);
        this.add(color3);
        this.add(color4);
        this.add(OK);

    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == OK){
            this.dispose();
        }
    }
}

class MouseHandler extends MouseAdapter{
    JFrame ngjyrat;
    JLabel headerText;
    Color color;

    public MouseHandler(JFrame ngjyrat, JLabel headerText, Color color){
        this.ngjyrat = ngjyrat;
        this.headerText = headerText;
        this.color = color;
    }

    @Override
    public void mouseEntered(MouseEvent event){
        ngjyrat.getContentPane().setBackground(color);

        headerText.setFont(new Font("Serif",Font.ITALIC,14));
    }

    @Override
    public void mouseExited(MouseEvent event){
        ngjyrat.getContentPane().setBackground(Color.WHITE);

        headerText.setFont(new Font("Serif",Font.PLAIN, 14));
    }

    @Override
    public void mouseMoved(MouseEvent event){
        int x = event.getX();
        int y = event.getY();
    }
}