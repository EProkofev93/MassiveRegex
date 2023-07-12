import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        //оздаю массив чисел (года от 1900 по 2023)

        int[] year = new int[124];
        for (int i = 0; i < year.length; i++) {
            year[i] = i + 1900;

        }

        // Преобразую в массив строк с теми же значениями

        String a = Arrays.toString(year);
        String ar[] = a.substring(1, a.length() - 1).split(", ");
        //System.out.println(Arrays.toString(ar));

        for (int i = 0; i < year.length; i++) {
            //System.out.println(ar[i]);


            //String text = ar[i];
            Pattern pattern = Pattern.compile("20..");
            Matcher matcher = pattern.matcher(ar[i]);


            while (matcher.find()) {

                int start = matcher.start();
                int end = matcher.end();
                System.out.println("Found match\n" + ar[i].substring(start, end) + "\nfrom " + start + " to " + (end - 1));
            }


        }
    }
}
