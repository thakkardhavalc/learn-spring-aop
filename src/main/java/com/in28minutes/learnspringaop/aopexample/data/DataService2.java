package com.in28minutes.learnspringaop.aopexample.data;

import com.in28minutes.learnspringaop.aopexample.annotations.TrackTime;
import org.springframework.stereotype.Repository;

/**
 * Created By dhhaval thakkar on 2024-01-24
 */
@Repository
public class DataService2 {

    @TrackTime
    public int[] retrieveData() throws InterruptedException {

        Thread.sleep(30);

        return new int[] {111, 222, 333, 444, 555, 666};
    }
}
