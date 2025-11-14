package org.example.billingservice.feign;


import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.example.billingservice.models.Customer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "customer-service")
public interface CustomerServiceRestClient {
    @GetMapping("/customers/{id}")
    @CircuitBreaker(name = "service-service", fallbackMethod = "getdefaultcustomer")
    Customer findCustomerById(@PathVariable Long id);

    default Customer getdefaultcustomer(Long id, Exception e){
        e.printStackTrace();
        Customer customer = new Customer();
        customer.setId(id);
        customer.setName("DEFAULT ONE");
        customer.setEmail("DEFAULT EMAIL");
        return customer;
    }
}
