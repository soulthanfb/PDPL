//ini anak yang mewarisi harta bapaknya

class MountainBike extends Bicycle{
    //the MountainBike subclass adds one more field
    public int seatHeight;

    //the MountainBike subclass has one constructor
    public MountainBike(int gear, int speed, int starHeight)
    {
        // invoking base-class(Bicycle) constructor
        super(gear, speed);
        seatHeight = starHeight;
    }

    //the MountainBike subclass adds one more method
    public void seatHeight(int newValue)
    {
        seatHeight = newValue;
    }

    //over riding toString() method 
    //of Bicycle to print more info 
    @Override
    public String toString()
    {
        return (super.toString() + "\n" + "seat Height is " + seatHeight);
    }
}