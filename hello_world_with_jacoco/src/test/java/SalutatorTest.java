import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Ignore;

public class SalutatorTest
{
    @Test
    public void testDummyPass()
    {
        assertEquals(true, true);
    }

    @Test
    @Ignore
    public void testDummyFail()
    {
        assertEquals(true, false);
    }

    @Test
    public void testNormal()
    {
        String msgReal  = Salutator.get().getNormal(); 
        String msgIdeal = "Hola, qué pasa?";
        assertEquals(msgReal, msgIdeal);
    }

    @Test
    public void testFormal()
    {
        String msgReal  = Salutator.get().getFormal(); 
        String msgIdeal = "Buenas, qué sucede?";
        assertEquals(msgReal, msgIdeal);
    }
}
