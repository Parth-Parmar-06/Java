class Box {
    double width;
    double height;
    double depth;

    public void setDimensions(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    public double getVolume() {
        return (width*height*depth);
    }
}
public class DefaultConstructor {
    public static void main(String[] args) {
        Box box1 = new Box();
        box1.setDimensions(3, 6, 9);
        double vol = box1.getVolume();
        System.out.println("Ans 1: " + vol);
        
        Box box2 = new Box();
        vol = box2.getVolume();
        System.out.println("Ans 2: " + vol);
    }
}
