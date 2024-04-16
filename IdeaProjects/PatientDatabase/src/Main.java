import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PatientDatabase patientDatabase = new PatientDatabase();

        boolean accessGranted = false;

        boolean isRunning = true;

        while (isRunning){
            System.out.println("MENU");
            System.out.println("***********************************\n");

            System.out.println("1) - Add a new patient.");
            System.out.println("2) - Search for a patient's information.");
            System.out.println("3) - Change a patient's information.");
            System.out.println("4) - Delete a patient from the database.");
            System.out.println("5) - Quit.\n");

            System.out.println("***********************************");

            System.out.println("Select the action you want by typing in the corresponding number!");
            int chosenAction = scanner.nextInt();
            scanner.nextLine();

            switch (chosenAction){
                case 1:
                    System.out.println("Give the information for the patient: ");
                    System.out.println("--------------------------------------");
                    System.out.print("Give the patient's name and surname: ");
                    String name = scanner.nextLine();
                    System.out.print("Give the patient's ID: ");
                    String ID = scanner.nextLine();
                    System.out.print("Give the patient's age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Give the patient's location: ");
                    String location = scanner.nextLine();
                    Patient newPatent = new Patient(name, ID, age, location);
                    break;
                case 2:
                    System.out.print("Please give the patient's ID: ");
                    String searchID = scanner.nextLine();
                    patientDatabase.searchPatient(searchID);
                    break;
                case 3:
                    System.out.print("Please give the ID of the patient you want to make changes: ");
                    searchID = scanner.nextLine();
                    break;
                case 4:
                    System.out.print("Please give the ID of the patient you want to delete: ");
                    searchID = scanner.nextLine();
                    break;
                case 5:
                    isRunning = false;
                    break;
                default:
                    System.out.println("Invalid action! \n Please type in only the number corresponding to the action you want to perform!");
            }
        }

    }
}