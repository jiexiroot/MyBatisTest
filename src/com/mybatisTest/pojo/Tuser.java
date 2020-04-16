package com.mybatisTest.pojo;

/**
 * @author GOU
 * @Date 2020-04-16 15:43
 */
public class Tuser {
    private int tId;
    private String tName;
    private int tAge;

    public Tuser() {
        super();
    }

    public Tuser(Integer tId, String tName, Integer tAge) {
        this.tId = tId;
        this.tName = tName;
        this.tAge = tAge;
    }

    public int gettId() {
        return tId;
    }

    public void settId(int tId) {
        this.tId = tId;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    public int gettAge() {
        return tAge;
    }

    public void settAge(int tAge) {
        this.tAge = tAge;
    }

    @Override
    public String toString() {
        return "Tuser{" +
                "tId=" + tId +
                ", tName='" + tName + '\'' +
                ", tAge=" + tAge +
                '}';
    }
}
