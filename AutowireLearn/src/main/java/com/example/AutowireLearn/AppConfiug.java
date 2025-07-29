package com.example.AutowireLearn;

import in.sp.beans.Address;
import in.sp.beans.Student;
import in.sp.beans.Subjects;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AppConfiug {
    @Bean
    public Address createAddrObj1(){
        Address adr=new Address();
        adr.setHouseNo(101);
        adr.setCity("Bangluru");
        adr.setPincode(1111);
        return adr;
    }
    @Bean
    public Address createAddrObj2(){
        Address adr=new Address();
        adr.setHouseNo(104);
        adr.setCity("Delhi");
        adr.setPincode(5454);
        return adr;
    }
    @Bean
    public Student createObjStd(){
        Student std=new Student();
        std.setName("Ram");
        std.setRollNO(88);
       // std.setAddress(createAddrObj());
       // std.setSubjects(createObjSubj());
        return std;
    }
    @Bean
    public Subjects createObjSubj(){
        Subjects subj=new Subjects();
        List<String > sub_list=new ArrayList<>();
        sub_list.add("java");
        sub_list.add("c++");
        sub_list.add("python");
        sub_list.add("javascript");
        subj.setSubjects(sub_list);
        return subj;

    }

}
