package com.week2;

sealed class SealedClass permits SubClass1, SubClass2 {    
    // Example method in SealedClass
    public int calculateSum(int a, int b) {
        return a + b;
    }
}

non-sealed class SubClass1 extends SealedClass  {
    // SubClass1 can also override methods or define its own methods
    public int calculateDifference(int a, int b) {
        return a - b;
    }
}

sealed class SubClass2 extends SealedClass permits Class1 {
    // SubClass2 can override or add methods as well
    public int calculateProduct(int a, int b) {
        return a * b;
    }
}

final class Class1 extends SubClass2 {
    // Class1 is the final subclass, so it cannot be extended
    public int calculateQuotient(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Cannot divide by zero");
        }
    }
}


