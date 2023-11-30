
//method abstrak artinya belum jelas
//abstraction semakin abstrak semakin tidak jelas
//bermaksud untuk melindungi datanya

interface Vehicle {

    // all are the abstrack method
    void changeGear(int a);
    void speedUp(int a);
    void applyBrakes(int a);

}

class Bicycle implements Vehicle{

    int speed;
    int gear;

    //to chnge gear
    // @Override
    public void changeGear(int newGear){

        gear = newGear;

    }

    //to increase speed
    // @Override
    public void speedUp(int intcrement){

        speed = speed + intcrement;

    }

    //to decrease speed
    // @Override
    public void applyBrakes(int decrement){

        speed = speed - decrement;

    }

    public void printStates() {
        System.out.println("speed: " + speed + " gear: " + gear);
    }
}

class Bike implements Vehicle {

    int speed;
    int gear;

    //to change gear
    // @Override
    public void changeGear(int newGear){

        gear = newGear;
    }

    //to increase speed
    // @Override
    public void speedUp(int intcrement){

        speed = speed + intcrement;
    }

    // to decrease spee
    // @Override
    public void applyBrakes(int decrement){

        speed = speed - decrement;
    }

    public void printStates() {
        System.out.println("speed: " + speed + " gear: " + gear);
    }
}

class GFG2 {

    public static void main (String[] args) {
        //creating an inatance of bicycle
        //doing some operations
        Bicycle bicycle = new Bicycle();
        bicycle.changeGear(2);
        bicycle.speedUp(3);
        bicycle.applyBrakes(1);

        System.out.println("Bicycle present state :");
        bicycle.printStates();

        //creating instance of the bike.
        Bike bike = new Bike();
        bike.changeGear(1);
        bike.speedUp(4);
        bike.applyBrakes(3);

        System.out.println("Bike present state :");
        bike.printStates();
    }
}

//ini adalah class privat,public, protected, and default