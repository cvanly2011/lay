package com.lay.spring.spel;

/**
 * Created by Lay on 2016/3/26.
 */
public class SpelCity {

    private String name;
    private String state;
    private int population;

    @Override
    public String toString() {
        return "SpelCity{" +
                "name='" + name + '\'' +
                ", state='" + state + '\'' +
                ", population=" + population +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
}
