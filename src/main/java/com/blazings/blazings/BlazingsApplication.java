package com.blazings.blazings;

import com.blazings.blazings.Model.People;
import com.blazings.blazings.Model.Profit;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class BlazingsApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(BlazingsApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Profit profitTotal = new Profit();
        Profit profitToday = new Profit();
        int totalDay = 10;
        int fewPeople = 5;
        List<People> peopleList = new ArrayList<>();
        //累计发行
        Double totalScore = 0.0;
        //每天最大发行
        Double todayMaxScore = 50000000.0/365;
        //今天发行量
        Double todayScore = 0.0;

        for (int i = 0; i < totalDay; i++) {
            for (int j = 0; j < fewPeople; j++) {
                People people = new People();
                people.setJoinDay(i);
                people.setName(String.valueOf(i));
                people.setTodayInvestMoney(1000.0);
//                people.setTotalInvestMoney(people.getTodayInvestMoney()+1000.0);

//                members.add(new Member());
            }
        }

        profitTotal.setMember(todayScore*0.5);
        profitTotal.setNode(todayScore*0.14);
        profitTotal.setPlatform(todayScore*0.24);
        profitTotal.setProvince(todayScore*0.02);
        profitTotal.setRegion(todayScore*0.01);
        profitTotal.setTech(todayScore*0.06);

        System.out.println(todayMaxScore);
    }
}
