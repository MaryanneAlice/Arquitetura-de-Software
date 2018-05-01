package br.ifrn.tads.fabrica.concentro.normal;

import br.ifrn.tads.fabrica.abstratos.FabricaLasanha;
import br.ifrn.tads.fabrica.abstratos.Massa;
import br.ifrn.tads.fabrica.abstratos.Molho;
import br.ifrn.tads.fabrica.abstratos.Recheio;

public class FabricaLasanhaNormal extends FabricaLasanha {

	@Override
	public Molho tipoMolho() {
		return new MolhoNormal();
	}

	@Override
	public Recheio criarRecheio() {
		// TODO Auto-generated method stub
		return new RecheioNormal();
	}

	@Override
	public Massa tipoMassa() {
		// TODO Auto-generated method stub
		return new MassaNormal();
	}

	
}
