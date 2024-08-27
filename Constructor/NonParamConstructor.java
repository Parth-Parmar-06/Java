class Box {
    double width;
    double height;
    double depth;

    public Box() {
        width = 10;
        height = 10;
        depth = 10;
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
public class NonParamConstructor {
    public static void main(String[] args) {
        Box box1 = new Box();
        double vol = box1.getVolume();
        System.out.println("Ans: " + vol);
    }
}
