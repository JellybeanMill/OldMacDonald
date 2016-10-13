class Pig extends Cow 
{
	private String myType;
	private String mySound;
	public Pig()
     {
     	myType = "UNKNOWN";
     	mySound = "UNKNOWN";
     }
     public Pig(String inputType, String inputSound)
     {
     	myType = inputType;
     	mySound = inputSound;
     }
	public String getSound()
	{
		String toBeReturned = mySound + " " + mySound;
		return toBeReturned;
	}
}
