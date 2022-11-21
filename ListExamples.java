import java.util.ArrayList;
import java.util.List;

interface StringChecker { boolean checkString(String s); }

public class ListExamples {
    static List<String> filter(List<String> s, StringChecker sc){

        List<String> result = new ArrayList<>();
        for(String str: s) {
          if(sc.checkString(str)) {
            result.add(0, str);
          }
        }
        return result;
      }
    
    static List<String> merge(List<String> list1, List<String> list2){
        List<String> list = new ArrayList<>();
        int index1 = 0, index2 = 0;
        while(index1 < list1.size() && index2 < list2.size()) {
            if(list1.get(index1).compareTo(list2.get(index2)) < 0) {
                list.add(list1.get(index1));
                index1 += 1;
            }
            else {
                list.add(list2.get(index2));
                index2 += 1;
            }
        }  
        while(index1 < list1.size()) {
                list.add(list1.get(index1));
                index1 += 1;
        }
        while(index2 < list2.size()) {
                list.add(list2.get(index2));
                index1 += 1;
        }
            return list;
    }


}

