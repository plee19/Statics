package us.plee19;

import junit.framework.TestCase;

import org.junit.*;

public class PersonTest extends TestCase {
    Person pl;

    @Before
    public void setUp() throws Exception {
        pl = new Person("Paul", "Lee", 31, 200);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testGetLegs() {
        assertEquals(2, pl.getLegs());
    }

    @Test
    public void testAddWeight() {
        pl.addWeight(20);
        assertEquals(220.0, pl.getWeight());
    }

    @Test
    public void testLoseWeight() {
        pl.loseWeight(20);
        assertEquals(180.0, pl.getWeight());
    }
}