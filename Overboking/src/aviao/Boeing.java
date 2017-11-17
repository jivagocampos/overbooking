package aviao;

public class Boeing extends Aviao {

	@Override
	public String modelo() {
		String modelo = "Boeing";
		return modelo;
	}
	
	@Override
	public int getQuantiaLugares() {
		int quantia = 16;
		return quantia;
	}

	@Override
	public String toString() {
		return "Boeing " + "lugares = " + getQuantiaLugares();
	}
}
