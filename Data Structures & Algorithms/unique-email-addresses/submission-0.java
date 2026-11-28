class Solution {
    public int numUniqueEmails(String[] emails) {

        // Create HashSet to store uniqie emails
        Set<String> uniqueEmails = new HashSet<>();

        for (String email: emails) {

            // Get local part and domain part using split()
            String[] emailParts = email.split("@");

            // Remove all '.' characters from local part
            String local = emailParts[0].replaceAll("\\.", "");
            // If local part contains a '+' then we ignore anything after that
            if (local.contains("+")) {
                local = local.substring(0, local.indexOf("+"));
            }

            String domain = emailParts[1];

            uniqueEmails.add(local + domain);
        }

        return uniqueEmails.size();
    }
}