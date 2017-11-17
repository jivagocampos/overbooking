package aviao;

public class Airbus extends Aviao {

	@Override
	public String modelo() {
		String modelo = "Airbus";
		return modelo;
	}
	
	@Override
	public int getQuantiaLugares() {
		int quantia = 20;
		return quantia;
	}

	@Override
	public String toString() {
		return "Airbus " + "lugares = " + getQuantiaLugares();
	}
}
