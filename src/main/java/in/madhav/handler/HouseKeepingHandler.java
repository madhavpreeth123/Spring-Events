package in.madhav.handler;

import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import in.madhav.event.PatientDishchargeEvent;

@Component
public class HouseKeepingHandler {

	@EventListener
	@Async
	public void houseKeeping(PatientDishchargeEvent event) {
		//prepare the room for next patient
		System.out.println("House keeping service: preparing room for next patient"+":"+event.getPid()+" : "+Thread.currentThread().getName());
	}
}
