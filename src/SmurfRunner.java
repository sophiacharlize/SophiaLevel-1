
public class SmurfRunner {
public static void main(String[] args) {
	Smurf smurf1 = new Smurf("Handy");
	smurf1.eat();
	System.out.println(smurf1.getName());
	
	Smurf smurf2 = new Smurf("Papa");
	System.out.println(smurf2.getName());
	System.out.println(smurf2.getHatColor("red"));
	System.out.println(smurf2.isGirlOrBoy("boy"));
	
	Smurf smurf3 = new Smurf("Smurfette");
	System.out.println(smurf3.getName());
	System.out.println(smurf3.getHatColor("white"));
	System.out.println(smurf3.isGirlOrBoy("girl"));
}
}
