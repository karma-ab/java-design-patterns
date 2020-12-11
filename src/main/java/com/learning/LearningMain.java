package com.learning;

import com.learning.design.adapter.AudioPlayer;
import com.learning.design.bridge.GreenCircle;
import com.learning.design.bridge.RedCircle;
import com.learning.design.bridge.Shape;
import com.learning.design.builder.Meal;
import com.learning.design.builder.MealBuilder;
import com.learning.design.chainofresponsibility.AbstractLogger;
import com.learning.design.chainofresponsibility.ConsolerLogger;
import com.learning.design.chainofresponsibility.ErrorLogger;
import com.learning.design.chainofresponsibility.FileLogger;
import com.learning.design.command.BuyStock;
import com.learning.design.command.SellStock;
import com.learning.design.command.Stock;
import com.learning.design.command.StockBroker;
import com.learning.design.factory.abstct.AbstractFactory;
import com.learning.design.factory.abstct.FactoryProducer;
import com.learning.design.filter.*;

import com.learning.design.flyweight.Circle;
import com.learning.design.flyweight.ShapeFactory;
import com.learning.design.interpreter.AndExpression;
import com.learning.design.interpreter.Expression;
import com.learning.design.interpreter.OrExpression;
import com.learning.design.interpreter.TerminalExpression;
import com.learning.design.proxy.Image;
import com.learning.design.proxy.ProxyImage;
import com.learning.design.singleton.SingletonObject;
import jdk.nashorn.internal.codegen.ObjectCreator;

import java.util.ArrayList;
import java.util.List;

public class LearningMain {
    //Flyweight pattern
    /*private static final String[] colors = { "Red", "Green", "Blue", "White", "Black" };*/
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

        //Proxy Pattern
        /*Image image = new ProxyImage("sony1000.jpeg");
        image.display();
        //next time , it wont load
        image.display();*/

        //Chain of Responsibility Pattern
        /*AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsolerLogger(AbstractLogger.INFO);
        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        errorLogger.logMessage(AbstractLogger.INFO, "This is info level message");
        errorLogger.logMessage(AbstractLogger.DEBUG,"This is debug level message");
        errorLogger.logMessage(AbstractLogger.ERROR,"This is error level message");*/

        //Command Pattern
        /*Stock stock = new Stock();
        BuyStock buyStock = new BuyStock(stock);
        SellStock sellStock = new SellStock(stock);

        StockBroker stockBroker = new StockBroker();
        stockBroker.takeOrder(buyStock);
        stockBroker.takeOrder(sellStock);
        stockBroker.placeOrders();*/

        //Interpreter
        /*Expression termExpression1 = new TerminalExpression("John");
        Expression termExpression2 = new TerminalExpression("Doe");
        Expression maleOrExpression = new OrExpression(termExpression1,termExpression2);

        Expression marriedExp1 = new TerminalExpression("Julie");
        Expression marriedExp2 = new TerminalExpression("Married");
        Expression marriedWomanExpression = new AndExpression(marriedExp1,marriedExp2);

        System.out.println("Is John Male ? : " + maleOrExpression.interpret("John"));
        System.out.println("Is Julie married ? : "+marriedWomanExpression.interpret("Married Julie"));*/


    }

    //Filter Design Pattern
    /*public static void printPersons(List<Person> persons){

        for (Person person : persons) {
            System.out.println("Person : [ Name : " + person.getName() + ", Gender : " + person.getGender() + ", Marital Status : " + person.getMaritalStatus() + " ]");
        }
    }*/

    //Flyweight pattern
    /*private static String getRandomColor() {
        return colors[(int)(Math.random()*colors.length)];
    }*/
    //Flyweight pattern
    /*private static int getRandomX() {
        return (int)(Math.random()*100 );
    }*/
    //Flyweight pattern
    /*private static int getRandomY() {
        return (int)(Math.random()*100);
    }*/


}
