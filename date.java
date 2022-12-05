class date
{
    private int month;
    private  int day;
    private  int  year;


    // constructors
    date ()
    {
        month = 1;
        day =1;
        year =1;

    }

    date (int m , int d , int y)
    {
        month = m;
        day = d;
        year = y;
    }

    //setters
    private void setMonth (int m) {

        month = m;
    }

    private void setDay(int d){

        day = d;
    }

    private void setYear(int y){

        year = y;
    }
    // getters

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }
    public  int getYear()
    {
        return  year;
    }

    @Override       // print out the date
    public  String toString() {
        return  month + "-" +day + "-" + year;
    }
}
