package com.in28minutes.learnspringaop.aopexample.business;

import com.in28minutes.learnspringaop.aopexample.data.DataService1;
import org.springframework.stereotype.Service;

import java.util.Arrays;

/**
 * Created By dhhaval thakkar on 2024-01-24
 */
@Service
public class BusinessService1 {

    private final DataService1 dataService1;

    public BusinessService1(DataService1 dataService1) {
        this.dataService1 = dataService1;
    }

    public int calculateMax() {
        int[] data = dataService1.retrieveData();
        //throw new RuntimeException("Something Went Wrong!");
        return Arrays.stream(data).max().orElse(0);
    }
}
