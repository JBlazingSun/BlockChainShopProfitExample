package com.blazings.blazings;

import com.blazings.blazings.Model.Profit;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BlazingsApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(BlazingsApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Profit profitTotal = new Profit();
        //累计发行
        Double totalScore = 0.0;
        //每天最大发行
        Double todayMaxScore = 50000000.0/365;
        //今天发行量
        Double todayScore = 0.0;

        profitTotal.setMember(todayScore*0.5);
        profitTotal.setNode(todayScore*0.14);
        profitTotal.setPlatform(todayScore*0.24);
        profitTotal.setProvince(todayScore*0.02);
        profitTotal.setRegion(todayScore*0.01);
        profitTotal.setTech(todayScore*0.06);

        System.out.println(todayMaxScore);
    }
}
