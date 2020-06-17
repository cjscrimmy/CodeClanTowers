import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    private Guest guest1;

    @Before
    public void before(){
        guest1 = new Guest("Bill");
    }

    @Test
    public void canGetGuestName(){
        assertEquals("Craig", guest1.getName());
    }

}
