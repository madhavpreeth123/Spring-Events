package in.madhav.handler;

import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import in.madhav.event.PatientDishchargeEvent;

@Component
public class RecordUpdateHandler {

	@EventListener
	@Async
	public void updateRecord(PatientDishchargeEvent event ) {
		System.out.println("record-service: updated patient record"+ event.getPname()+" : "+Thread.currentThread().getName());
	}
}
