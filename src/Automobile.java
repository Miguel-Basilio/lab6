
public class Automobile{
   int doors;
   int cylinders;
   String color;
   String name;
   int transmission;
   
   public Automobile () {
	   doors = 4;
	   cylinders = 6;
	   name = "Car";
	   
   }
   public int setNumberofDoors (int d){
	   doors = d;
	   return doors;
	      }
   public int setNumberofCylinders (int c){
	   cylinders = c;
			   return cylinders;
   }
   public String setColor (String Cl){
	   color = Cl;
	   return color;
   }
   public String setName(String n){
	   name= n;
	   return name;
   }
   public int setTransmission(int t){
	   transmission = t;
			   return transmission;
	   
   }

   public String info(){
	   String nameA = "Number of doors: " + doors+ "Number of cylinders: " + cylinders; 
       nameA = nameA +"Transmission: " + transmission; 
       nameA= nameA +"Color: " + color; 
       nameA = nameA +"Name: " + name; 
        return nameA; 
   }
	   
   
	

}
