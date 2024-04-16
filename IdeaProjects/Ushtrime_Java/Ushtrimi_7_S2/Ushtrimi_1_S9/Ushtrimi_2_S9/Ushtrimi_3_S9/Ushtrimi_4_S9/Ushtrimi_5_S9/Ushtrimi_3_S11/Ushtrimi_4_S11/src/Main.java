import java.util.ArrayList;
import java.util.List;

//Krijo nje klase Student me fusha emri dhe nota. Rendit studentet e nje ArrayList ne baze te notes
//dhe nese nota eshte e njejte ne baze te emrit duke implementuar nderfaqen Comparator.
public class Main {
    public static void main(String[] args) {
        Student student = new Student("AAA",8);
        Student student1 = new Student("BAA",4);
        Student student2 = new Student("BBAA",6);
        Student student3 = new Student("AAB",8);

        List<Student> studentList = new ArrayList<>();
        studentList.add(student);
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        for (Student s : studentList){
            System.out.println(s);
        }

        for (int i = 0; i < studentList.size(); i++){
            for (int j = i+1; j < studentList.size(); j++){
                if (studentList.get(i).compareTo(studentList.get(j)) > 0){
                    Student temp = studentList.get(i);
                    studentList.set(i,studentList.get(j));
                    studentList.set(j,temp);
                }
            }
        }

        for (Student s : studentList){
            System.out.println(s);
        }
    }

}
class Student implements Comparable{
    private String emri;
    private int nota;
    public Student(String emri, int nota){
        this.emri = emri;
        this.nota = nota;
    }

    public int getNota() {
        return nota;
    }
    public String getEmri(){
        return emri;
    }

    @Override
    public String toString(){
        return "[Emri = "+emri+", Nota = "+nota+"]";
    }

    @Override
    public int compareTo(Object student) {
        if (this.nota > ((Student)student).getNota()) {
            return 1;
        } else if (this.nota < ((Student)student).getNota()) {
            return -1;
        } else {
            if (this.emri.compareTo(((Student)student).getEmri()) > 0) {
                return 1;
            } else if (this.emri.compareTo(((Student)student).getEmri()) < 0) {
                return -1;
            } else {
                return 0;
            }
        }

    }

}