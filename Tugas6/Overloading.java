public class Overloading {
    
}

//class 1
//helper class
class Helper {

    //methds with 2 integer parameters
    static int Multiply(int a, int b)

    {
        //return product of integers numbers
        return a * b;
    }

    //method 2
    //with same  name but with  2 double paramaters 
    static double Multiply(double a, double b)

    {
        //return product of double numbers
        return a * b;
    }
}

//class 2 
// main class 
class CFG {
    //MAIN DRIVER METHOD
    public static void main(String[] args)
    {
        //calling method by passing 
        //input as in arguments
        System.out.println(Helper.Multiply(2, 4));
        System.out.println(Helper.Multiply(5.5, 6.2));
    }
}

