package br.com.casamagalhaes.exemplo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;

import br.com.casamagalhaes.panamah.sdk.PanamahConfig;
import br.com.casamagalhaes.panamah.sdk.PanamahStream;
import br.com.casamagalhaes.panamah.sdk.model.PanamahCompra;
import br.com.casamagalhaes.panamah.sdk.model.PanamahCompraItens;

public class Main {

	public static void main(String[] args) throws Exception {
		PanamahConfig c = PanamahConfig.autoConfigure();
//		c.setDelay(300);
//		c.setTtl(500);
		PanamahStream stream = PanamahStream.init(c);
		System.out.println("adicionar 700 itens");
		System.in.read();
		int i = 700;
		while(i-->0) {
			PanamahCompra compra = new PanamahCompra();
			compra.setId("aaaaa");
			compra.setLojaId("aaaa");
			compra.setDataEntrada(new Date());
			compra.setDataEmissao(new Date());
			compra.setDataHoraCompra(new Date());
			compra.setQuantidadeItens(new BigDecimal(1.1));
			compra.setValor(new BigDecimal(110));
			compra.setEfetiva(true);
			compra.setItens(new ArrayList<PanamahCompraItens>());
			stream.save(compra);
		}
		stream.flush();
		System.out.println("pressione enter para encerrar");
		System.in.read();
	}

}
