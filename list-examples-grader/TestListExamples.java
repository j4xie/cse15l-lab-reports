import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.*;
interface StringChecker { boolean checkString(String s); }

public class TestListExamples {
  // Write your grading tests here!
  @Test
  public void testFilter() {
      List<String> list = new ArrayList<>();
      list.add("apple");
      list.add("aappllee");
      list.add("bannnana");
      list.add("chocolate");
      list.add("toy dog");

      StringChecker sc = new StringChecker() {
        public boolean checkString(String s) {
          if(s.contains("i")) {
            return true;
          }
          return false;
        }
      }
      ;

      List<String> require = new ArrayList<>(); // new String[] {"strawberry", "pineapple"}
      require.add("strawberry");
      require.add("pineapple");

      assertEquals(require, ListExamples.filter(list, sc));
  }

}
