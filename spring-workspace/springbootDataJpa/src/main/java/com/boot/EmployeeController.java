package com.boot;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trg.boot.entity.AppResponse;
import com.trg.boot.entity.Employee;
import com.trg.boot.repo.EmployeeRepository;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	
	@Autowired
	EmployeeRepository repo;
	
	@PostMapping()
	public ResponseEntity<?> saveEmployee(@RequestBody Employee e) {
		
		String message;
		String responseCode;
		
		if(repo.existsById(e.getEmpid())) {
			responseCode = "SAVEFAIL";
			message = "Error: Employee with id-" + e.getEmpid() + " already exists!!";
			return new ResponseEntity<AppResponse>(new AppResponse(responseCode,message),HttpStatus.BAD_REQUEST);
		}
		else {
			repo.save(e);
			responseCode = "SUCCESS";
			message = "Employee successfully created!!!";
			return new ResponseEntity<AppResponse>(new AppResponse(responseCode,message),HttpStatus.CREATED);
		}
		
		
	}
	
	

	@GetMapping()
	public ResponseEntity<?> getAllEmployees() {
		
		List<Employee> list = repo.findAll();
		if(list.size() == 0) {
			String responseCode = "FETCHFAIL";
			String message = "No Employee exists in database.";
			return new ResponseEntity<AppResponse>(new AppResponse(responseCode,message),HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<List<Employee>>(list,HttpStatus.OK);
	}
	
	
	
	@GetMapping("{eid}")
	public ResponseEntity<?> getEmployee(@PathVariable("eid") int empid) {
		
		Optional<Employee> opt = repo.findById(empid);
		
		if(opt.isEmpty()) {
			String responseCode = "FETCHFAIL";
			String message = "Employee with id-" + empid + " does not exist in database.";
			return new ResponseEntity<AppResponse>(new AppResponse(responseCode,message),HttpStatus.NOT_FOUND);
		}
		else {
			return new ResponseEntity<Employee>(opt.get(),HttpStatus.OK); 
		}
		
		
		
	}
	
	@PutMapping()
	public ResponseEntity<?> updateEmployee(@RequestBody Employee e) {
		String message;
		String responseCode;
		if(repo.existsById(e.getEmpid())) {
			repo.save(e);
			responseCode = "SUCCESS";
			message = "Employee successfully updated!!!";
			return new ResponseEntity<AppResponse>(new AppResponse(responseCode,message),HttpStatus.OK);
		}
		else {
			responseCode = "UPDATEFAIL";
			message = "Error!! Employee with id-" + e.getEmpid() + " does not exists.";
			return new ResponseEntity<AppResponse>(new AppResponse(responseCode,message),HttpStatus.NOT_FOUND);
		}
		
	}
	
	
	@DeleteMapping("{eid}")
	public ResponseEntity<?> deleteEmployee(@PathVariable("eid") int empid) {
		
		String message;
		String responseCode;
		
		if(repo.existsById(empid)) {
			repo.deleteById(empid);
			responseCode = "SUCCESS";
			message = "Employee with id-" + empid + " successfully deleted.";
			return new ResponseEntity<AppResponse>(new AppResponse(responseCode,message),HttpStatus.OK);
		}
		else {
			responseCode = "DELETEFAIL";
			message = "Error: Employee with id-" + empid + " does not exist.";
			return new ResponseEntity<AppResponse>(new AppResponse(responseCode,message),HttpStatus.NOT_FOUND);
		}
		
		
	}
	
	@GetMapping("sal-range/{low}/{high}")
	public ResponseEntity<?> getEmployeesOnSalRagne(@PathVariable("low") float low, @PathVariable("high") float high) {
		
		List<Employee> list = repo.findBySalaryBetween(low,high);
		if(list.size() == 0) {
			String responseCode = "FETCHFAIL";
			String message = "No Employee satisfying the criteria.";
			return new ResponseEntity<AppResponse>(new AppResponse(responseCode,message),HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<List<Employee>>(list,HttpStatus.OK);
	}
	
	@GetMapping("sal-greater-than/{low}")
	public ResponseEntity<?> getEmployeesOnSalGT(@PathVariable("low") float low) {
		
		List<Employee> list = repo.findBySalGT(low);
		if(list.size() == 0) {
			String responseCode = "FETCHFAIL";
			String message = "No Employee satisfying the criteria.";
			return new ResponseEntity<AppResponse>(new AppResponse(responseCode,message),HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<List<Employee>>(list,HttpStatus.OK);
	}
	
	@GetMapping("by-name/{name}")
	public ResponseEntity<?> getEmployeesByName(@PathVariable("name") String name) {
		
		List<Employee> list = repo.findByName(name);
		if(list.size() == 0) {
			String responseCode = "FETCHFAIL";
			String message = "No Employee satisfying the criteria.";
			return new ResponseEntity<AppResponse>(new AppResponse(responseCode,message),HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<List<Employee>>(list,HttpStatus.OK);
	}
	
	

}
