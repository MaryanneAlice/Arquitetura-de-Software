package br.ifrn.tads.fabrica.concreto.light;

import br.ifrn.tads.fabrica.abstratos.FabricaLasanha;
import br.ifrn.tads.fabrica.abstratos.Massa;
import br.ifrn.tads.fabrica.abstratos.Molho;
import br.ifrn.tads.fabrica.abstratos.Recheio;

public class FabricaLasanhaLight extends FabricaLasanha {

	@Override
	public Molho tipoMolho() {
		return new MolhoLight();
	}

	@Override
	public Recheio criarRecheio() {
		return new RecheioLight();
	}

	@Override
	public Massa tipoMassa() {
		return new MassaLight();
	}

}
