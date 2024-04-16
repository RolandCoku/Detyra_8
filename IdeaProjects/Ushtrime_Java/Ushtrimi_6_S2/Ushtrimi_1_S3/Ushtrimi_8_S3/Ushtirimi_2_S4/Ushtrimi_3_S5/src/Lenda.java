//-Ne nje vektor 2 dimensional ruhen rezultatet e detyrave per N studente ne M lende. Per te dhenat e studenteve
//do te perdoret nje klase ekzistuese me emrin Student dhe per lendet nje klase me emrin Lenda. Nese nje student
//nuk ka marre pjese ne dorezimin e nje detyre shenohet me -1, ne te kundert vendoset nota.
//a) Ndertoni programin qe lexon te dhenat dhe afishon studentin qe ka dorezuar me shume detyra.
//b) Ndertoni nje funksion qe gjen per nje lende qe merret nga tastiera numrin e detyrave te dorezuara
public class Lenda {
    private String emriLendes;
    public Lenda(String emriLendes){
        this.emriLendes = emriLendes;
    }

    public void setEmriLendes(String emriLendes) {
        this.emriLendes = emriLendes;
    }

    public String getEmriLendes() {
        return emriLendes;
    }
}