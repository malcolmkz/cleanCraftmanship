package sort;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

import static java.util.Arrays.*;
import static org.junit.Assert.assertEquals;

public class SortTest {
    @Test
    public void sortTest() throws Exception {
        // Test the most degenerate things possible
        assertEquals(asList(), sort(asList()));
        assertEquals(asList(1), sort(asList(1)));
        assertEquals(asList(1, 2), sort(asList(1, 2)));
        assertEquals(asList(1, 2), sort(asList(2, 1)));
        assertEquals(asList(1, 2, 3), sort(asList(1, 2, 3)));
        assertEquals(asList(1, 2, 3), sort(asList(2, 1, 3)));
        assertEquals(asList(1, 2, 3) , sort(asList(1, 3, 2)));
        assertEquals(asList(1, 2, 3), sort(asList(3,2,1)));
        assertEquals(asList(0, 1, 1, 2, 3, 3, 3, 4, 5, 5, 6, 6, 7, 8, 8, 9), sort(asList(3,1,4,5,9,2,6,8,0,3,1,8,7,3,6,5)));
    }

    private List<Integer> sort(List<Integer> list){
        if(list.size() >1) {
            for (int limit = list.size() - 1; limit > 0; limit--){
                for (int firstIndex = 0; firstIndex < list.size() - 1; firstIndex++) {
                    int secondIndex = firstIndex + 1;
                    if (list.get(firstIndex) > list.get(secondIndex)) {
                        int first = list.get(firstIndex);
                        int second = list.get(secondIndex);
                        list.set(firstIndex, second);
                        list.set(secondIndex, first);
                    }
                }
        }
        }
        return list;
    }
}
