class NamedCow extends Cow
{
	private String myType;
	private String mySound;
	private String myName;
	public NamedCow(String inputType, String inputName, String inputSound)
	{
		myType = inputType;
		myName = inputName;
		mySound = inputSound;
	}
	public String getName() {return myName;}
}