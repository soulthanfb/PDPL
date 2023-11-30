class Bike {
    int speedlimit = 150;
}

class Honda extends Bike {
    int speedlimit = 90;

    public static void main(String args[]) {
        Bike obj = new Honda();
        System.out.println(obj.speedlimit);
    }
}