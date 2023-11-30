package Tugas9;

class FactoryPatternDemo {
    public static void main(String[] args) {
        //get shape factory
        ShapeFactory shapeFactory = new ShapeFactory();
        //get an object of Shape Rectangle
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        //call draw method of Shape Rectangle
        //get an object of Shape Square 
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        //call draw method of Shape Square
        shape2.draw();
        //get an object of Shape Rectangle
        Shape shape3 = shapeFactory.getShape("SQUARE");
        //call draw method of Shape Rectangle
        shape3 = shape1;
        shape3.draw();
        shape1.draw();
     }
}
