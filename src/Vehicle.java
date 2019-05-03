public class Vehicle {

    Vehicle(int numberOfWheels){
        this.numberOfWheels = numberOfWheels;
    }

    int numberOfWheels;

    public void handSteer(){
        System.out.println("Hand steering");
    }

    public void changeGear(){
        System.out.println("Changing gears");
    }

    public void moving(){
        System.out.println("Moving");
    }

    public void display(){
        System.out.println("Number of wheels: "+numberOfWheels);
    }

}

class Car extends Vehicle{

    Car(String company, int numberOfWheels){
        super(numberOfWheels);
        this.company = company;
    }

    String company;

    public void display(){
        System.out.println("Company Name: "+company);
        super.display();
    }

}

class HondaCity extends Car{
    HondaCity(long registerNumber, String company, int numberOfWheels){
        super(company, numberOfWheels);
        this.registerNumber = registerNumber;
    }
    long registerNumber;
    public void display(){
        System.out.println("Register Number: "+registerNumber);
        super.display();
    }
}
class VehicleDemo{
    public static void main(String[] args) {

        Car hondaCity = new HondaCity(123456, "Honda", 4);
//        HondaCity hondaCity1 = new Car( "Honda", 4);
//        HondaCity hondaCity2 = new Vehicle(4);

        hondaCity.display();

    }
}