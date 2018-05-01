package br.ifrn.tads.fabrica.abstratos;

import java.io.InputStream;
import java.util.Properties;

import br.ifrn.tads.fabrica.concentro.normal.FabricaLasanhaNormal;
import br.ifrn.tads.fabrica.concreto.light.FabricaLasanhaLight;

public abstract class FabricaLasanha {
	
	public abstract Molho tipoMolho();
	public abstract Recheio criarRecheio();
	public abstract Massa tipoMassa();
	
	private static FabricaLasanha fabrica;
	
	public static FabricaLasanha getInstancia() {
		Properties prop = new Properties();
		InputStream is = null;
		String tipo = "";
		try {
			is = FabricaLasanha.class.getResourceAsStream("config.prop");
			prop.load(is);
			tipo = prop.getProperty("tipo");
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (fabrica == null) {
			if (!tipo.isEmpty() && tipo.equals("normal")) {
				fabrica = new FabricaLasanhaNormal();
			} else {
				fabrica = new FabricaLasanhaLight();	
			}
		}
		return fabrica;
	}
	
}