package hackerrank;

import java.util.Scanner;

class Solution{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            MyRegex myRegex = new MyRegex();
            System.out.println(IP.matches(myRegex.pattern));
        }

    }
}

//Write your code here
class MyRegex {

    String ip0to255 = "(00[0-9]|0[0-9]|[0-9]|0[0-9][0-9]|[0-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])";

    public String pattern = ip0to255 + "\\." + ip0to255 + "\\." + ip0to255 + "\\." + ip0to255;
}
