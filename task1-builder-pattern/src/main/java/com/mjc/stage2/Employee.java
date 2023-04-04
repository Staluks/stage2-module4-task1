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

    public Employee(EmployeeBuilder employeeBuilder) {
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


    public static class EmployeeBuilder {
        private String name;
        private String lastName;
        private String position;
        private String phone;
        private String email;
        private String carNumber;
        public EmployeeBuilder name(String a) {
                this.name = a;
                return this;
            }
        public EmployeeBuilder lastName(String b) {
            this.lastName = b;
            return this;
        }
        public EmployeeBuilder position(String c) {
            this.position = c;
            return this;
        }
        public EmployeeBuilder phone(String d) {
            this.phone = d;
            return this;
        }
        public EmployeeBuilder email(String e) {
            this.email = e;
            return this;
        }
        public EmployeeBuilder carNumber(String f) {
            this.carNumber = f;
            return this;
        }
        public Employee build() {
            return new Employee(this);
        }

        }

}
