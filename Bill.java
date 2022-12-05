class Bill
{
    // dataMembers
    private  int id;
    private double DoctorFee;

    private double RoomCharges;

    private double Pharmacy;


    // setters
    private void setId(int numb) {


        id = numb;
    }



    private void  setDoctorFee(double b){

        DoctorFee =b;

    }

    private void setRoomCharges (double y){

        RoomCharges =y;
    }

    private void setPharmacy (double a){

        Pharmacy =a;
    }


    // getters
    public int  getId() {
        return id;
    }



    public double getDoctorFee()
    {return DoctorFee;}

    public double getRoomCharges()
    {return RoomCharges;}

    public double getPharmacy()
    {
        return Pharmacy;
    }


    Bill()
    {

        id = 2412512;   // needs to be an int
        Pharmacy =1;
        RoomCharges =1;
        DoctorFee =1;

    }



    Bill(int pId, double Pc, double rc, double df)
    {

        id = pId;
        Pharmacy = Pc;
        RoomCharges = rc;
        DoctorFee = df;


    }


    public  String toString() {     // print the bill
        String bill = "Pharmacy Charges: $" + Pharmacy +
                "\nRoom Charges: $" + RoomCharges +
                "\nDoctor Fees: $" + DoctorFee +
                "\n----------------------------------------\n" + "Total Charges: " + (Pharmacy + RoomCharges + DoctorFee);
        return bill;
    }

}