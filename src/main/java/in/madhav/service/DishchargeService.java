package in.madhav.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import in.madhav.event.PatientDishchargeEvent;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DishchargeService {

	@Autowired
	private ApplicationEventPublisher publisher;

	
	public String dishcharge(String pId, String pName) {
		log.info("patient discharge process intisted {}", pName);

//		billing.billing();
//		houseKeeping.houseKeeping();
//		notification.notification();
//		recordUpdate.updateRecord();

		// publish an event

		publisher.publishEvent(new PatientDishchargeEvent(this,pId,pName));
		log.info("patient dishcharge process completed" +pName);

		return "Patient " + pName + " with ID" + pId + " discharged successfully";
	}
}
