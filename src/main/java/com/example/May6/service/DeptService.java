package com.example.May6.service;

import com.example.May6.entity.Dept;
import com.example.May6.repository.DeptRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptService {

    @Autowired
    DeptRepository deptRepository;

    public Dept addDept(Dept dept) {
        return deptRepository.save(dept);
    }

    public Dept getDept(Long id) {
        return deptRepository.findById(id).orElse(null);
    }

    public List<Dept> getAllemp() {
        return deptRepository.findAll();

    }
}