package com.week2;

sealed class SealedClass permits SubClass1, SubClass2 {	

}

non-sealed class SubClass1 extends SealedClass  {
	
}
sealed class SubClass2 extends SealedClass permits Class1{
	
	
}
final class Class1 extends SubClass2
{
	
}