package br.com.casamagalhaes.exemplo;

import br.com.casamagalhaes.panamah.sdk.PanamahConfig;
import br.com.casamagalhaes.panamah.sdk.PanamahStream;

public class Main {

	public static void main(String[] args) throws Exception {
		PanamahConfig c = PanamahConfig.autoConfigure();
		c.setDelay(300);
		c.setTtl(500);
		PanamahStream.init(c);
		System.out.println("pressione enter para encerrar");
		System.in.read();
	}

}
