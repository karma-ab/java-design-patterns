package com.learning;

import com.learning.design.adapter.AudioPlayer;
import com.learning.design.bridge.GreenCircle;
import com.learning.design.bridge.RedCircle;
import com.learning.design.bridge.Shape;
import com.learning.design.builder.Meal;
import com.learning.design.builder.MealBuilder;
import com.learning.design.factory.abstct.AbstractFactory;
import com.learning.design.factory.abstct.FactoryProducer;
import com.learning.design.filter.*;

import com.learning.design.flyweight.Circle;
import com.learning.design.flyweight.ShapeFactory;
import com.learning.design.singleton.SingletonObject;

import java.util.ArrayList;
import java.util.List;

public class LearningMain {
    //Flyweight pattern
    private static final String[] colors = { "Red", "Green", "Blue", "White", "Black" };
    public static void main(String[] args) {

        //Factory Design pattern
        /*ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.getShape("CIRCLE");
        circle.draw();

        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        rectangle.draw();*/

        //Abstract Factory design pattern
        /*AbstractFactory rounded = FactoryProducer.getFactory(true);
        Shape circleAbs = rounded.getShape("ROUNDED_SQUARE");
        circleAbs.draw();
        Shape roundedRect = rounded.getShape("ROUNDED_RECTANGLE");
        roundedRect.draw();

        AbstractFactory nonRounded = FactoryProducer.getFactory(false);
        Shape square = nonRounded.getShape("SQUARE");
        square.draw();*/

        //Singleton Design pattern
        /*SingletonObject singletonObject = SingletonObject.getInstance();
        singletonObject.showMessage();*/

        //Builder Design pattern
        /*MealBuilder mealBuilder = new MealBuilder();
        Meal vegMeal = mealBuilder.prepareVegMeal();
        vegMeal.showItems();
        System.out.println(vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        nonVegMeal.showItems();
        System.out.println(nonVegMeal.getCost());*/

        //Adapter Patterm
        /*AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");*/

        //Bridge Pattern
        /*Shape redCircle = new Circle(100,100,5, new RedCircle());
        Shape greenCircle = new Circle(100,100,15, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();*/

        //Filter Design Pattern
        /*List<Person> persons = new ArrayList<>();

        persons.add(new Person("Robert","Male", "Single"));
        persons.add(new Person("John", "Male", "Married"));
        persons.add(new Person("Laura", "Female", "Married"));
        persons.add(new Person("Diana", "Female", "Single"));
        persons.add(new Person("Mike", "Male", "Single"));
        persons.add(new Person("Bobby", "Male", "Single"));

        Criteria male = new CriteriaMale();
        Criteria female = new CriteriaFemale();
        Criteria single = new CriteriaSingle();
        Criteria singleMale = new AndCriteria(single, male);
        Criteria singleOrFemale = new OrCriteria(single, female);
        Criteria singleFemale = new AndCriteria(single,female);

        System.out.println("Males: ");
        printPersons(male.meetCriteria(persons));

        System.out.println("\nFemales: ");
        printPersons(female.meetCriteria(persons));

        System.out.println("\nSingle Males: ");
        printPersons(singleMale.meetCriteria(persons));

        System.out.println("\nSingle Or Females: ");
        printPersons(singleOrFemale.meetCriteria(persons));

        System.out.println("\n Single Females: ");
        printPersons(singleFemale.meetCriteria(persons));*/

        //Flyweight pattern
        /*for(int i = 0; i<20;i++){
            Circle circle = (Circle) ShapeFactory.getShape(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }*/

        //
    }

    //Filter Design Pattern
    /*public static void printPersons(List<Person> persons){

        for (Person person : persons) {
            System.out.println("Person : [ Name : " + person.getName() + ", Gender : " + person.getGender() + ", Marital Status : " + person.getMaritalStatus() + " ]");
        }
    }*/

    //Flyweight pattern
    private static String getRandomColor() {
        return colors[(int)(Math.random()*colors.length)];
    }
    //Flyweight pattern
    private static int getRandomX() {
        return (int)(Math.random()*100 );
    }
    //Flyweight pattern
    private static int getRandomY() {
        return (int)(Math.random()*100);
    }

}
