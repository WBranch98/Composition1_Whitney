package Bedroom;

public class Bed {


 private String style;
 private String size;
 private int numberOfPillows;


 public Bed(String style, String size, int np){
this.style=style;
this.size=size;
this.numberOfPillows = np;

 }
 public String getStyle(){
     return style;
 }
 public String getSize(){
     return size;
 }
 public int getNumberOfPillows(){
     return numberOfPillows;
 }
 public void make(){
     System.out.println("This make() method is from Bed class -- NOT from bedroom class");
 }
}


