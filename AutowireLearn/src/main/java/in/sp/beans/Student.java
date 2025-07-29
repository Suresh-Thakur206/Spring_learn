package in.sp.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
    private String name;
    private int rollNO;
    @Autowired
    @Qualifier("createAddrObj2")
    private Address address;
    @Autowired
    private Subjects subjects;

    public int getRollNO() {
        return rollNO;
    }

    public void setRollNO(int rollNO) {
        this.rollNO = rollNO;
    }

//    public Address getAddress() {
//        return address;
//    }

//    public void setAddress(Address address) {
//        this.address = address;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public Subjects getSubjects() {
//        return subjects;
//    }
//
//    public void setSubjects(Subjects subjects) {
//        this.subjects = subjects;
//    }

    public void display(){
        System.out.println("name:"+name);
        System.out.println("RollNo:"+rollNO);
        System.out.println("address:"+address);
       // System.out.println("Subjects:"+subjects);
    }


}
