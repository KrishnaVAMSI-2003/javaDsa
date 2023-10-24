class Main {
    public static void main(String[] args) {
        int value = 132_472_23_34;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Minimum Integer Value = " + myMinIntValue);
        System.out.println("Maximum Integer Value = " + myMaxIntValue);
        System.out.println("Busted Max value = " + (myMaxIntValue + 1)); //Overflow
        System.out.println("Busted Min value = " + (myMinIntValue - 1)); //Underflow
        System.out.println(value);

        byte myMaxByteValue = Byte.MAX_VALUE;
        byte myMinByteValue = Byte.MIN_VALUE;
        System.out.println("Byte max value = "+myMaxByteValue);
        System.out.println("Byte min value = "+myMinByteValue);

        short myMaxShortValue = Short.MAX_VALUE;
        short myMinShortValue = Short.MIN_VALUE;
        System.out.println("Short max value = "+myMaxShortValue);
        System.out.println("Short min value = "+myMinShortValue);

        long myLongValue = 2147483647736L; //We need to place l/L to force compiler to consider this value as long
        long myMaxLongValue = Long.MAX_VALUE;
        long myMinLongValue = Long.MIN_VALUE;
        System.out.println("Long max value = "+myMaxLongValue);
        System.out.println("Long min value = "+myMinLongValue);
        System.out.println(myLongValue);

        byte newByteValue = (byte) (myMinByteValue / 2);
        System.out.println(newByteValue);

        //challenge
        byte byteNumber = 20;
        short shortNumber = 300;
        int intNumber = 74682;
        long longNumber =50000L + 10L * (byteNumber + shortNumber + intNumber);
        System.out.println(longNumber); //

        float myFloatMaxValue = Float.MAX_VALUE;
        float myFloatMinValue = Float.MIN_VALUE;
        System.out.println("Float Max value = "+myFloatMaxValue);
        System.out.println("Float Min value = "+myFloatMinValue);

        double myDoubleMaxValue = Double.MAX_VALUE;
        double myDoubleMinValue = Double.MIN_VALUE;
        System.out.println("Double Max value = "+myDoubleMaxValue);
        System.out.println("Double Min value = "+myDoubleMinValue);

        //declaration
        float myFloatValue =5f/3f;//if we remove f here we will get an error. Hence we need to place f or we must typecast.
        double myDoubleValue = 5d/3d; //we can also write it as 5.0/3.0 to get output as double
        System.out.println("myFloatValue = "+myFloatValue);
        System.out.println("myDoubleValue = "+myDoubleValue);

        //challenge
        double noOfPounds = 5d;
        double convertedKilograms = noOfPounds*0.45359237d;
        System.out.println("noOfKilograms = "+convertedKilograms);//

        char myChar = 'D';
        char myUnicodeChar = '\u0045'; // To print a character using its unicode we should write like this \u0045, where 0045 is the unicode of E. unicode table is available at unicode-table.com
        System.out.println(myChar);
        System.out.println(myUnicodeChar);

        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;
        boolean isCoustemerOverTwentyOne = true;
        System.out.println(isCoustemerOverTwentyOne);
        // end of primitive data types

        //String data type, it is not a primitive data type, it is actually a class

        String myString = "this is a string";
        System.out.println(myString);
    }
}