package Week_3_Assignment1_Solutions.Problem1;

class RaceSimulation {

    public static void main(String[] args) {

        Thread t1 = new Thread(new Runner("Runner 1"));
        Thread t2 = new Thread(new Runner("Runner 2"));
        Thread t3 = new Thread(new Runner("Runner 3"));

        System.out.println("Race Started!\n");

        t1.start();
        t2.start();
        t3.start();
    }
}

