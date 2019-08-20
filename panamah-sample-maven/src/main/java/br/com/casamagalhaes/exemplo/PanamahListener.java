package br.com.casamagalhaes.exemplo;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import br.com.casamagalhaes.panamah.sdk.PanamahConfig;
import br.com.casamagalhaes.panamah.sdk.PanamahStream;

/**
 * Application Lifecycle Listener implementation class PanamahListener
 *
 */
public class PanamahListener implements ServletContextListener {

	private PanamahStream panamah;

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		try {
			if (panamah != null)
				panamah.flush();
			System.out.println("Panamah flush");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		try {
			System.out.println("Panamah init");
			panamah = PanamahStream.init(PanamahConfig.autoConfigure());
			System.out.println("Panamah init done");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
