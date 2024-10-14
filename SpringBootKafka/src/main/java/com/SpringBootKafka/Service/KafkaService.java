package com.SpringBootKafka.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.SpringBootKafka.Configuration.KafkaConstants;
import com.SpringBootKafka.Model.Customer;

@Service
public class KafkaService {

	@Autowired
	private KafkaTemplate<String, Customer> kafkaTemplate;
	
	

	public String addMsg(Customer cust) {
		kafkaTemplate.send(KafkaConstants.TOPIC_NAME, cust);
		return "Msg Published To Kafka Topic";
		
	}
}
