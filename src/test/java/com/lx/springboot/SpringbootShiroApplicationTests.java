package com.lx.springboot;

import com.lx.springboot.service.CustomerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootShiroApplicationTests {

    @Autowired
    private CustomerService customerService;

    @Test
    public void contextLoads() {
        System.out.println(customerService.getById(1));

    }

}
