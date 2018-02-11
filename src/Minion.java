
public class Minion {

	public Minion(String name, int eyes, String color, String master) {
		this.name = name;
		this.eyes = eyes;
		this.color = color;
		this.master = master;
	}
	String name;
	int eyes;
	String color;
	String master;
	
	public String getName() {
		
		return name;
	}
	public int getEyes() {
		return eyes;
	}
	public String getColor() {
		return color;
	}
	public String getMaster() {
		return master;
	}
	
	public String setMaster(String master) {
		return master;
	}
	
}
