package com.in28minutes.learnspringaop.aopexample.data;

import org.springframework.stereotype.Repository;

/**
 * Created By dhhaval thakkar on 2024-01-24
 */
@Repository
public class DataService1 {

    public int[] retrieveData() {
        return new int[] {11, 22, 33, 44, 55, 66};
    }
}
