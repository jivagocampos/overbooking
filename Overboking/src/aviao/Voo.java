package aviao;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import tipo.Reserva;

public class Voo {

	private static int numeroVoo;
	private Passageiro passageiro;
	private Aviao aviao;
	private Reserva reserva;
	private static int _Poltrona;
	private List<Passageiro> Embarca = new ArrayList<Passageiro>();
	private List<Passageiro> NaoEmbarca = new ArrayList<>();

	public Voo(Aviao aviao, Reserva reserva) {
		numeroVoo++;
		this.reserva = reserva;
		this.aviao = aviao;
	}

	public void efetuaReserva(Passageiro p) {
		this.passageiro = p;
		if (verificaLugares()) {
			if (verificaReserva()) {
				_Poltrona++;
				p.setPoltrona(_Poltrona);
				Embarca.add(p);
				return;
			}
			encerrarEmbarque();
		}
	}

	public boolean verificaLugares() {
		if (_Poltrona < quantiaLugares()) {
			return true;
		}
		return false;
	}

	public double quantiaLugares() {
		double Lugares = (aviao.getQuantiaLugares() + (aviao.getQuantiaLugares() * reserva.getReservas()));
		return Lugares;
	}

	public boolean verificaReserva() {
		for (Passageiro passageiros : Embarca) {
		}
		return true;
	}

	public void cancelarReserva(Passageiro p) {

		if (Embarca.remove(p)) {
			NaoEmbarca.add(p);
		}
	}

	private void aplicar() {
		reserva.aplicar(this);
	}

	public void encerrarEmbarque() {
		this.aplicar();
	}

	public List<Passageiro> getEmbarca() {
		return Embarca;
	}

	public int getNumeroVoo() {
		return numeroVoo;
	}

	public Aviao getAviao() {
		return aviao;
	}

	public Passageiro getPassageiro() {
		return passageiro;
	}

	public void setPassageiro(Passageiro passageiro) {
		this.passageiro = passageiro;
	}

	public List<Passageiro> getNaoEmbarca() {
		return NaoEmbarca;
	}

	public void setNaoEmbarca(List<Passageiro> NaoEmbarca) {
		this.NaoEmbarca = NaoEmbarca;
	}

	public void setEmbarca(List<Passageiro> Embarca) {
		this.Embarca = Embarca;
	}

	@Override
	public String toString() {
		return "Voo [aviao=" + aviao + ", passageiro=" + passageiro + ", getNumeroVoo()=" + getNumeroVoo() + "]"
				+ super.toString();
	}
}
