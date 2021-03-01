package part1.lessons26.task1;

import org.junit.*;

import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator = new Calculator(10,20);

    @Test
    public void shoultCreateCalculatorInstance () {
        assertNotNull(calculator);
    }
public static class CalculatorNewTest {
        private Calculator calculator;

        @BeforeClass
    public static void beforeClass()
        {
       System.out.println("before calculatetest.class");
        }
        @AfterClass
    public static void afterClass(){

            System.out.println("After CalculateTEST.class");
        }
    @Before
    public  void initTest(){
            calculator= new Calculator();
    }
    @After
    public void afterTest(){
            calculator=null;
    }

    @Test
    public void testGETSum() throws Exception {
            calculator.setFirstNumber(2.0);
            calculator.setSecondNumber(3.0);
            assertEquals(5.0,calculator.calculateSUM(),1.0);
    }
    @Test
    public void testGETMinus() throws Exception{
            calculator.setFirstNumber(5.0);
            calculator.setSecondNumber(3.0);
            assertEquals(3.0,calculator.calcateMINUS(),1.0);
    }
    @Test
    public void testGETMulti() throws Exception{
            calculator.setFirstNumber(5.0);
            calculator.setSecondNumber(2.0);
            assertEquals(10.0,calculator.calcatemulti(),1.0);
    }
    @Test
    public void testGETDivide() throws Exception{
            calculator.setFirstNumber(10.0);
            calculator.setSecondNumber(2.0);
            assertEquals(5.0,calculator.calcateDevide(),1.0);
    } 

}

}