package fi.haagahelia.matias.tontti.bulked.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Food {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String name;
    private int calories;
    private int proteins;
    private int carbs;
    private int fats;

    public Food(){}

    public Food(String name, int calories, int proteins, int carbs, int fats){
        this.name = name;
        this.calories = calories;
        this.proteins = proteins;
        this.carbs = carbs;
        this.fats = fats;
    }



    public Long getId() {

        return id;
    }

    public void setId(Long id) {

        this.id = id;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public int getProteins() {
        return proteins;
    }

    public void setProteins(int proteins) {
        this.proteins = proteins;
    }

    public int getCarbs() {
        return carbs;
    }

    public void setCarbs(int carbs) {
        this.carbs = carbs;
    }

    public int getFats() {
        return fats;
    }

    public void setFats(int fats) {
        fats = fats;
    }
    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", calories='" + calories +  '\'' +
                ", proteins='" + proteins + '\'' +
                ", carbs='" + carbs + '\'' +
                ", fats='" + fats + '\'' +
                '}';
    }

}
