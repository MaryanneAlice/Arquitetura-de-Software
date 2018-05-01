package br.ifrn.tads.concretos.esporte;

import br.ifrn.tads.abstratos.Chassi;
import br.ifrn.tads.abstratos.FabricaAutomoveis;
import br.ifrn.tads.abstratos.Motor;
import br.ifrn.tads.abstratos.Roda;

public class FabricaAutomoveisEsporte extends FabricaAutomoveis {

	@Override
	public Motor criaMotor() {
		return new MotorEsporte();
	}

	@Override
	public Roda criaRodas() {
		return new RodaEsporte();
	}

	@Override
	public Chassi criaChassi() {
		return new ChassiEsporte();
	}

}
