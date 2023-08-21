// TODO
// добавить метод добаваления новых контейнов в уже сущесвующий массив контейнеров
// public void addContainers(Container[] containers)

// TODO
// добавить метод для вывода стоимости всех контейнеров
// возвращаемый тип данных - число с плавающей точкой

// TODO
//добавить метод для вывода максимальной цены
// TODO
// добавить конструктов только с одним параметром - address
public class Warehouse {
    public String address;
    public ShipСontainer[] containers;
    // Constructors

    public Warehouse(String address) {
        this.address = address;
    }
    public Warehouse(String address, ShipСontainer[] containers) {
        this.address = address;
        this.containers = containers;
    }

    // Methods
    public void setContainers(ShipСontainer[] containers) {
        this.containers = containers;
        System.out.println("Добавлено контейнеров:  " );

    }
    public double getSumPrice() {
        double sum = 0;
        for (int i = 0; i < this.containers.length; i++) {
            sum = sum + this.containers[i].price;
        }
        return sum;
    }
    public void chooseMaxPrice() {
        double max = this.containers[0].price;
        for (int i = 0; i < this.containers.length; i++) {
            if (max < this.containers[i].price) {
                max = this.containers[i].price;
                System.out.println("Максимальная цена: " +max);
            }
        }
    }
}

