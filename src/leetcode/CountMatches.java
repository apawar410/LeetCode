package leetcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class CountMatches {

    public static int countMatches (List<List<String>> items, String ruleKey, String ruleValue) {
        AtomicInteger count = new AtomicInteger();
      //  items.stream ().flatMap (list -> list.stream()).forEach (t->System.out.println (t));
        items.forEach (l-> {
          String [] innerItem =l.toArray (new String[0]);
            System.out.println ("Type is " + innerItem[0] + " - Color is :" + innerItem [1] + " - name is " + innerItem [2]);

            if ((ruleKey.equalsIgnoreCase ("type") && ruleValue.equalsIgnoreCase (innerItem [0]))
            || (ruleKey.equalsIgnoreCase ("color") && ruleValue.equalsIgnoreCase (innerItem [1]))
            || (ruleKey.equalsIgnoreCase ("name") && ruleValue.equalsIgnoreCase (innerItem [2]))) {
                count.getAndIncrement();
                System.out.println("Incremented the count");
            }
        });
        return count.intValue();
    }


    public static void main (String args []) {

        List<List<String>> inputData = Arrays.asList (
                Arrays.asList ("phone", "blue", "pixel"),
                Arrays.asList ("computer", "silver", "lenovo"),
                Arrays.asList ("phone", "gold", "iphone")
        );
        String ruleKey = "color";
        String ruleValue = "silver";
       int result =  countMatches (inputData,ruleKey,ruleValue);

     }
     @Test
     public void testColor(){
         List<List<String>> inputData = Arrays.asList (
                 Arrays.asList ("phone", "blue", "pixel"),
                 Arrays.asList ("computer", "silver", "lenovo"),
                 Arrays.asList ("phone", "gold", "iphone")
         );
         String ruleKey = "color";
         String ruleValue = "silver";
         Assert.assertEquals(1, countMatches (inputData,ruleKey,ruleValue));
     }

     @Test
    public void testType() {
         List<List<String>> inputData = Arrays.asList(
                 Arrays.asList("phone", "blue", "pixel"),
                 Arrays.asList("computer", "silver", "lenovo"),
                 Arrays.asList("phone", "gold", "iphone")
         );
         String ruleKey = "type";
         String ruleValue = "phone";
         Assert.assertEquals(2, countMatches(inputData, ruleKey, ruleValue));
     }
}
