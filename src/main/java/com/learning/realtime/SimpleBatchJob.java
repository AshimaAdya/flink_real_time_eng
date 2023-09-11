package com.learning.realtime;

import org.apache.flink.api.java.DataSet;
import org.apache.flink.api.java.ExecutionEnvironment;

import java.util.Arrays;
import java.util.List;

public class SimpleBatchJob {
    public static void main(String[] args) throws Exception {
try {
    ExecutionEnvironment env = ExecutionEnvironment.getExecutionEnvironment();
    List<String> products = Arrays.asList("iPhone12", "iPhone12Pro", "iPhone12ProMax", "iPhone12Mini");
    DataSet<String> dsProducts=env.fromCollection(products);
    System.out.println("Products: " + dsProducts.count());

} catch (Exception e) {
        System.out.println("Exception: " + e);
}
    }
}
