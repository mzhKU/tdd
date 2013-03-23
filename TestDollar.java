import org.junit.Test;
import static org.junit.Assert.*;

class Dollar
{
    int amount=10;

    Dollar(int amount)
    {
    }

    void times(int multiplier)
    {
    }
}

public class TestDollar
{
    public void TestMultiplication()
    {
        System.out.println("TestMultiplication()");
        Dollar five = new Dollar(5);
        five.times(2);
        assertEquals(10, five.amount);
    }
}
