package com.omanda.ProperRestService;

class EmployeeNotFoundException extends RuntimeException{
        EmployeeNotFoundException(Long id) {
            super("Could not find employee " + id);
        }
}
