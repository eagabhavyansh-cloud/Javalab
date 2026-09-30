// parent class: Genric vehical with basic functionally 
class Vehicle {
    void startEngine() {
        System.out.println("Engine started.");
    }
}
    //child class: car inherits from vehicle and adds AC control
    class car extends vehicle {
        void turnOnAC() {
            System.out.prinln("Air Conditioner is ON ");
        }
    }
        public static void main (String [] args) {
            Car mycar = new Car();
            mycar.startEngine(); // Inherited from Vehicle
            mycar.turnOnAC(); // Carspecific behavior
        }
    