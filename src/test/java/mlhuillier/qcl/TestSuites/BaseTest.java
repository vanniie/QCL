package mlhuillier.qcl.TestSuites;

import junit.framework.TestCase;
import mlhuillier.qcl.TestScripts.BaseClass;
import org.testng.annotations.Test;

public class BaseTest extends TestCase {

    protected BaseClass baseClass;

    @Test(priority = 1, groups = {"Regression", "Transactional"})
    public void check1() throws Exception {
        System.out.println("Regression1 and Transadtional");
    }

    @Test(priority = 1, groups = "HappyPath")
    public void check2() throws Exception {
        System.out.println("HappyPath");
    }

    @Test(priority = 1, groups = "Regression")
    public void check3() throws Exception {
        System.out.println("Regression3");
    }

    @Test(priority = 1, groups = "Regression")
    public void check4() throws Exception {
        System.out.println("Regression4");
    }

    @Test(priority = 1, groups = "Regression")
    public void check5() throws Exception {
        System.out.println("Regression5");
    }



}
