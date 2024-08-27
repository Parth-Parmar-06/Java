class Box {
    double width;
    double height;
    double depth;

    public Box() {
        width = 10;
        height = 10;
        depth = 10;
    }

    public Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    public Box(Box b) {
        width = b.width;
        height = b.height;
        depth = b.depth;
    }

    public void setDimensions(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    public double getVolume() {
        return (width*height*depth);
    }
}
public class AllConstructor {
    public static void main(String[] args) {
        // Initializing with default values
        Box box1 = new Box();
        box1.setDimensions(3, 4, 5);
        double vol;
        vol = box1.getVolume();
        System.out.println("Ans 1: " + vol);
        
        // Initializing with given values
        Box box2 = new Box(10, 15, 2);
        vol = box2.getVolume();
        System.out.println("Ans 2: " + vol);

        // Initializing with given object 
        Box box3 = new Box(box2);
        vol = box3.getVolume();
        System.out.println("Ans 2: " + vol);
    }
}
