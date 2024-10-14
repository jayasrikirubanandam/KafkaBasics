package com.SpringBootKafka.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBootKafka.Model.Customer;
import com.SpringBootKafka.Service.KafkaService;

@RestController
public class Controller {

	@Autowired
	private KafkaService kafkaService;
	
	@PostMapping("/customer")
	public String addCustomerToTopic(@RequestBody Customer cust) {
		
		
		return kafkaService.addMsg(cust);
	}
}
