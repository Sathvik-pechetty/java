public class Car {
    private String model;
    private int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void updateCar(Car car) {
        this.model = car.getModel();
        this.year = car.getYear();
    }

    public void updateCar(String model, int year) {
        this.model = model;
        this.year = year;
    }
}

public class Main {

    public static void main(String[] args) {
        Car c = new Car("Toyota", 2020);
        System.out.println("Original Car: Model = " + c.getModel() + ", Year = " + c.getYear());

        Car c1 = new Car("Honda", 2022);
        c.updateCar(c1);
        System.out.println("Updated Car (from object): Model = " + c.getModel() + ", Year = " + c.getYear());

        c.updateCar("Ford", 2023);
        System.out.println("Updated Car (from parameters): Model = " + c.getModel() + ", Year = " + c.getYear());
    }
}
