package lab.microservice.hello;

import javax.ws.rs.Path;

import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "userdb-service")
@LoadBalancerClient(name = "userdb-service",configuration =  LoadBalancerConFiguration.class)
@EnableEurekaClient
public interface UserDBProxy {

    @GetMapping("/users/{id}") 
    public UserDTO getUser (@PathVariable Long id);
    
}

