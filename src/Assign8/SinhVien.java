package Assign8;

public class SinhVien implements Comparable<SinhVien> {
     int id;
     String name;
     String address;
     int age;
    float gpa;

    public SinhVien(int id, String name, String address, int age, float gpa) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.age = age;
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }
}
