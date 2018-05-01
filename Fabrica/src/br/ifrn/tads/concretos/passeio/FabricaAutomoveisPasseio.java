package br.ifrn.tads.concretos.passeio;

import br.ifrn.tads.abstratos.Chassi;
import br.ifrn.tads.abstratos.FabricaAutomoveis;
import br.ifrn.tads.abstratos.Motor;
import br.ifrn.tads.abstratos.Roda;

public class FabricaAutomoveisPasseio extends FabricaAutomoveis {

	@Override
	public Motor criaMotor() {
		return new MotorPasseio();
	}

	@Override
	public Roda criaRodas() {
		return new RodaPasseio();
	}

	@Override
	public Chassi criaChassi() {
		return new ChassiPasseio();
	}

}
