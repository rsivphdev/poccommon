package pssg.poc.common.model;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // allows to import this class
@ComponentScan(basePackages = "pssg.poc.common.model") // Scan for beans and other configuration classes
public class ModelApplication {

	

}

