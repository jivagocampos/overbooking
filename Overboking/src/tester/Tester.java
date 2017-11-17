package tester;

import aviao.Airbus;
import aviao.Boeing;
import aviao.Passageiro;
import aviao.Tipo;
import aviao.Voo;
import tipo.Comum;
import tipo.Vip;

public class Tester {

	public static void main(String[] args) {

		Airbus airbus = new Airbus();
		Boeing boeing = new Boeing();

		Comum comum = new Comum();
		Vip vip = new Vip();

		Passageiro p1 = new Passageiro("1", "Valentino", Tipo.Vip, 1);
		Passageiro p2 = new Passageiro("2", "Vettel", Tipo.Vip, 2);
		Passageiro p3 = new Passageiro("3", "Sandra", Tipo.Comum, 3);
		Passageiro p4 = new Passageiro("4", "Odair", Tipo.Vip, 4);
		Passageiro p5 = new Passageiro("5", "Jonas", Tipo.Comum, 5);
		Passageiro p6 = new Passageiro("6", "Cristiano", Tipo.Vip, 6);
		Passageiro p7 = new Passageiro("7", "Jose", Tipo.Vip, 7);
		Passageiro p8 = new Passageiro("8", "Romeu", Tipo.Comum, 8);
		Passageiro p9 = new Passageiro("9", "Thiago", Tipo.Vip, 9);
		Passageiro p10 = new Passageiro("10", "Paulo", Tipo.Vip, 10);
		Passageiro p11 = new Passageiro("11", "Simone", Tipo.Vip, 11);
		Passageiro p12 = new Passageiro("12", "Ana", Tipo.Vip, 12);
		Passageiro p13 = new Passageiro("13", "Diego", Tipo.Comum, 13);
		Passageiro p14 = new Passageiro("14", "Marcelo", Tipo.Vip, 14);
		Passageiro p15 = new Passageiro("15", "Calypso", Tipo.Comum, 15);
		Passageiro p16 = new Passageiro("16", "Daniela", Tipo.Vip, 16);
		Passageiro p17 = new Passageiro("17", "Marina", Tipo.Vip, 17);
		Passageiro p18 = new Passageiro("18", "Michelle", Tipo.Vip, 18);
		Passageiro p19 = new Passageiro("19", "Luan", Tipo.Comum, 19);
		Passageiro p20 = new Passageiro("20", "Paulo", Tipo.Vip, 20);
		Passageiro p21 = new Passageiro("21", "Anderson", Tipo.Vip, 21);
		Passageiro p22 = new Passageiro("22", "Vitor", Tipo.Vip, 22);
		Passageiro p23 = new Passageiro("23", "Alex", Tipo.Comum, 23);
		Passageiro p24 = new Passageiro("24", "Jorge", Tipo.Vip, 24);

		Voo voo = new Voo(airbus, comum);
		voo.efetuaReserva(p1);
		voo.efetuaReserva(p2);
		voo.efetuaReserva(p3);
		voo.efetuaReserva(p4);
		voo.efetuaReserva(p5);
		voo.efetuaReserva(p6);
		voo.efetuaReserva(p7);
		voo.efetuaReserva(p8);
		voo.efetuaReserva(p9);
		voo.efetuaReserva(p10);
		voo.efetuaReserva(p11);
		voo.efetuaReserva(p12);
		voo.efetuaReserva(p13);
		voo.efetuaReserva(p14);
		voo.efetuaReserva(p15);
		voo.efetuaReserva(p16);
		voo.efetuaReserva(p17);
		voo.efetuaReserva(p18);
		voo.efetuaReserva(p19);
		voo.efetuaReserva(p20);
		voo.efetuaReserva(p21);
		voo.efetuaReserva(p22);
		voo.efetuaReserva(p23);
		voo.efetuaReserva(p24);
		voo.encerrarEmbarque();

		System.out.println(airbus.toString());
		System.out.println(" Listagem embarcados  ");
		for (Passageiro p : voo.getEmbarca()) {
		System.out.println(p);
		}
		System.out.println(" Listagem não embarcados ");
		for (Passageiro p : voo.getNaoEmbarca()) {
			System.out.println(p);
		}
	}
}
