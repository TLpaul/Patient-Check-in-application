class Doctor extends  person
{

    private  String Special;

    Doctor ()
    {
        super();
        Special = "N/A";
    }
    Doctor(String First,String Last,String Speci){

        super(First , Last);
        Special = Speci;


    }

    private void  SetSpecial (String s)
    {

        Special = s;
    }

    public String getSpecial()

    {

        return  Special;
    }


    // override to print doctor and specialty
    @Override
    public  String toString(){


        return super.toString() + " "  + Special;
    }




}
