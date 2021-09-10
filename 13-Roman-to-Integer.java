// https://leetcode.com/problems/roman-to-integer

class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer> m=new HashMap<>();
m.put('I',1);
m.put('V',5);
m.put('X',10);
m.put('L',50);
m.put('C',100);
m.put('D',500);
m.put('M',1000);

    s=s.replaceAll("IV","IIII").replaceAll("IX","VIIII")
        .replaceAll("XL","XXXX").replaceAll("XC","LXXXX")
        .replaceAll("CD","CCCC").replaceAll("CM","DCCCC");
  
    int num=0;
    for(int i=0;i<s.length();i++){
        num=num+m.get(s.charAt(i));
    }
 return num;
    }
}
