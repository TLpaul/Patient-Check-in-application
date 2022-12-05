
class Patient extends person
{
    //Data Members
    private  int  ID;
    private  date DOB;
    private  Doctor doctorsName;
    private  date admitted;
    private  date released;
// constructor

    Patient(String firstName, String lastName, int patientID, date dob, Doctor physician, date attendDate, date dischargeDate) {
        // call super class constructor
        super(firstName, lastName);
        this.ID = patientID;
        this.DOB = dob;
        this.doctorsName = physician;
        this.admitted = attendDate;
        this.released = dischargeDate;
    }

    Patient()
    {

        super();
        this.ID = 1254125;

    }
    // Getters

    public  int getID(){

        return ID;
    }

    public  date getDOB() {

        return DOB;
    }

    public   Doctor getDoctorsName(){

        return  doctorsName;
    }

    public  date getAdmitted(){

        return admitted;
    }

    public  date getReleased(){

        return  released;
    }

    //Setters
    public void setID(int f){

        ID=f;
    }

    public void setDOB( date dob)
    {

        DOB = dob;
    }

    public void setDoctorsName(Doctor doc){

        doctorsName = doc;

    }
    public void setAdmitted (date admitted){
        this.admitted = admitted;
    }

    public  void setReleased (date released){

        this.released = released;
    }


    //getters
    public int getId() {

        return ID;
    }

    public date getDob(){

        return DOB;
    }
    public Doctor getDoctor(){

        return doctorsName;
    }

    public date getAddmitted(){

        return admitted;
    }
    public  date getRealeased(){

        return released;
    }

    @Override
    public  String toString(){      // print out a patients information
        String p = "Patient: " + super.toString() +
                "\nID: " + ID +
                "\nAttending Physician: " + doctorsName +
                "\nAdmit Date: " + admitted +
                "\nDischarge Date: " + released;

        return p;



    }
}
