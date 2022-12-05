class person
{
    //Data Members
    private String Fname;
    private  String Lname;

    //No Argument Constructor
    person(){
        Fname = "Terry";
        Lname = "Paul";

    }
    //Argument constructor
    public person(String F, String L)
    {


        Fname = F;
        Lname = L;
    }


    // Setter
    private void SetFName(String First)
    {

        Fname = First;

    }

    private  void setLname(String Last){
        Lname = Last;
    }
    // Getters
    public String getFName()
    {

        return  Fname;
    }
    public String getLName()
    {

        return  Lname;
    }
    public  String toString(){      // Print the name

        return  Fname + " " + Lname;
    }
}