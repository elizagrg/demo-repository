import org.junit.jupiter.api.Test;

class Menu_SystemTest {

@Test
public void multiplesOf3Fizz() {
    for (int i = 1; i <= 100; i++) {
        if ((i % 3 == 0)) {
            assertEquals("Fizz", unit.apply(i));
        }
    }
}
 
private void assertEquals(String string, Object apply) {
	// TODO Auto-generated method stub
	
}

@Test
public void multiplesOf5Buzz() {
    for (int i = 1; i <= 100; i++) {
        if ((i % 5 == 0)) {
            assertEquals("Buzz", unit.apply(i));
        }
    }
}
 
public void multiplesOf3And5FizzBuzz() {
    for (int i = 1; i <= 100; i++) {
        if ((i % 3 == 0) && (i % 5 == 0)) {
            assertEquals("FizzBuzz", unit.apply(i));
        }
    }
}
}
