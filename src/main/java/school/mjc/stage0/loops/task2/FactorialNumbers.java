package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int counter = 0;
        int fact = 0;
        while (counter <= printToInclusive) {
            fact = fact * counter;
            System.out.println(fact);
            counter++;
        }

    }
}
