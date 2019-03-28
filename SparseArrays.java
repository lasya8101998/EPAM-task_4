/*
Sparse Arrays
There is a collection of input strings and a collection of query strings. For each query string, determine
how many times it occurs in the list of input strings.
For example, given input and , we find instances of ,
of and of . For each query, we add an element to our return array, .
Function Description
Complete the function matchingStrings in the editor below. The function must return an array of integers
representing the frequency of occurrence of each query string in strings.
matchingStrings has the following parameters:
strings - an array of strings to search
queries - an array of query strings
Input Format
The first line contains and integer , the size of .
Each of the next lines contains a string .
The next line contains , the size of .
Each of the next lines contains a string .
Constraints
.
Output Format
Return an integer array of the results of all queries in order.
Sample Input 0
4
aba
baba
aba
xzxb
3
aba
xzxb
ab
Sample Output 0
2
1
0
Explanation 0
Here, "aba" occurs twice, in the first and third string. The string "xzxb" occurs once in the fourth string,
and "ab" does not occur at all.
Sample Input 1
3
def
de
fgh
3
de
lmn
fgh
Sample Output 1
1
0
1
Sample Input 2
13
abcde
sdaklfj
asdjf
na
basdn
sdaklfj
asdjf
na
asdjf
na
basdn
sdaklfj
asdjf
5
abcde
sdaklfj
asdjf
na
basdn
Sample Output 2
1
3
4
3
2
*/

import java.io.*;
import java.util.*;

class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int N = 0, j = 0, m = 0;
        N = sc.nextInt();
        ArrayList<String> Dict = new ArrayList<String>();
        ArrayList<String> queries = new ArrayList<String>();
        ArrayList<Integer> count = new ArrayList<Integer>();
        for (j = 0; j < N; j++)
            Dict.add(sc.next());
        m = sc.nextInt();
        for (j = 0; j < m; j++)
            queries.add(sc.next());
         
        count = search(Dict,queries);
        for(int i=0;i<count.size();i++)
            System.out.println(count.get(i));
    }
    private static ArrayList<Integer> search(ArrayList<String> dict, ArrayList<String> queries) {
        // TODO Auto-generated method stub
        int t=0;
        ArrayList<Integer> match = new ArrayList<Integer>();
        for(int i=0;i<queries.size();i++){
            for(int j=0;j<dict.size();j++){
                if(queries.get(i).equals(dict.get(j)))
                    t++;
                
            }
            
            match.add(t);
            t=0;
        }
        return match;
    }
}