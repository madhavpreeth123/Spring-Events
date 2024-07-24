package in.madhav.handler;

import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import in.madhav.event.PatientDishchargeEvent;

@Component
public class BillingService {

	@EventListener
	@Async
	public void billing(PatientDishchargeEvent event) {
		System.out.println("billing-service: billing service completed "+event.getPname()+" : "+Thread.currentThread().getName());
	}
}
