//ini bapak

public class Bicycle {
    // the bicycle class has two fealds
    public int gear;
    public int speed;

    // the bicycle class has one constructor
    public Bicycle(int gear, int speed)
    {
        this.gear = gear;
        this.speed = speed;
    }

    // The Bicycle class has three methods
    public void applyBrake(int decrement)
    {
        speed -= decrement;
    }

    public void speedUp(int intcrement)
    {
        speed += intcrement;
    }

    //toString() method to print info of Bicycle
    public String toString()
    {
        return ("No of gears are " + gear + "\n" + "speed of bicycle is " + speed);
    } 
}