
package panamah.sample.gradle;

import br.com.casamagalhaes.panamah.sdk.PanamahConfig;

public class SampleApp {
    public static void main(String[] args) throws Exception {
        PanamahConfig cfg = PanamahConfig.autoConfigure();
        System.out.println(cfg); 

    }
}
