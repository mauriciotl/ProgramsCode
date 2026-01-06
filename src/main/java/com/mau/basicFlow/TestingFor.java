package com.mau.basicFlow;


public class TestingFor {

    public static void main (String[] args) {

        int iniVarArg;
        int endVarArg;
        int rangeVarArg;

        if(args.length > 0){
            iniVarArg = Integer.parseInt(args[0]);
            endVarArg = Integer.parseInt(args[1]);
            rangeVarArg = Integer.parseInt(args[2]);
            forIncrementalComplexVarArg(iniVarArg, endVarArg, rangeVarArg);
        }

        forIncrementalComplex(1,10,2);
        forIncrementalStandard(10);

        System.out.println("===TESTING:  fromStringToCharArray method ===");
        fromStringToCharArray();

        System.out.println("===TESTING:  fromStringToCharArrayV2 method ===");
        TestingFor testingFor = new TestingFor();
        testingFor.fromStringToCharArrayV2("Mau es una reata");

    }


    //Following function prints a number list from ini to end by range
    private static void forIncrementalComplex (int ini, int end, int range){

        System.out.println("\n Print by forIncrementalComplex: \n");


        for(int i = ini; i <= end; i = i + range){
            System.out.println(i);
        }
    }

    //Following function prints a number list from ini to end by range
    private static void forIncrementalComplexVarArg (int iniVarArg, int endVarArg, int rangeVarArg){

        System.out.println("\n Print by forIncrementalComplexVarArg: \n");

        for(int i = iniVarArg; i <= endVarArg; i = i + rangeVarArg){
            System.out.println(i);
        }
    }


    //Following function increments a number list 0 to that number - 1, by 1
    private static void forIncrementalStandard (int number){

        System.out.println("\n Print by forIncrementalStandard: \n");

        for(int i = 0; i< number; i++){
            System.out.println(i);
        }
    }


    private static void fromStringToCharArray (){

        char[] charArray = "Mau el grande".toCharArray();

        for(int i = 0; i < "Mau el grande".length(); i++ ){
            System.out.println(charArray[i]);
        }

        for(char c : charArray){
            System.out.println(c);
        }


    }

    public void fromStringToCharArrayV2 (String anyString){

        char[] charArray = new char[anyString.length()];

        for(int i = 0; i < anyString.length(); i++){
            charArray[i] = anyString.charAt(i);
        }

        for(char c : charArray){
            System.out.println(c);
        }


    }



}

