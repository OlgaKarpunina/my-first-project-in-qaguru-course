package hm2;

import hm1.*;
import org.junit.jupiter.api.Test;

public class HomeWorkGetterSetter {
    @Test
    public void workingWithCar() {
        Car myCar = new Car();

        myCar.setNumber("LM-2855");
        myCar.setBrand("Volvo");

        Car sergejCar = new Car();

        sergejCar.setNumber("OK-1535");
        sergejCar.setBrand("BMW");

        System.out.println("Dima, if I can do it, I will be very happy!");
        System.out.println("I feel like a 99 level developer now");
        System.out.println("Car:");
        System.out.println(myCar.getNumber());

        System.out.println("Car2:");
        System.out.println(sergejCar.getNumber());
    }
    public void workingWithDog() {
        Dog myDog = new Dog();

        myDog.setWeight(2.850);
        myDog.setColour("ginger");

        Dog daughtersDog = new Dog();

        daughtersDog.setWeight(5.800);
        daughtersDog.setColour("black");

        System.out.println("Aaaaaaaaaaa");
        System.out.println("Dog:");
        System.out.println(myDog.getColour());

        System.out.println("Dog2:");
        System.out.println(daughtersDog.getColour());
    }
    public void workingWithFlat() {
        Flat myFlat = new Flat();

        myFlat.setNumberOfRooms(4);
        myFlat.setFloor(4);

        Flat mothersFlat = new Flat();

        mothersFlat.setNumberOfRooms(3);
        mothersFlat.setFloor(1);

        System.out.println("Flat:");
        System.out.println(myFlat.getNumberOfRooms());

        System.out.println("Flat2:");
        System.out.println(mothersFlat.getNumberOfRooms());
    }
    public void workingWithFridge() {
        Fridge myFridge = new Fridge();

        myFridge.setHeight(2.30);
        myFridge.setWidth(60);

        Fridge neighboursFridge = new Fridge();

        neighboursFridge.setHeight(1.50);
        neighboursFridge.setWidth(43);

        System.out.println("Fridge:");
        System.out.println(myFridge.getHeight());

        System.out.println("Fridge2:");
        System.out.println(neighboursFridge.getHeight());
    }
    public void workingWithHouse() {
        House myHouse = new House();

        myHouse.setYear(1999);
        myHouse.setNumberOfFloors(8);

        House friendsHouse = new House();

        friendsHouse.setYear(1964);
        friendsHouse.setNumberOfFloors(5);

        System.out.println("House:");
        System.out.println(myHouse.getYear());

        System.out.println("House2:");
        System.out.println(friendsHouse.getYear());
    }
    public void workingWithHusband() {
        Husband myHusband = new Husband();

        myHusband.setYear(1987);
        myHusband.setEyeColour("brown");

        Husband secondHusband = new Husband();

        secondHusband.setYear(2000);
        secondHusband.setEyeColour("blue");

        System.out.println("Husband:");
        System.out.println(myHusband.getEyeColour());

        System.out.println("Husband2:");
        System.out.println(secondHusband.getEyeColour());
    }
    public void workingWithKettle() {
        Kettle myKettle = new Kettle();

        myKettle.setBrand("Philips");
        myKettle.setVolume(1.5);

        Kettle firstKettle = new Kettle();

        firstKettle.setBrand("Samsung");
        firstKettle.setVolume(1);

        System.out.println("Kettle:");
        System.out.println(myKettle.getBrand());

        System.out.println("Kettle2:");
        System.out.println(firstKettle.getBrand());
    }
    public void workingWithKitchen() {
        Kitchen myKitchen = new Kitchen();

        myKitchen.setSquare(22.7);
        myKitchen.setFunctionality("Perfect");

        Kitchen secondKitchen = new Kitchen();

        secondKitchen.setSquare(18);
        secondKitchen.setFunctionality("bad functionality");

        System.out.println("Kitchen:");
        System.out.println(myKitchen.getSquare());

        System.out.println("Kitchen2:");
        System.out.println(secondKitchen.getSquare());
    }
    public void workingWithOrange() {
        Orange myOrange = new Orange();

        myOrange.setCountry("Spain");
        myOrange.setPrice(3.60);

        Orange newOrange = new Orange();

        newOrange.setCountry("Turkey");
        newOrange.setPrice(2.10);

        System.out.println("Orange:");
        System.out.println(myOrange.getCountry());

        System.out.println("Orange2:");
        System.out.println(newOrange.getCountry());
    }
    public void workingWithWardrobe() {
        Wardrobe myWardrobe = new Wardrobe();

        myWardrobe.getSize("2.50m x 3m x 1m");
        myWardrobe.getMaterial("wood");

        Wardrobe newWardrobe = new Wardrobe();

        newWardrobe.getSize("2.00m x 1.00m x 0.60m");
        newWardrobe.getMaterial("plastic");

        System.out.println("Wardrobe:");
        System.out.println(myWardrobe.getSize());

        System.out.println("Wardrobe2:");
        System.out.println(newWardrobe.getSize());

    }

}
