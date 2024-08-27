class Box {
    double width;
    double height;
    double depth;

    // if you define any one constructor in class, deafualt won't be created by java
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
public class CopyConstructor {
    public static void main(String[] args) {
        Box box1 = new Box(10, 20, 15);
        Box box2 = new Box(box1);
        double vol = box2.getVolume();
        System.out.println("Ans: " + vol);
    }
}
