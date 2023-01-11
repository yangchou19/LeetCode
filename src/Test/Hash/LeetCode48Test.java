package Hash;

import org.junit.Test;

import static org.junit.Assert.*;

public class LeetCode48Test {

    @Test
    public void groupAnagramsHash() {
        LeetCode48 test = new LeetCode48();
        String[] group = {"eat","tea","tan","ate","nat","bat"};
        test.groupAnagramsHash(group);
    }
}