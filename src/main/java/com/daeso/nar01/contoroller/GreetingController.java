package com.daeso.nar01.contoroller;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import com.daeso.nar01.model.Grade;
import com.daeso.nar01.model.Greeting;
import com.daeso.nar01.model.Student;
import com.daeso.nar01.repository.GradeRepository;
import com.daeso.nar01.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();


    @Autowired
    private GradeRepository gradeRepository;

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

    @GetMapping("/aa")
    public Greeting aa() {
        return new Greeting(1l,"qwerqwer");
    }

    @GetMapping("/bb")
    public Greeting bb() {
        return new Greeting(1l,"bbbbbb");
    }

    @GetMapping("/getgrade")
    public List<Grade> getgrade() {
        Grade grade = new Grade(1l,1,1,null);
        Grade grade2 = new Grade(2l,1,2,null);
        List<Grade> list = new ArrayList<>();
        list.add(grade);
        list.add(grade2);
        return list;
    }

    @GetMapping("/jpgrade")
    public List<Grade> jpgrade() {
        return gradeRepository.findAll();
    }

    @PostMapping("getstudent")
    public List<Student> getStudent(
            @RequestBody(required = false) Student student ) {
        List<Student> list = studentRepository.findByClsAndGrade(student.getGrade(),student.getCls());
        System.out.println(list);
        return list;
    }
}
