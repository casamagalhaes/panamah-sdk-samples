
package panamah.sample.gradle;

import br.com.casamagalhaes.panamah.sdk.PanamahAdmin;
import br.com.casamagalhaes.panamah.sdk.PanamahConfig;
import br.com.casamagalhaes.panamah.sdk.PanamahStream;
import br.com.casamagalhaes.panamah.sdk.model.PanamahFuncionario;

public class SampleApp {
    public static void main(String[] args) throws Exception {
        PanamahConfig cfg = PanamahConfig.fromProperties("application");

        cfg.getAuth().getAssinante().setNome("<Nome aqui>");
        cfg.getAuth().getAssinante().setFantasia("<Nome fantasia aqui>");
                
        PanamahAdmin admin = PanamahAdmin.getInstance();

        admin.createAssinante(cfg);
//        admin.createAssinante(cfg);

        PanamahStream stream = PanamahStream.init(cfg);
        
        PanamahFuncionario model = new PanamahFuncionario("123");
        
        stream.delete(model);
        
        stream.flush(true);

    }
}
