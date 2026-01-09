import java.util.*;

public class GradeTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        ArrayList<Integer> marks = new ArrayList<>();
        int total = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter mark of student " + (i + 1) + ": ");
            int m = sc.nextInt();
            marks.add(m);
            total += m;
        }

        int max = Collections.max(marks);
        int min = Collections.min(marks);
        double avg = (double) total / n;

        System.out.println("\n--- Summary Report ---");
        System.out.println("Average: " + avg);
        System.out.println("Highest: " + max);
        System.out.println("Lowest : " + min);
    }
}