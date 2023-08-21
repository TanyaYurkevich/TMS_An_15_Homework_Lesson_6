public class Comp_test {
    public static void main(String[] args) {
        Computer computer1 = new Computer(1000,"Asus",new Computer.RAM(), new Computer.HDD());
        Computer computer2 = new Computer(1500,"Acer");
        Computer.RAM ram = new Computer.RAM();
        Computer.HDD hdd = new Computer.HDD();
        System.out.println(computer1.toString());
        computer2.outComputer();
    }
}
