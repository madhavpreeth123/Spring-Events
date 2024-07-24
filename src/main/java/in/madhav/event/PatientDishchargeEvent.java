package in.madhav.event;

import org.springframework.context.ApplicationEvent;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PatientDishchargeEvent extends ApplicationEvent{

	private String pname;
	private String pid;
	
	public PatientDishchargeEvent(Object source,String pid,String pname) {
		
		super(source);
		this.pid=pid;
		this.pname=pname;
		// TODO Auto-generated constructor stub
	}

	
}
