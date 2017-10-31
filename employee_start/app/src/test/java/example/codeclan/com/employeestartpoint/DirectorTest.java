package example.codeclan.com.employeestartpoint;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

/**
 * Created by user on 31/10/2017.
 */

public class DirectorTest {

    Director director;

    @Before
    public void before() {
        director = new Director(2, "Tony", "49857546", 65000,"Tech", 1.00);
    }
    @Test
    public void canGetBudget() {
        assertEquals(1.00, director.getBudget(),0.01);
    }
}
