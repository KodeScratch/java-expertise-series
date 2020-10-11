package com.sks.Kode.scratch;

public class VariableType {

    static int staticVar = 10;
    int instanceVari = 20;

    public static void main(String... args) {
        int localVar = 30;

        System.out.println("Static Variable via direct access:::  " + staticVar);
        System.out.println("Static Variable via Class Name:::: " + Variable.staticVar);


        System.out.println("Local Variable via direct access:::  " + localVar);


        VariableType variable = new VariableType();
        System.out.println("Instance variable via object:::" + variable.instanceVari);


    }

    void testFunction(){

        System.out.println();

    }
}
