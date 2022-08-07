import org.junit.jupiter.api.*;

public class FirstTest {
    @Test
    void Test(){
        System.out.println("My first autotest running");
        System.out.println("Готово!");
    }



        @BeforeAll
        public static void startClassTest() {
            System.out.println("FirstTest class Started!");
        }

        @BeforeEach
       void startTest() {
            System.out.println("Test start!");

        }

        @Test
        void test1() {
            System.out.println("test1.1");
        }

        @Test
        void test2() {
            System.out.println("test2.1");
        }
        @Test
        void test3() {
        System.out.println("test3.1");
        }
        @Test
        void test4() {
        System.out.println("test4.1");
        }
        @Test
        void test5() {
        System.out.println("test5.1");
        }

        @AfterEach
        void finishTast() {
            System.out.println("Test finished!");
        }

        @AfterAll
        public static void finishedTestAll() {
            System.out.println("All test in FirstTest finished!");
        }

    }


