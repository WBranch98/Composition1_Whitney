package Bedroom;

public class Bedroom {
    Wall wall1;
    Wall wall2;
    Wall wall3;
    Wall wall4;

    Ceiling ceiling;

    Lamp lamp;

    Bed bed;




public Bedroom(){
this(new Wall("North"), new Wall("South"), new Wall("east"),new Wall("West"), new Ceiling(30, "Light Blue"), new Lamp(3 ), new Bed( "Classic", "King", 4 ));
}


public Bedroom(Wall w1, Wall w2, Wall w3, Wall w4, Ceiling ceiling, Lamp lamp, Bed bed) {
this.wall1=w1;
this.wall2=w2;
this.wall3=w3;
this.wall4=w4;

this.ceiling=ceiling;

this.lamp=lamp;

this.bed=bed;


}


    public Wall getWall1() {
        return wall1;
    }

    public Wall getWall2() {
        return wall2;
    }

    public Wall getWall3() {
        return wall3;
    }

    public Wall getWall4() {
        return wall4;
    }

    public Ceiling getCeiling() {
        return ceiling;
    }

    public Lamp getLamp() {
        return lamp;
    }

    public Bed getBed() {
        return bed;
    }
    public void makeBed(){
        System.out.print("makeBed() method is called. This method is from Bedroom");
        this.make();// from Bedroom class

        bed.make(); // from Bed class
    }
    public void make(){
        System.out.print("make() method is called. This make method is from Bedroom class");
        straightenSheet();
    }
    public void straightenSheet(){
        System.out.print("straightenSheet() method from Bedroom class is called");
        System.out.print("Straighten Sheet ");

    }
}