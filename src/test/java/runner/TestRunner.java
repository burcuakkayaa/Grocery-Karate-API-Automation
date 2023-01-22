package runner;

import com.intuit.karate.Results;
import com.intuit.karate.junit5.Karate;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TestRunner {

    @Test
    public void testParallel() {
        Results results = Karate.run("src/test/java/features").parallel(6);
        assertTrue(results.getErrorMessages(), results.getFailCount() == 0);
    }
}
