# lab reports 3
## part 1
> code here
```
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;

class Handler implements URLHandler {
    // The one bit of state on the server: a number that will be manipulated by
    // various requests.
    int num = 0;
    ArrayList<String> searchinglist = new ArrayList<String>();
    ArrayList<String> store = new ArrayList<String>();
    public String handleRequest(URI url) {
        if (url.getPath().equals("/")) {
            return String.format("Number: %d", num);
        } 
        else if (url.getPath().equals("/increment")) {
            num += 1;
            return String.format("Number incremented!");
        } 
        else {
            System.out.println("Path: " + url.getPath());
                if (url.getPath().contains("/add")){
                    String[] parameters = url.getQuery().split("=");
                            searchinglist.add(parameters[1]);
                            return String.format("add sucessfully");
                                       
                }

                else if(url.getPath().contains("/search")){
                    String arr[] = new String[searchinglist.size()];
                    arr = searchinglist.toArray(arr);
                    String[] parameters = url.getQuery().split("=");
                    for(int i =0;i<searchinglist.size();i++){
                            if (arr[i].contains(parameters[1])){
                                store.add(arr[i]);
                            }
                        }
                    String arr2[]=new String[store.size()];
                    arr2 = store.toArray(arr2);
                    return Arrays.toString(arr2);
                    }
                            
                        }
                  
            
                    return "404 Not Found!";
                }
        
        
    }


class searchingServer {
    public static void main(String[] args) throws IOException {
        if(args.length == 0){
            System.out.println("Missing port number! Try any number between 1024 to 49151");
            return;
        }

        int port = Integer.parseInt(args[0]);

        Server.start(port, new Handler());
    }
}

```
1. add item
![Image](https://github.com/j4xie/cse15l-lab-reports/blob/26118ffae71597422196dc438e6f9e0c48d424d7/10.14%201.png)

* method used :handleRequest(URI url)
* argument: url and when url is inputted, it will be splitted in different part by "=" and check whether it contains "add"
* if the value changes, it will check again if the input has add, if it has, it will store the string after "=" into an arraylist

2. add second item
![Image](https://github.com/j4xie/cse15l-lab-reports/blob/26118ffae71597422196dc438e6f9e0c48d424d7/Screen%20Shot%202022-10-14%20at%205.21.13%20PM.png)

* method used :handleRequest(URI url)
* argument: url and when url is inputted, it will be splitted in different part by "=" and check whether it contains "add"
* if the value changes, it will check again if the input has add, if it has, it will store the string after "=" into an arraylist

3. search for item
![Image](https://github.com/j4xie/cse15l-lab-reports/blob/26118ffae71597422196dc438e6f9e0c48d424d7/Screen%20Shot%202022-10-14%20at%205.22.01%20PM.png)

* method used :handleRequest(URI url)
* argument :url and when url is input, it will be splitted in different par tby "=" and check whether it contains "search"
* if the value changes, it will check again if the input has "search", if it has, it will search each item in the created array of whether they contains the string it seached. 

---
## part 2

1. first bug （*From file `ArrayExamples`*）

* The failure-inducing input (the code of the test)
```
@Test 
	public void testReverseInPlace() {
    int[] input1 = {1,2,3,4};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{4,3,2,1}, input1);
	}
 ```
* The symptom (the failing test output)
```
testReverseInPlace(ArrayTests)
arrays first differed at element [2]; expected:<2> but was:<3>
```
* The bug (the code fix needed):
```
static void reverseInPlace(int[] arr) {
    for(int i = 0; i < arr.length; i += 1) {
      arr[i] = arr[arr.length - i - 1];
    }
  }
 ```

* Explain the connection between the symptom and the bug. Why does the bug cause that particular symptom for that particular input?

it will change the first half element. Like the element I hold in the example array {0,2,3,4}, the actual output will become {4,3,3,4}. It becomes the symmetric one. It is wrong because it cannot save the original element the array has so that when it needs the data of the first several elements, which have been changed, it will copy the element it has reversed.

---

2. second bug
