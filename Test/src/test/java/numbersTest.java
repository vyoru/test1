import static org.junit.jupiter.api.Assertions.*;

class numbersTest {

    @org.junit.jupiter.api.Test
    public void sum() {
        numbers numbers = new numbers();
        int actual = numbers.sum(5);
        int expected = 15;
        assertEquals(expected, actual);
    }
 }