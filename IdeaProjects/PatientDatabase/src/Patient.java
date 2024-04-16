public class Patient {
    private String patientName;
    private String patientID;
    private int patientAge;
    private String patientLocation;

    public Patient(String name, String ID, int age, String location){
        patientName = name;
        patientID = ID;
        patientAge = age;
        patientLocation = location;
    }

    public String getPatientName(){
        return patientName;
    }
    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientID() {
        return patientID;
    }

    public void setPatientID(String patientID){
        this.patientID = patientID;
    }

    public int getPatientAge() {
        return patientAge;
    }

    public void setPatientAge(int patientAge){
        this.patientAge = patientAge;
    }

    public String getPatientLocation() {
        return patientLocation;
    }

    public void setPatientLocation(String patientLocation){
        this.patientLocation = patientLocation;
    }

    @Override
    public String toString(){
        return patientName + "\n" + patientID + "\n" + patientAge + "\n" + patientLocation;
    }
}
