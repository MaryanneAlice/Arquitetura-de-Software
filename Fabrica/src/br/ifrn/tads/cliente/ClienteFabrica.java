package br.ifrn.tads.cliente;

import br.ifrn.tads.abstratos.Chassi;
import br.ifrn.tads.abstratos.FabricaAutomoveis;
import br.ifrn.tads.abstratos.Motor;
import br.ifrn.tads.abstratos.Roda;

public class ClienteFabrica {

	public static void main(String[] args) {
		FabricaAutomoveis fabrica = FabricaAutomoveis.getInstancia();
		Motor m = fabrica.criaMotor();
		Roda r = fabrica.criaRodas();
		Chassi c = fabrica.criaChassi();
		System.out.println(m);
		System.out.println(r);
		System.out.println(c);
	}

}
