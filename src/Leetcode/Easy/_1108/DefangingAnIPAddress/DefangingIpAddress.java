package Leetcode.Easy._1108.DefangingAnIPAddress;
/*      1108. Defanging an IP Address

            Given a valid (IPv4) IP address, return a defanged version of that IP address.
            A defanged IP address replaces every period "." with "[.]".

            Example 1:

                Input: address = "1.1.1.1"
                Output: "1[.]1[.]1[.]1"

            Example 2:

                Input: address = "255.100.50.0"
                Output: "255[.]100[.]50[.]0"


            Constraints:
                The given address is a valid IPv4 address.
*/
public class DefangingIpAddress {
    public String defangIPAddr(String address) {
        return address.replace(".","[.]");
        /*
            Alternate 1: JS
            return address.replaceAll('.', '[.]');
        */

        /*
            Alternate 2: JS
            return address.split(".").join("[.]");
        */
    }

    public static void main(String[] args){
        String str1 = "1.1.1.1";
        DefangingIpAddress instance = new DefangingIpAddress();
        String result = instance.defangIPAddr(str1);
        System.out.println("Result: "+result);
    }
}
