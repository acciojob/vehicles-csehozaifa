package com.driver;

public class Car extends Vehicle {
    private int wheels;
    private String type;
    int doors;
    int gears;
    private boolean isManual;
    private int currentGear;
    private int seats;

    public Car(String name, int wheels, int doors, int gears, boolean isManual, String type, int seats) {
        //Hint: Car extends Vehicle
        super(name);//calling the parent constructors
        this.wheels=wheels;
        this.doors=doors;
        this.gears=gears;
        this.isManual=isManual;
        this.type=type;
        this.seats=seats;
        this.currentGear=1;
    }

    public void changeGear(int newGear){
        currentGear=newGear;

        System.out.println("changeGear method called - The gear is changed to: " + currentGear);
    }

    public void changeSpeed(int newSpeed, int newDirection){
        move(newSpeed,newDirection);//parent class function

        System.out.println("changeSpeed method called - The speed is changed to: " + newSpeed + ", and the direction is changed to: " + newDirection + " degrees");
    }
}
