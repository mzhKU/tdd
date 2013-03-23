import org.junit.Test;
import static org.junit.Assert.*;

public class TestDollar
{
    public static void main(String[] args)
    {
    System.out.println("Main.");
    }

    public void TestMultiplication()
    {
        Dollar five = new Dollar(5);
        five.times(2);
        assertEquals(10, five.amount);
    }
}
