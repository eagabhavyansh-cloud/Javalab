package oop;

// parent class: generic vehicle with basic functionality
class Vehicle {
    void startEngine() {
        System.out.println("Engine started.");
    }

    public static void main(String[] args) {
        Car mycar = new Car();
        mycar.startEngine(); // Inherited from Vehicle
        mycar.turnOnAC();    // Car specific behavior
    }
}

// child class: Car inherits from Vehicle and adds AC control
class Car extends Vehicle {
    void turnOnAC() {
        System.out.println("Air Conditioner is ON");
    }
}
