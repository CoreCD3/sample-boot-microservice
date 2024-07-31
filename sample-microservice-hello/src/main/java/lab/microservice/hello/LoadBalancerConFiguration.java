package lab.microservice.hello;

import org.springframework.cloud.loadbalancer.core.ServiceInstanceListSupplier;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadBalancerConFiguration {

    public ServiceInstanceListSupplier discoveryCliebInstanceListSupplier(
        ConfigurableApplicationContext context){
            return ServiceInstanceListSupplier.builder().withBlockingDiscoveryClient().build(context);
        }
}
