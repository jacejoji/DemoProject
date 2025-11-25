package com.week2;

public class SealedClassMain {
    public static void main(String[] args) {
        // Properly subclass SealedClass (no anonymous classes)
        SealedClass sealedObj = new SubClass1();
        System.out.println("Sum: " + sealedObj.calculateSum(5, 3)); // Outputs: Sum: 8
        
        SubClass1 subClass1Obj = new SubClass1();
        System.out.println("Difference: " + subClass1Obj.calculateDifference(5, 3)); // Outputs: Difference: 2
        
        SubClass2 subClass2Obj = new Class1();
        System.out.println("Product: " + subClass2Obj.calculateProduct(5, 3)); // Outputs: Product: 15
        
        Class1 class1Obj = new Class1();
        System.out.println("Quotient: " + class1Obj.calculateQuotient(6, 3)); // Outputs: Quotient: 2
    }
}