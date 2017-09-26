package com.example.demo;

import com.example.demo.mapper.DemoMappper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemoService {

    @Autowired
    private DemoMappper demoMappper;


    public List<Demo> likeName(String name){
        return demoMappper.likeName(name);

    }

}
