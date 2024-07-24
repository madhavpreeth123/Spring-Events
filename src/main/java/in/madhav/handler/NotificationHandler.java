package in.madhav.handler;

import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import in.madhav.event.PatientDishchargeEvent;

@Component
public class NotificationHandler {

	@Async
	@EventListener
	public void notification(PatientDishchargeEvent event){
		System.out.println("notification-service: notification sending to patient"+event.getPname()+" : "+Thread.currentThread().getName());
	}
}
