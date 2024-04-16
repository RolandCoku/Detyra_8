import java.util.ArrayList;
import java.util.List;

public class PatientDatabase {
    private final List<Patient> patientList;

    public PatientDatabase(){
        patientList = new ArrayList<>();
    }

    public void addPatient(Patient newPatient){
        patientList.add(newPatient);
    }

    public void searchPatient(String searchID){
        for (Patient patient : patientList){
            if (patient.getPatientID().equals(searchID)){
                System.out.println(patient);
            }
        }
    }

    public void displayInformation(){
        for (Patient patient : patientList){
            System.out.println(patient);
        }
    }

}
