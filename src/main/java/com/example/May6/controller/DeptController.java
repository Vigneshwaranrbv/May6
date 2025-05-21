package com.example.May6.controller;

import com.example.May6.entity.Dept;
import com.example.May6.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Api")
public class DeptController {

    @Autowired
    DeptService deptService;

    @PostMapping("/postDept")
    public Dept addDept(@RequestBody Dept dept){
        //System.out.println("DeptId"+dept.getId()+"DeptName"+dept.getName()+"Dept:"+dept.getDept()+"DeptEmail:"+dept.getEmail());
      return deptService.addDept(dept);
    }
    @GetMapping("/getDept/{id}")
    public Dept getDept(@PathVariable Long id){
      return deptService.getDept(id);
    }
    @GetMapping("/getAllDept")
      public List<Dept> getAllemp(){
        return deptService.getAllemp();
    }
}
