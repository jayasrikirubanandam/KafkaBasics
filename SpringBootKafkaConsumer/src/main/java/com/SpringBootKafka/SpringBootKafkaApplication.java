package com.SpringBootKafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

import com.SpringBootKafka.Configuration.KafkaConstants;

@SpringBootApplication
public class SpringBootKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootKafkaApplication.class, args);
	}

	
	@KafkaListener(topics = KafkaConstants.TOPIC_NAME, groupId="org.springframework.boot")
	public void subscribeMsg(String cxData) {
			System.out.print("* Msg Recieved From Kafka server* :: ");
			System.out.println(cxData);
		
	}
}
