import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void test(List<Task<Integer>> inTasks) {
        Executor testExecutor = new IntExecutor();
        Validator intValidator = new IntValidator();

        for (Task<Integer> inTask : inTasks) {
            testExecutor.addTask(inTask);
        }

        testExecutor.addTask(new IntTask(30), intValidator);
        testExecutor.addTask(new IntTask(25), intValidator);
        testExecutor.addTask(new IntTask(23), intValidator);
        testExecutor.addTask(new IntTask(16), intValidator);

        testExecutor.execute();

        System.out.println("Valid result");

        for (Object o : testExecutor.getValidResults()) {
            System.out.println(o);
        }

        System.out.println("Invalid result");
        for (Object o : testExecutor.getInvalidResults()) {
            System.out.println(o);
        }
    }

    public static void main (String[] args) {
        List<Task<Integer>> intTask = new ArrayList<>();
        intTask.add(new IntTask(100));
        test(intTask);
    }


}
