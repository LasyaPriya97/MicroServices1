package first.example.microservice1.controller;      
import java.util.List;
import java.util.Arrays;
import first.example.microservice1.info.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;



@RestController
@RequestMapping("/employee")
public class TestController {
	@Autowired
	private RestTemplate restTemplate;

@RequestMapping("/{empId}")
	public List<EmployeeData> getEmployee() {
	  List<EmployeeData> employee = Arrays.asList(
			new EmployeeData("Anie", "BNK", "chennai"),
			new EmployeeData("Tony", "RLT", "Pune"),
			new EmployeeData("Marry", "INS", "Mumbai")
			
			  );
   
    return employee;
	}

}