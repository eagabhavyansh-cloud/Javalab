package oop;

class Thermostat {
double temperature;
String mode;
boolean fanOn;

public Thermostat() {
this.temperature = 72.0;
this.mode = "Eco";
this.fanOn = false;}
  
 public Thermostat(double temperature) {
this.temperature = temperature;
this.mode = "Auto";
this.fanOn = true;
    }

  public Thermostat(double temperature, String mode, boolean fanOn) {
this.temperature = temperature;
this.mode = mode;
this.fanOn = fanOn;
    }  
public void showSettings() {
    System.out.println("Thermostat -> Temp: " + temperature + "°F | Mode: " + mode + " | Fan: " + fanOn);

}    
}
   public class SmartHome {
public static void main(String[] args) {
        Thermostat livingRoom = new Thermostat();
        Thermostat bedroom = new Thermostat(68.5);
        Thermostat serverRoom = new Thermostat(62.0, "Cooling", true);
        livingRoom.showSettings();
        bedroom.showSettings();
        serverRoom.showSettings();
    }
}
