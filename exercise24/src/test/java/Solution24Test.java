import org.junit.jupiter.api.Test;

class Solution24Test {
    @Test
    public void test_isAnagram(){
        //simple anagram test
        Solution24 sol = new Solution24();
        String firstString = "note";
        String secondString = "tone";
        boolean boolVal = sol.isAnagram(firstString, secondString);
        assert boolVal;
    }
    @Test
    public void test_isAnagram2(){
        //longer anagram test
        Solution24 sol = new Solution24();
        String firstString = "binary";
        String secondString = "brainy";
        boolean boolVal = sol.isAnagram(firstString, secondString);
        assert boolVal;
    }
    @Test
    public void test_isAnagram3(){
        //testing spaces and capitals
        Solution24 sol = new Solution24();
        String firstString = "New York Times";
        String secondString = "monkeys write";
        boolean boolVal = sol.isAnagram(firstString, secondString);
        assert boolVal;
    }
}