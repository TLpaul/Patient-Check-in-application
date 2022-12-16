import java.time.Year;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;
public class Q02 {



    // Read From Keyboard
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {


        char choice ='y'; //sentinel loop

        while (choice == 'y')   // Condition to exit
        {



            // Ask  for patient id and name
            System.out.print("Enter patient's ID: ");
            int pid = scan.nextInt();
            System.out.print("Enter patient's first name: ");
            String pFname = scan.next();
            System.out.print("Enter patient's last name: ");
            String pLname = scan.next();

            // Ask  for doctor name and specialty
            System.out.print("Enter doctor's first name: ");
            String dFname = scan.next();
            System.out.print("Enter doctor's last name: ");
            String dLname = scan.next();
            System.out.print("Enter doctor's specialty: ");
            String specialty = scan.next();

            // get day addmitted from user
            System.out.println( " Enter an admit date (day/month/year): ");
            int m,d,y,m2,d2,y2;
            m = scan.nextInt();
            System.out.print("/");
            d = scan.nextInt();
            System.out.print("/");
            y = scan.nextInt();

            // gets the Discharge date from user
            System.out.println( " Enter an Discharge date (day/month/year): ");

            m2 = scan.nextInt();
            System.out.print("/");
            d2 = scan.nextInt();
            System.out.print("/");
            y2 = scan.nextInt();
            // create doctor object
            Doctor doctor = new Doctor(dFname, dLname, specialty);

            // Create a patient object
            Patient patient = new Patient(pFname, pLname, pid, new date(m, d, y), doctor, new date(m, d, y), new date(m2, d2, y2));

            // Create bill object
            Bill bill = new Bill(patient.getID(), 245.50, 2500, 3500.38);

            // print the data to console
            System.out.println(patient);
            System.out.println("\n" + bill);

            // create output file
            String filename = patient.getDoctorsName() + ".txt";        // may need to fix

            try {
                FileWriter fw = new FileWriter(new File(filename));

                // write the data to file
                fw.write(patient.toString() + "\n");
                fw.write("\n" + bill);

                fw.close();
            } catch (IOException e) {       // if file alread exsits do this
                e.printStackTrace();
            }

            // choice for while loop
            System.out.println("Do you want to continue? Enter 'y' for yes, 'n' for no\n" +
                    "n\n");
            choice = scan.next().charAt(0);;
        }
    }
}









