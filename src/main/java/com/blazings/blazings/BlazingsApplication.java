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
        int totalDay = 7;
        int fewPeople = 5;
        Double toDayInvertMoney = 1000.0;
        List<People> peopleList = new ArrayList<>();
        //累计发行
        Double totalScore = 0.0;
        //每天最大发行
        Double todayMaxScore = 50000000.0/365;
        profitToday.setMember(todayMaxScore*0.5);
        profitToday.setNode(todayMaxScore*0.14);
        profitToday.setPlatform(todayMaxScore*0.24);
        profitToday.setProvince(todayMaxScore*0.02);
        profitToday.setRegion(todayMaxScore*0.01);
        profitToday.setTech(todayMaxScore*0.06);
        for (int i = 0; i < totalDay; i++) {
            totalScore+=todayMaxScore;
            for (int j = 0; j < fewPeople; j++) {
                People people = new People();
                people.setJoinDay(i);
                people.setName(String.valueOf(i));
                people.setTodayScore(profitToday.getMember()/fewPeople+
                        profitToday.getNode()/fewPeople);
                people.setTotalScore(people.getTodayScore());
                people.setTodayInvestMoney(toDayInvertMoney);
                people.setTotalInvestMoney(0.0D);
                people.setTotalValueMoney(0.0D);
            }
            if (profitTotal.getMember()!=null){
                profitTotal.setMember(profitTotal.getMember()+profitToday.getMember());
                profitTotal.setNode(profitTotal.getNode()+profitToday.getNode());
                profitTotal.setPlatform(profitTotal.getPlatform()+profitToday.getPlatform());
                profitTotal.setProvince(profitTotal.getProvince()+profitToday.getProvince());
                profitTotal.setRegion(profitTotal.getRegion()+profitToday.getRegion());
                profitTotal.setTech(profitTotal.getTech()+profitToday.getTech());
            }
            //firstAdd
            else {
                profitTotal.setMember(profitToday.getMember());
                profitTotal.setNode(profitToday.getNode());
                profitTotal.setPlatform(profitToday.getPlatform());
                profitTotal.setProvince(profitToday.getProvince());
                profitTotal.setRegion(profitToday.getRegion());
                profitTotal.setTech(profitToday.getTech());
            }
        }

        System.out.println(todayMaxScore);
    }
}
