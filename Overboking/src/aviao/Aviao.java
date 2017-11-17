package aviao;

public abstract class Aviao {
	
	protected String tipoAviao;
	
	protected int quantiaPassageiros;
	
	public abstract int getQuantiaLugares();

	public abstract String modelo();
}
