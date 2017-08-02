package com.yubraj.domain;

/**
 * Created by yubrajpokharel on 8/1/17.
 */
public class Person {
    private String fname;
    private String lname;
    private String email;
    private int age;

    public Person(String fname, String lname, String email, int age) {
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.age = age;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        if (fname != null ? !fname.equals(person.fname) : person.fname != null) return false;
        if (lname != null ? !lname.equals(person.lname) : person.lname != null) return false;
        return email != null ? email.equals(person.email) : person.email == null;
    }

    @Override
    public int hashCode() {
        int result = fname != null ? fname.hashCode() : 0;
        result = 31 * result + (lname != null ? lname.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + age;
        return result;
    }
}
