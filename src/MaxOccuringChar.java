import java.util.HashMap;
import java.util.Map;

public class MaxOccuringChar{
    static void findMax(String string){

        char []array = string.toCharArray();                        //Convert the string to char array
        Map<Character, Integer> charMap = new HashMap<>();          //Taking a hashmap of character as key and integer as value
        for(char c : array){                                        //Searching char type in array name
            if (!String.valueOf(c).isBlank()){                      //Ignoring the blank spaces present
                if(charMap.containsKey(c)){
                    charMap.put(c,charMap.get(c) + 1);             //If already present then add 1 to the existing value of that character using .get(c)
                }
                else{
                    charMap.put(c, 1);                             //If it is a new character then just put 1 as value
                }
            }
            System.out.println(string + ": " + charMap);
        }

        /*To find the max occurring character*/
        char max = string.charAt(0);                               //Initialize max with the first char of the string
        for (char c : charMap.keySet()){                           //Returns a set view of keys contained in the map
            if(charMap.get(c) > charMap.get(max)){                 //If frequency of current char is > frequency of max
                max = c;                                           //then the char gets stored in max
            }
        }
        System.out.println("\nThe max occurring character is " + max);

    }

    public static void main(String[] args) {
        findMax("Our class did not start at eight today");
    }
}