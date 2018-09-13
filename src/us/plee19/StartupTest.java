package us.plee19;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StartupTest extends TestCase {

    Startup testStart;

    @Before
    public void setUp() throws Exception {
        testStart = new Startup();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testStartUp() {
        assertEquals(3, testStart.startUp().length);
    }
}