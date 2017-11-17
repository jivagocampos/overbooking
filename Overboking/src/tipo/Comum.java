package tipo;

import java.util.ArrayList;
import java.util.List;
import aviao.Passageiro;
import aviao.Voo;

public class Comum extends Reserva {

	@Override
	public void aplicar(Voo voo) {
		List<Passageiro> Embarca = new ArrayList<Passageiro>();
		Embarca = voo.getEmbarca();
		Embarca.removeAll(NaoEmbarca(voo));
		voo.setEmbarca(Embarca);
	}

	public List<Passageiro> NaoEmbarca(Voo voo) {
		List<Passageiro> NaoEmbarca = new ArrayList<>();
		
		double Transferir = voo.getAviao().getQuantiaLugares() * getReservas();
		int count = 0;

		for (int i = voo.getEmbarca().size() - 1; i >= 0; i--) {
			if (count < Transferir) {
				voo.getEmbarca().get(i).setPoltrona(0);
				NaoEmbarca.add(voo.getEmbarca().get(i));
				
				voo.setNaoEmbarca(NaoEmbarca);
				count++;
			}
		}
		return NaoEmbarca;
	}

	@Override
	public double getReservas() {
		return 0.1;
	}
}
