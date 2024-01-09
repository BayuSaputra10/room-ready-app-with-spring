package app.roomready.roomready.booking.app.service;

import app.roomready.roomready.booking.app.dto.response.EmployeeResponse;
import app.roomready.roomready.booking.app.entity.Employee;

public interface EmployeeService {

    void create(Employee employee);

    EmployeeResponse getById(String id);

    Employee get(String id);
}