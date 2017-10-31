package example.codeclan.com.employeestartpoint;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 31/10/2017.
 */

public class ManagerTest {

    Manager manager;

    @Before
    public void before() {
        manager = new Manager(1, "Darren", "0943l9483756", 50000, "Tech");
    }
    @Test
    public void canGetDep() {
        assertEquals("Tech", manager.getDepName());
    }
}
