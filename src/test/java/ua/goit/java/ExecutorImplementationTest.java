package ua.goit.java;

import java.util.ArrayList;
import java.util.List;


public class ExecutorImplementationTest {
    ExecutorImplementation executor = new ExecutorImplementation();
        NumValid val = new NumValid();

    @org.junit.Test
    public void testExecutor() throws Exception {

        List<Task<Long>> list = new ArrayList<>();

        list.add(new NumberTasks(10L));
        list.add(new NumberTasks(100L));
        list.add(new NumberTasks(15L));
        test1(list);
    }

        public void test1(List<Task<Long>> tasks) throws Exceptions {
            for (Task<Long> task : tasks) {
                executor.addTask(task);
            }
            executor.addTask(new NumberTasks(10L), val);
            executor.addTask(new NumberTasks(1L), val);
            executor.addTask(new NumberTasks(3L), val);
            executor.addTask(new NumberTasks(8L), val);
            executor.execute();


            List<Long> listInvalid = executor.getInvalidResults();

            List<Long> listValid = executor.getValidResults();

            System.out.println("Valid:");
            for (Long aLong : listValid) {
                System.out.println(aLong);
            }

            System.out.println("Invalid:");
            for (Long aLong : listInvalid) {
                System.out.println(aLong);
            }


        }
    }