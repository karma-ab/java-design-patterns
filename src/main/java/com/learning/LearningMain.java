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
import com.learning.design.iterator.Iterator;
import com.learning.design.iterator.NameRepository;
import com.learning.design.proxy.Image;
import com.learning.design.proxy.ProxyImage;
import com.learning.design.singleton.SingletonObject;
import com.learning.threading.App;
import com.learning.threading.MultiLockExample;
import com.learning.threading.Processor;
import com.learning.threading.Runner;
import com.learning.threading.pool.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.*;

public class LearningMain {
    //Flyweight pattern
    /*private static final String[] colors = { "Red", "Green", "Blue", "White", "Black" };*/
    public static void main(String[] args) throws InterruptedException {

        //Threading

        /*Runner runner1 = new Runner();
        runner1.start();

        Runner runner2 = new Runner();
        runner2.start();

        Thread app1 = new Thread(new App());
        app1.start();*/

       /* Processor processor1 = new Processor();
        processor1.start();

        System.out.println("Press return to stop");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        processor1.shutdown();*/

       /* MultiLockExample multiLockExample = new MultiLockExample();
        multiLockExample.main();*/

        //Thread pool
       /* ExecutorService executorService = Executors.newFixedThreadPool(2);
        for (int i = 0; i < 5; i++) {
            executorService.submit(new Engine(i));
        }

        executorService.shutdown();

        System.out.println("All tasks submitted ");

        executorService.awaitTermination(100, TimeUnit.SECONDS);

        System.out.println("All tasks completed");*/

        //Countdown Latch
        /*CountDownLatch latch = new CountDownLatch(3);
        ExecutorService executor = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 3; i++) {
            executor.submit(new EngineWithLatch(latch));
        }

        latch.await();

        System.out.println("Completed....");*/


        //Producer Consumer
        /*ProducerConsumer producerConsumer = new ProducerConsumer();

        Thread t1 = new Thread(()-> {
            try {
                producerConsumer.producer();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread t2 = new Thread(()-> {
            try {
                producerConsumer.consumer();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        t1.start();
        t2.start();*/

        //Wait n Notify
        /*ProcessorWaitNotify producerConsumer = new ProcessorWaitNotify();

        Thread t1 = new Thread(()-> {
            try {
                producerConsumer.produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread t2 = new Thread(()-> {
            try {
                producerConsumer.consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();*/

        //Producer Consumer Low level wait notify sync
        /*ProducerConsumerWaitNotifyLowLevel producerConsumer = new ProducerConsumerWaitNotifyLowLevel();
        Thread t1 = new Thread(()-> {
            try {
                producerConsumer.produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread t2 = new Thread(()-> {
            try {
                producerConsumer.consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();*/

        //Re-Entrant Lock example
        /*ReEntrantLock reEntrantLock = new ReEntrantLock();
        Thread t1 = new Thread(()-> {
            try {
                reEntrantLock.firstThread();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread t2 = new Thread(()-> {
            try {
                reEntrantLock.secondThread();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        reEntrantLock.finish();*/

        //Deadlock example
        /*DeadLock deadLock = new DeadLock();
        Thread t1 = new Thread(()-> {
            try {
                deadLock.firstThread();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread t2 = new Thread(()-> {
            try {
                deadLock.secondThread();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        deadLock.finished();*/

        //Semaphore example
        /*ExecutorService executors = Executors.newCachedThreadPool();
        for (int i = 0; i < 200; i++) {
            executors.submit(() -> {
                try {
                    ConnectionSemaphore.getInstance().connect();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            });
        }

        executors.shutdown();
         */

        //Future and Callable
        /*ExecutorService executors = Executors.newCachedThreadPool();
        Future<Integer> future = executors.submit(()->{
            Random random = new Random();
            int val = random.nextInt(4000);

            System.out.println("Starting...");

            if(val>2000){
                throw new RuntimeException("Sleeping for long...");
            }

            Thread.sleep(val);

            System.out.println("Finished...");

            return val;
        });

        executors.shutdown();

        try {
            System.out.println("Duration is :: " + future.get());
        } catch (ExecutionException e) {
            System.out.println(e.getMessage());
        }*/

        //Interrupted Example
        /*System.out.println("Starting...");
        Thread t1 = new Thread(()->{
            Random random = new Random();
            for (int i = 0; i < 1E6; i++) {

                *//*if(Thread.currentThread().isInterrupted()){
                    System.out.println("Interrupted");
                    break;
                }*//*

                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    System.out.println("Interrupted!");
                    break;
                }

                Math.sin(random.nextDouble());
            }
        });

        t1.start();
        t1.interrupt();
        t1.join();
        System.out.println("Finished...");*/


        /**
         *  Design Patterns implementation in main class
         */

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

        //Iterator Pattern
        /*NameRepository nameRepository = new NameRepository();
        Iterator iterator = nameRepository.getIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }*/

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
