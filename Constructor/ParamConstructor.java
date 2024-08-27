class Box {
    double width;
    double height;
    double depth;

    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
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
public class ParamConstructor {
    public static void main(String[] args) {
        Box box1 = new Box(10, 20, 15);
        double vol = box1.getVolume();
        System.out.println("Ans: " + vol);
    }
}
