package Bedroom;

public class Lamp {

   private int numberOfLightBulbs;

   public Lamp(int nl){
       this.numberOfLightBulbs=nl;
   }

    public int getNumberOfLightBulbs() {
        return numberOfLightBulbs;
    }

    public void turnOff(){
       System.out.print("Turn off the lamp");
   }
    public void turnOn(){
        System.out.print("Turn on the lamp");
    }

}
