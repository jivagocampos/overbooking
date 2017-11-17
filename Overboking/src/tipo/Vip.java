package tipo;

import java.util.ArrayList;
import java.util.List;
import aviao.Passageiro;
import aviao.Tipo;
import aviao.Voo;

public class Vip extends Reserva {

	private List<Passageiro> NaoEmbarca = new ArrayList<>();
	private List<Passageiro> Embarca = new ArrayList<Passageiro>();

	@Override
	public void aplicar(Voo voo) {

		Embarca = voo.getEmbarca();
		Embarca.removeAll(NaoEmbarca(Embarca, voo));
		voo.setEmbarca(Embarca);
	}

	private List<Passageiro> NaoEmbarca(List<Passageiro> Temporaria, Voo voo) {
		double Transferir = voo.getAviao().getQuantiaLugares() * getReservas();

		int count = 0;
		if (verificaCategoria(Temporaria, voo)) {
			for (int i = Temporaria.size() - 1; i >= 0; i--) {
				if (count < Transferir) {

					if (Temporaria.get(i).getCategoria().equals(Tipo.Comum)
							|| (Temporaria.get(i).getCategoria().equals(Tipo.Preferencial))) {
						Temporaria.get(i).setPoltrona(0);
						NaoEmbarca.add(Temporaria.get(i));

						voo.setNaoEmbarca(this.NaoEmbarca);
						count++;
					}
				}
			}
		} else {
			for (int i = Temporaria.size() - 1; i >= 0; i--) {
				if (count < Transferir) {
					Temporaria.get(i).setPoltrona(0);
					NaoEmbarca.add(Temporaria.get(i));
					voo.setNaoEmbarca(this.NaoEmbarca);
					count++;
				}
			}
		}
		return NaoEmbarca;
	}

	@Override
	public double getReservas() {
		return 0.05;
	}

	public boolean verificaCategoria(List<Passageiro> Temporaria, Voo voo) {

		for (Passageiro lista : voo.getEmbarca()) {
			if (lista.getCategoria().equals(Tipo.Comum) || lista.getCategoria().equals(Tipo.Preferencial)) {
				return true;
			}
		}
		return false;
	}
}
