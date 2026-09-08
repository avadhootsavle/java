class Box {
    double height, width, depth;
    Box() { }
    Box(double h, double w, double d) {
        height = h;
        width = w;
        depth = d;
    }
    void getBox() {
        System.out.println("height: " + height);
        System.out.println("width: " + width);
        System.out.println("depth: " + depth);
    }
    double volume() {
        return height * depth * width;
    }
}
class BoxWeight extends Box {
    double weight;
    BoxWeight(double h, double w, double d, double m) {
        super(h, w, d);
        weight = m;
    }
} 
class Shipment extends BoxWeight {
    double cost;
    Shipment(double h, double w, double d, double m, double c) {
        super(h, w, d, m);
        cost = c;
    }

}

class BoxShip {
    public static void main(String[] args) {
        Shipment b1 = new Shipment(10, 20, 15, 34.5, 100); 
        System.out.println("volume = " + b1.volume());
        System.out.println("weight = " + b1.weight);
        System.out.println("cost = " + b1.cost);
    }
}
