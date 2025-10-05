class Solution {
    public int numUniqueEmails(String[] emails) {

        Set<String> mail_list = new HashSet<>();

        for(int i=0; i < emails.length; i++){
            String local = emails[i].split("@")[0];
            String domain = emails[i].split("@")[1];

            local = local.split("\\+")[0];
            local = local.replaceAll("\\.","");

            mail_list.add(local + "@" + domain);
        }
        return mail_list.size();
    }
}