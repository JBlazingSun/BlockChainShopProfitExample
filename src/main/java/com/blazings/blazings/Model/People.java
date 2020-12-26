package com.blazings.blazings.Model;

public class People {
    String name;
    /**
     * 今天获得的链分
     */
    Double todayScore;
    /**
     * 总链分
     */
    Double totalScore;
    /**
     * 今天投入钱
     */
    Double todayInvestMoney;
    /**
     * 总投入钱
     */
    Double totalInvestMoney;
    /**
     * 总共价值收益
     */
    Double totalValueMoney;
    /**
     * 投资天数
     */
    int joinDay;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getTodayScore() {
        return todayScore;
    }

    public void setTodayScore(Double todayScore) {
        this.todayScore = todayScore;
    }

    public Double getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(Double totalScore) {
        this.totalScore = totalScore;
    }

    public Double getTodayInvestMoney() {
        return todayInvestMoney;
    }

    public void setTodayInvestMoney(Double todayInvestMoney) {
        this.todayInvestMoney = todayInvestMoney;
    }

    public Double getTotalInvestMoney() {
        return totalInvestMoney;
    }

    public void setTotalInvestMoney(Double totalInvestMoney) {
        this.totalInvestMoney = totalInvestMoney;
    }

    public Double getTotalValueMoney() {
        return totalValueMoney;
    }

    public void setTotalValueMoney(Double totalValueMoney) {
        this.totalValueMoney = totalValueMoney;
    }

    public int getJoinDay() {
        return joinDay;
    }

    public void setJoinDay(int joinDay) {
        this.joinDay = joinDay;
    }
}
