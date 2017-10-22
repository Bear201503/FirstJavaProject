package com.learnjava;

public class Car {

    private String color;
    private String brand;
    private String type;

    public void drive(Car abc, String name){
        System.out.println("Driving the ".concat(abc.brand).concat(" car"));

        System.out.println("Owner of this car is ".concat(name));
    }


    public void stop(){
        System.out.println("Stop the car");

    }

    public int getCarCapacity(){

        return 4;
    }
    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public static void main(String[] args) {

        Car toyota = new Car();

        toyota.brand = "Toyota";
        toyota.color = "gray";
        toyota.type = "Suv";
        System.out.println(toyota);
        toyota.drive(toyota,  "Esha");
toyota.stop();
toyota.getCarCapacity();

int totalCarCapacity= toyota.getCarCapacity();
        System.out.println(totalCarCapacity);
        System.out.println("The car capacity is " + totalCarCapacity);
        Car honda = new Car();
        honda.brand = "honda";
        honda.color = "blue";
        honda.type = "Van";
        honda.drive(honda, "Shreya");
        System.out.println(honda);
honda.stop();
honda.getCarCapacity();
        System.out.println(totalCarCapacity);
        System.out.println("The car capacity is " + totalCarCapacity);


    }
}
