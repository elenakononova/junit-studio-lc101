package test;

import main.BonusBinarySearch;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BonusTest {
    @Test
    public void intIndex(){
        int[] sortedArr = {1,5,7,23,45};
        assertEquals(3, BonusBinarySearch.binarySearch(sortedArr,23));

    }

    @Test
    public void firstIndex(){
        int[] sortedArr = {1,5,7,23,45};
        assertEquals(0, BonusBinarySearch.binarySearch(sortedArr,1));

    }
    @Test
    public void lasttIndex(){
        int[] sortedArr = {1,5,7,23,45};
        assertEquals(4, BonusBinarySearch.binarySearch(sortedArr,45));

    }
}
