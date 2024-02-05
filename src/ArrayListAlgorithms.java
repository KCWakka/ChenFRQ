import java.util.ArrayList;
public class ArrayListAlgorithms {
    public static ArrayList<Integer> modes(int[] numList) {
        /* implement this method */
        ArrayList<Integer> modes = new ArrayList<Integer>();
        int greatestMode = 0;
        int mode = 1;
        for (int i = 0; i < numList.length; i++) {
            for (int f = i + 1; f < numList.length; f++) {
                if (numList[i] == numList[f]) {
                    mode++;
                }
            }
            if (mode > greatestMode) {
                greatestMode = mode;
                mode = 1;
            } else {
                mode = 1;
            }
        }
        for (int i = 0; i < numList.length; i++) {
            for (int f = i + 1; f < numList.length; f++) {
                if (numList[i] == numList[f]) {
                    mode++;
                }
            }
            if (mode == greatestMode) {
                modes.add(numList[i]);
                mode = 1;
            } else {
                mode = 1;
            }
        }
        ArrayList<Integer> number = new ArrayList<Integer>();
        for (int i = 0; i < numList.length; i++) {
            if (!number.contains(numList[i])) {
                number.add(numList[i]);
            }
        }
        int count = 0;
        for (int i = 0; i < number.size(); i++) {
            if (modes.contains(number.get(i))) {
                count++;
            }
        }
        if (count == number.size()) {
            modes.clear();
        }
        return modes;
    }

}
