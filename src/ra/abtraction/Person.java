package ra.abtraction;

import java.util.Date;

public class Person implements Comparable<Person>{
    @Override
    public int compareTo(Person that) {
        // sắp xếp person theo name giảm dần
//        if (this.name.compareTo(that.name) > 0){
//            return -1;
//        }else if (this.name.compareTo(that.name) == 0){
//            return 0;
//        }else {
//            return 1;
//        }
//        return that.name.compareTo(this.name);

//        tuổi tăng dần
//        return this.age-that.age;

//         cần nặng giảm dần
//        return (int) (that.weight-this.weight); // sai
//        if(that.weight> this.weight){
//            return 1;
//        } else if (that.weight==this.weight) {
//            return 0;
//        }else return -1;
            return Double.compare(that.weight,this.weight);
    }

    private String name;
    private int age; // Integer
    private boolean sex;
    private double weight;

    public Person() {

    }

    public Person(String name, int age, boolean sex, double weight) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", weight=" + weight +
                '}';
    }
}
