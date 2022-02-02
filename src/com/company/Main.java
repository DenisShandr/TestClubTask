package com.company;

public class Main {

    public static void main(String[] args) {

        SimlpeClass simlpeClass = new SimlpeClass();
        String newObject1 = "Object 1";
        String newObject2 = "Object 2";
        String newObject3 = "Object 3";
        String newObject4 = "Object 4";
        String newObject5 = "Object 5";

        simlpeClass.add(newObject1);
        simlpeClass.add(newObject2);
        simlpeClass.add(newObject3);
        simlpeClass.add(newObject4);
        simlpeClass.add(newObject5);

        System.out.println(simlpeClass.getObject(1));
        System.out.println(simlpeClass.getObject(2));
        System.out.println(simlpeClass.getObject(3));
        System.out.println(simlpeClass.getObject(4));
        System.out.println(simlpeClass.getObject(5));
        System.out.println();

        simlpeClass.delete(3);
        simlpeClass.add(newObject3);

        System.out.println(simlpeClass.getObject(1));
        System.out.println(simlpeClass.getObject(2));
        System.out.println(simlpeClass.getObject(3));
        System.out.println(simlpeClass.getObject(4));
        System.out.println(simlpeClass.getObject(5));
        System.out.println(simlpeClass.getObject(6));



    }
}
