package com.employee.management.system.helper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.management.system.message.MessageConst;
import com.employee.management.system.message.ResponseStatus;
import com.employee.management.system.pojo.CustomPojo;
import com.employee.management.system.pojo.EmployeePojo;
import com.employee.management.system.repo.EmployeeRepo;

@Service
public class EmployeeHelper {

	@Autowired
	private EmployeeRepo employeeRepo;

	public List<EmployeePojo> addEmployee(CustomPojo employee) {
		ResponseStatus status=null;
		java.util.List<EmployeePojo> update = null;

		if (employee.getEmployeePojo() != null) {

			update = new ArrayList<EmployeePojo>();
			for (EmployeePojo employeePojo : employee.getEmployeePojo()) {
				EmployeePojo setByName = employeePojo.getId() != null
						? employeeRepo.findById(employeePojo.getId()).get()
						: new EmployeePojo();

				setByName.setName(employeePojo.getName());
				setByName.setAddress(employeePojo.getAddress());
				setByName.setSalary(employeePojo.getSalary());
				setByName.setStatus(employeePojo.getStatus());
				setByName = employeeRepo.save(setByName);
				update.add(setByName);
				status=new ResponseStatus(MessageConst.STATUS_OK,"Employee details are added");

			}
		}
		return update;
	}
}
