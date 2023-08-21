public class Computer {
    int price;
    String model;
    RAM ram;
    HDD hdd;
    public Computer(int price, String model) {
        this.price = price;
        this.model = model;
    }
    public Computer(int price, String model, Computer.RAM ram, Computer.HDD hdd ) {
        this.price = price;
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;
    }
    public void outComputer(){
        System.out.println("Модель-цена: " + this.model +" "+this.price);
    }
    @Override
    public String toString() {
        return "Computer{" +
                "price=" + price +
                ", model='" + model + '\'' +
                ", ram=" + ram +
                ", hdd=" + hdd +
                '}';
    }
    static class RAM {
        String name;
        int amount;

        public RAM() {
            this.name = "Samsung";
            this.amount = 16;

        }

        public RAM(String name, int amount) {
            this.amount = amount;
            this.name = name;
        }

        @Override
        public String toString() {
            return "RAM{" +
                    "name='" + name + '\'' +
                    ", amount=" + amount +
                    '}';
        }
    }
    static class HDD {
        String name;
        int amount;
        String type;

        public HDD() {
            this.name = "Seagate";
            this.amount = 500;
            this.type = "internal";
        }
        public HDD(String name, int amount, String type) {
            this.amount = amount;
            this.name = name;
            this.type = type;
        }
        @Override
        public String toString() {
            return "HDD{" +
                    "name='" + name + '\'' +
                    ", amount=" + amount +
                    ", type='" + type + '\'' +
                    '}';
        }
    }
}
