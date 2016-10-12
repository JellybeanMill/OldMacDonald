class Chick implements Animal 
{     
     private String myType,mySound;
     public Chick(String inputType,String inputSound1, String inputSound2)
     {
     	myType = inputType;
     	if (Math.random()<0.5)
     	{
     		mySound = inputSound1;
     	}else
     	{
     		mySound = inputSound2;
     	}
     }
}
