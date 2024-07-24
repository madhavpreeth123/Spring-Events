package in.madhav.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.madhav.dto.PatientRequest;
import in.madhav.service.DishchargeService;

@RestController
public class DishchargeController {

	@Autowired
	private DishchargeService service;
	
	@PostMapping("/process")
	public String dishcharge(@RequestBody PatientRequest request) {
		
		
		
		return service.dishcharge(request.getPid(), request.getPname());
	}
}
