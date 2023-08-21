public class ShipСontainer {
    int width;
    int length;
    int depth;
    double price;
    String containerModel;

    // TODO
    // доваить еще одно для описание стоимости контейнера

    // Constructors
    public ShipСontainer() {
        System.out.println("без параметров");
        this.width = 10;
        this.length = 20;
        this.depth = 30;
        this.containerModel = "Siemens";
    }

    public ShipСontainer(int width, int length, int depth) {
        System.out.println("с параметрами");
        this.width = width;
        this.length = length;
        this.depth = depth;
        this.containerModel = "Siemens";
    }

    public ShipСontainer(int width, int length, int depth, double price, String boxModel) {
        this.width = width;
        this.length = length;
        this.depth = depth;
        this.price = price;
        this.containerModel = boxModel;
    }

}


