package br.ifrn.tads.abstratos;

import java.io.InputStream;
import java.util.Properties;

import br.ifrn.tads.concretos.esporte.FabricaAutomoveisEsporte;
import br.ifrn.tads.concretos.passeio.FabricaAutomoveisPasseio;

public abstract class FabricaAutomoveis {
	public abstract Motor criaMotor();
	public abstract Roda criaRodas();
	public abstract Chassi criaChassi();
	
	private static FabricaAutomoveis fabrica;
	
	public static FabricaAutomoveis getInstancia() {
		Properties prop = new Properties();
		InputStream is = null;
		String tipo = "";
		try {
			is = FabricaAutomoveis.class.getResourceAsStream("config.prop");
			prop.load(is);
			tipo = prop.getProperty("tipo");
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (fabrica == null) {
			if (!tipo.isEmpty() && tipo.equals("passeio")) {
				fabrica = new FabricaAutomoveisPasseio();
			} else {
				fabrica = new FabricaAutomoveisEsporte();	
			}
		}
		return fabrica;
	}
}
