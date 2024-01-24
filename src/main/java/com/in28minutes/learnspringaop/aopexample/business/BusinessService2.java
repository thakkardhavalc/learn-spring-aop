package com.in28minutes.learnspringaop.aopexample.business;

import com.in28minutes.learnspringaop.aopexample.data.DataService2;
import org.springframework.stereotype.Service;

import java.util.Arrays;

/**
 * Created By dhhaval thakkar on 2024-01-24
 */
@Service
public class BusinessService2 {

    private final DataService2 dataService2;


    public BusinessService2(DataService2 dataService2) {
        this.dataService2 = dataService2;
    }

    public int calculateMin() throws InterruptedException {
        int[] data = dataService2.retrieveData();

        Thread.sleep(30);

        return Arrays.stream(data).min().orElse(0);
    }
}
