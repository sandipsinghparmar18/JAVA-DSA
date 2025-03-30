package Practice;
// import java.lang.Thread.*;
// import java.util.*;
// import java.util.stream.Collectors;

// public class java001{
//     public static void main(String[] args) {
//         String a="hello";
//         String b="hello";
//         System.out.println(a==b);
//     }
// }


// class Counter {
//     private  int count = 0;

//     public void increment() {
//         count++; // Not thread-safe
//     }

//     public int getCount() {
//         return count;
//     }
// }

// public class java001 {
//     public static void main(String[] args) throws InterruptedException{
//         Counter counter = new Counter();

//         // Two threads incrementing the counter
//         Thread t1 = new Thread(() -> {
//             for (int i = 0; i < 5000; i++) counter.increment();
//         });

//         Thread t2 = new Thread(() -> {
//             for (int i = 0; i < 5000; i++) counter.increment();
//         });

//         t1.start();
//         t2.start();
//         t1.join();
//         t2.join();

//         System.out.println("Final Count: " + counter.getCount()); // Output is unpredictable!
//     }
// }


// public class java001 {

//     public static void main(String[] args) {
//         List<String> names= Arrays.asList("Alice", "Bob", "fuzzy");

//         List<String> filterName=names.stream()
//             .map(String::toUpperCase)
//             .filter(name->name.startsWith("A"))
//             .collect(Collectors.toList());

//         // System.out.println(filterName);
//         filterName.forEach(System.out::println);
//     }
// }


public class java001 {
    public static void main(String[] args) {
        long startTime, endTime;

        // String Test
        startTime = System.nanoTime();
        String str = "";
        for (int i = 0; i < 10000; i++) {
            str += "a"; // Creates a new object each time
        }
        endTime = System.nanoTime();
        System.out.println("String Time: " + (endTime - startTime) + " ns");

        // StringBuilder Test
        startTime = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            sb.append("a"); // Modifies existing object
        }
        endTime = System.nanoTime();
        System.out.println("StringBuilder Time: " + (endTime - startTime) + " ns");
    }
}
