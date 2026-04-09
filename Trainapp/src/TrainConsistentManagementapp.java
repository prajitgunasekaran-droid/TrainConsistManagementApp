import java.util.*;
import java.util.stream.*;

class GoodsBogie {
    private String type;
    private String cargo;
    private int capacity;

    public GoodsBogie(String type, String cargo, int capacity) {
        this.type = type;
        this.cargo = cargo;
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return type + "-" + cargo + "-" + capacity;
    }
}

class PerformanceComparisonApp {

    public static void main(String[] args) {

        // Step 1: Create dataset (can scale this to large size)
        List<GoodsBogie> bogies = new ArrayList<>();

        for (int i = 0; i < 100000; i++) {
            bogies.add(new GoodsBogie("Box", "Grain", (i % 100) + 1));
        }

        // -------------------------------
        // LOOP-BASED FILTERING
        // -------------------------------
        long startLoop = System.nanoTime();

        List<GoodsBogie> loopResult = new ArrayList<>();
        for (GoodsBogie bogie : bogies) {
            if (bogie.getCapacity() > 60) {
                loopResult.add(bogie);
            }
        }

        long endLoop = System.nanoTime();
        long loopTime = endLoop - startLoop;

        // -------------------------------
        // STREAM-BASED FILTERING
        // -------------------------------
        long startStream = System.nanoTime();

        List<GoodsBogie> streamResult = bogies.stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(Collectors.toList());

        long endStream = System.nanoTime();
        long streamTime = endStream - startStream;

        // -------------------------------
        // OUTPUT RESULTS
        // -------------------------------
        System.out.println("Loop Result Size: " + loopResult.size());
        System.out.println("Stream Result Size: " + streamResult.size());

        System.out.println("Loop Execution Time (ns): " + loopTime);
        System.out.println("Stream Execution Time (ns): " + streamTime);

        // Consistency Check
        if (loopResult.size() == streamResult.size()) {
            System.out.println("Results Match ✅");
        } else {
            System.out.println("Results Do NOT Match ❌");
        }
    }
}