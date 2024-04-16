import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.Border;
//Metoda e Nutonit per diferenca te FUNDME
public class Main extends JFrame implements ActionListener {
    public static int nyje;
    public static double pika;
    public static double hapi;
    public static double q;
    public static double result;
    JPanel panel = new JPanel();
    JLabel nyjet = new JLabel("Nyje: ");
    JTextField merNyje = new JTextField();
    JLabel vleraX = new JLabel("Jep vleren e x:");
    JTextField jepX = new JTextField();
    JLabel Xi = new JLabel("X[i]: ");
    JLabel Yi = new JLabel("Y[i]: ");
    JTextField[] field ;
    JTextField[] fieldY ;
    JLabel vlera = new JLabel("Vlera f(x):");
    JTextField getVlera = new JTextField();
    JLabel gabimi = new JLabel("Gabimi: ");
    JTextField getGabimi = new JTextField();
    JButton btn = new JButton("Llogatit");
    Main(int n){
        this.setSize(75*n,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("Metoda e Njutonit me Diferenca te Fundme ");
        Border blackline = BorderFactory.createLineBorder(Color.black);panel.setSize(75*n,400);
        panel.setLayout(null);
        panel.setBackground(Color.gray);
        vleraX.setBounds(20,40,120,20);
        vleraX.setFont(new Font("Sherif", Font.BOLD, 15));
        jepX.setBounds(150,40,70,20);
        jepX.setFont(new Font("Sherif", Font.BOLD, 12));
        Xi.setBounds(20,90,30,20);
        Xi.setFont(new Font("Sherif", Font.BOLD, 12));
        Xi.setBorder(blackline);
        Yi.setBorder(blackline);
        Yi.setBounds(20,120,30,20);
        Yi.setFont(new Font("Sherif", Font.BOLD, 12));
        field = new JTextField[n];
        for(int i=0 ; i<n ; i++) {
            field[i] = new JTextField();
            field[i].setBounds(60*(i+1),90,50,20);
            panel.add(field[i]);
        }
        fieldY = new JTextField[n];
        for(int i=0 ; i<n ; i++) {
            fieldY[i] = new JTextField();
            fieldY[i].setBounds(60*(i+1),120,50,20);
            panel.add(fieldY[i]);
        }
        vlera.setBounds(20,170,90,20);
        vlera.setFont(new Font("Sherif", Font.BOLD, 15));
        getVlera.setBounds(120,170,150,20);
        getVlera.setFont(new Font("Sherif", Font.BOLD, 12));
        getVlera.setEditable(false);
        gabimi.setBounds(20,210,90,20);
        gabimi.setFont(new Font("Sherif", Font.BOLD, 15));
        getGabimi.setBounds(120,210,150,20);
        getGabimi.setFont(new Font("Sherif", Font.BOLD, 12));
        getGabimi.setEditable(false);
        btn.setBounds(20,260,90,40);
        btn.setFont(new Font("Sherif", Font.BOLD, 15));
        btn.addActionListener(this);
        btn.setBackground(Color.magenta);
        panel.add(vleraX);
        panel.add(getVlera);
        panel.add(Xi);
        panel.add(Yi);
        panel.add(jepX);
        panel.add(gabimi);
        panel.add(getGabimi);
        panel.add(vlera);
        panel.add(btn);
        this.add(panel);
        this.setVisible(true);
    }
    public static void main(String[] args) {
        String dhena;
        dhena = JOptionPane.showInputDialog("Jepni numrin e nyjeve: ");
        nyje = Integer.parseInt(dhena);
        Main main = new Main(nyje);
    }
    //Kjo metode gjen vleren e perafert e funksionit ne piken x te dhene per DIFERENCAT E PERPARME
    public static double Polinomi(double dif[][], int n, double q) {
        double Px=0;
        for(int i=n-2 ; i>=0 ;i--) {
            Px+= (dif[0][i]*vleraQ(q,i,0))/fact(i);
        }
        return Px;
    }
    //Kjo metode gjen gabimin me te cillin eshte gjetur vlera e funksionit per DIFERENCAT E PERPARME
    public static double Gabimi(double dif[][], int n, double q) {
        return (dif[0][nyje-1]*vleraQ(q,n-1,0))/fact(n-1);
    }
    //Kjo metode gjen gabimin me te cilin eshte gjetur vlera e funksionit per DIFERENCAT E PRAPME
    public static double GabimiPrapm(double dif[][], int n, double q) {
        return (dif[nyje-1][nyje-1]*vleraQPrapme(q,n-1,0))/fact(n-1);
    }
    //Kjo metode gjen vleren e funksionit ne piken x te dhene per DIFERENCAT E PRAPME
    public static double PolinomiPrapm(double dif[][], int n, double q) {
        double Px=0;
        for(int i=n-2 ; i>=0;i--) {
            Px += (dif[nyje-1][i]*vleraQPrapme(q,i,0))/fact(i);
        }
        return Px;
    }
    //Kjo metode gjen vleren e produktit te : q(q-1)(q-2)...(q-(k-1)) ku k eshte rendi i diferences
// per DIFERENCAT E PERPARME
    public static double vleraQ(double q, int n, int i) {
        if (i>=n)
            return 1;
        return (q-i)*vleraQ(q, n, i+1);
    }
    //Kjo metode gjen vleren e produktit te : q(q+1)(q+2)...(q+(k-1)) ku k eshte rendi i diferences
// per DIFERENCAT E PRAPME
    public static double vleraQPrapme(double q, int n, int i) {
        if (i>=n)
            return 1;
        else
//Gabimi ka qene ketu-->return (q+i)*vleraQ(q, n, i+1); gjente vleren per diferencat e perpa
            return (q+i)*vleraQPrapme(q, n, i+1);
    }
    //Kjo metode gjen faktorialin e k--> rendi i diferences
    public static int fact(int i) {
        if(i<=1)return 1;
        return i*fact(i-1);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==btn) {
            double x[] = new double[nyje];
            double y[] = new double[nyje];
            double dif[][] = new double[nyje][nyje];
            pika=Double.parseDouble(jepX.getText());
//PLOTESIMI I TABELES
            try {
                for(int i=0 ; i<nyje ;i++) {
                    x[i] =Double.parseDouble(field[i].getText());
                    y[i] = Double.parseDouble(fieldY[i].getText());
                }
            }catch(IllegalArgumentException exception) {
                JOptionPane.showMessageDialog(null, "Vlerat e Nyjeve jane vendosur Gabim!)");
            }
            hapi = x[1]-x[0];
            for(int i=0 ; i<nyje ; i++) {
                dif[i][0] = y[i];
            }
//Rasti kur x ndodhet ne DIFERENCAT E PERPARME
            if(pika< (double)(x[0]+x[nyje-1])/2) {
                for(int i = 1 ; i<nyje ; i++)
                {
                    for(int j=nyje-(i+1); j>=0 ; j--) {
                        dif[j][i]=dif[j+1][i-1] - dif[j][i-1];
                    }
                }
                q = (pika - x[0])/hapi ;
                result = Polinomi(dif, nyje, q);
                getVlera.setText(String.valueOf(result));
                getGabimi.setText(String.valueOf(Gabimi(dif,nyje,q)));
            }
            else { //Rasti kur x ndodhet ne DIFERENCAT E PRAPME
                for(int i = 1 ; i<nyje ; i++)
                {
                    for(int j=nyje-1; j>=i; j--) {
                        dif[j][i]=dif[j][i-1] - dif[j-1][i-1];
                    }
                }
                q = (double)(pika - x[nyje-1])/hapi ;
                result = PolinomiPrapm(dif, nyje, q);
                getVlera.setText(String.valueOf(result));
                getGabimi.setText(String.valueOf(GabimiPrapm(dif,nyje,q)));
            }
        }
}
}