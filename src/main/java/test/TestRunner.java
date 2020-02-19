import org.junit.runner.*;

import org.junit.runner.notification.Failure;

import java.util.Iterator;

public class TestRunner {
    public TestRunner() {
    }

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(new Class[]{JunitTestSuite.class});
        Iterator var2 = result.getFailures().iterator();

        while(var2.hasNext()){
            Failure failure = (Failure)var2.next();
            System.out.println(failure.toString());
        }
        System.out.print("Algemeen resultaat van alle testen:");
        System.out.println(result.wasSuccessful());
    }
}
