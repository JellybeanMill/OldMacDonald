class Cow implements Animal 
{     
     private String myType,mySound;     
     public Cow(String inputType, String inputSound)
     {
     	myType = inputType;
     	mySound = inputSound;
     }
     public Cow()
     {
          myType = "UNKNOWN";
          mySound = "UNKNOWN";
     }
     public String getType() {return myType;}
     public String getSound() {return mySound;}
}
