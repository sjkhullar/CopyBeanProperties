package org.learn;

import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;

public class DemoCopyProperties {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {

        //Create destination object
        EmployeeDTO employeeDTO = new EmployeeDTO();

        //Simulate database operation
        EmployeeDB employeeFromDB = getObjectFromDatabase();

        System.out.println("1. EmployeeDB Object (Source bean) from database :");
        System.out.println(employeeFromDB);
        BeanUtils.copyProperties(employeeDTO,employeeFromDB);

        System.out.println("2. Convert EmployeeDB (source) object to EmployeeDTO (destination bean):");
        System.out.println(employeeDTO);
    }

    private static EmployeeDB getObjectFromDatabase() {
        EmployeeDB employeeDB = new EmployeeDB("Mike","Young", 22,2,
        10000, new Date(),new Date());

        return employeeDB;
    }
}
