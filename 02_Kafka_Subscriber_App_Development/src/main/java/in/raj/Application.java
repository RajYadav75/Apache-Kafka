package in.raj;

import in.raj.constants.AppConstants;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    @KafkaListener(topics = AppConstants.TOPIC_NAME, groupId="group_raj_order")
    public void subscribeMsg(String order) {
        System.out.print("*** Msg Recieved From Kafka *** :: ");
        System.out.println(order);
        //logic
    }

}
