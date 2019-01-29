import java.util.Set;
import java.util.HashSet;

public class UniqueEmailAddresses929 {

    public static void main(String[] args) {
        String[] emails = {"test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com"};


        System.out.println(numUniqueEmails(emails));

    }

    public static int numUniqueEmails(String[] emails) {
        Set<String> uniqueEmails = new HashSet<String>();
        for (String email : emails) {
            String localName = email.split("@")[0];
            String domainName = email.split("@")[1];

            localName = localName.replace(".", "");

            if (localName.contains("+")) {
                localName = localName.substring(0, localName.indexOf('+'));
            }
            uniqueEmails.add(localName + "@" + domainName);
        }

        return uniqueEmails.size();
    }

}
