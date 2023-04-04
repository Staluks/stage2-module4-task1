package com.mjc.stage2;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@EqualsAndHashCode
@ToString
public class Employee {
    private String name;
    private String lastName;
    private String position;
    private String phone;
    private String email;
    private String carNumber;

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public static EmployeeBuilder getBuilder() {
        return new EmployeeBuilder();
    }


    public static class EmployeeBuilder implements PeopleBuilder{
        private Employee employee;
        private String name;
        private String lastName;
        private String position;
        private String phone;
        private String email;
        private String carNumber;

        public EmployeeBuilder(){
            this.employee = new Employee();
        }

        @Override
        public void setName(String name) {
            employee.setName(name);
        }

        @Override
        public void setLastName(String lastName) {
            employee.setLastName(lastName);
        }

        @Override
        public void setPosition(String position) {
            employee.setPosition(position);
        }

        @Override
        public void setPhone(String phone) {
            employee.setPhone(phone);
        }

        @Override
        public void setEmail(String email) {
            employee.setEmail(email);
        }

        @Override
        public void setCarNumber(String carNumber) {
            employee.setCarNumber(carNumber);
        }

        @Override
        public Employee getEmployee() {
            return this.employee;
        }
    }
    public interface PeopleBuilder{
        void setName(String name);
        void setLastName(String lastName);
        void setPosition(String position);
        void setPhone(String phone);
        void setEmail(String email);
        void setCarNumber(String carNumber);
        Employee getEmployee();

    }

}
