package br.ifrn.tads.fabrica.cliente;

import br.ifrn.tads.fabrica.abstratos.FabricaLasanha;
import br.ifrn.tads.fabrica.abstratos.Massa;
import br.ifrn.tads.fabrica.abstratos.Molho;
import br.ifrn.tads.fabrica.abstratos.Recheio;

public class ClienteFabricaLasanha {

	public static void main(String[] args) {
		FabricaLasanha fabrica = FabricaLasanha.getInstancia();
		Massa massa = fabrica.tipoMassa();
		Recheio recheio = fabrica.criarRecheio();
		Molho molho = fabrica.tipoMolho();
		System.out.println(massa);
		System.out.println(recheio);
		System.out.println(molho);
	}

}
