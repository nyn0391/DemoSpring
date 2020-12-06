package com.accenture.lkm.web.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accenture.lkm.business.bean.Employee;
import com.accenture.lkm.dao.EmployeeDAO;

@Controller
//@RestController
public class EmployeeController {
	EmployeeDAO employeeDAO;
	Map<Integer, Employee> employeeMap;
	
	public EmployeeController(){
	 employeeDAO = new EmployeeDAO();
	 employeeMap = employeeDAO.getEmployeeDetailsMap();
	 System.out.println("Map is: "+employeeMap);
	}
	@RequestMapping(value = "/employee/{id}", 
					produces = { "application/json", "application/xml" }, 
					method = RequestMethod.GET)
	public @ResponseBody Employee getEmployeeById(@PathVariable("id") Integer id) {
		System.out.println("id is: "+id+": From here..."+employeeMap.get(id));
		return employeeMap.get(id);
	}
}
