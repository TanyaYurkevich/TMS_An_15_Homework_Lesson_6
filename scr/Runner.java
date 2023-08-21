public class Runner {
    public static void main(String[] args) {
        System.out.println("Start");

        Warehouse warehouse1 = new Warehouse("Somewhere");

        ShipСontainer container1 = new ShipСontainer(10,20,30,150, "Toshiba");
        ShipСontainer container2 = new ShipСontainer(7,15,22,120,"Toshiba");
        ShipСontainer container3 = new ShipСontainer(15,25,35,180,"Toshiba");

        ShipСontainer[] containers = new ShipСontainer[3];
        containers[0] = container1;
        containers[1] = container2;
        containers[2] = container3;

        warehouse1.setContainers(containers);

        double multiPrise = warehouse1.getSumPrice();
        System.out.println("Стоимость всех контейнеров:" + multiPrise);
        warehouse1.chooseMaxPrice();

        System.out.println("End");
    }

}


