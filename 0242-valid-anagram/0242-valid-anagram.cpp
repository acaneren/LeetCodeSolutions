class Solution {
    public:
        bool isAnagram(string s, string t) {
            
            if (s.size() != t.size()) {
                return false;
            }

            int check_array[256] = {0};
            for (int i = 0; i < s.size(); i++) {
                check_array[(int)s[i]]++;
                check_array[(int)t[i]]--;

            }            
            for (int i = 0; i < 256; i++) {
                if (check_array[i] != 0) {
                    return false;
                }
            }
            return true;
        }
    };