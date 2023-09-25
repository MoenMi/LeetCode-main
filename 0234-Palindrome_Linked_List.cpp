/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    bool isPalindrome(ListNode* head) {
        int list[100000];
        int len = 0;
        ListNode* cur = head;
        while (cur != nullptr) { 
            list[len++] = cur->val;
            cur = cur->next;
        }
        for (int i = 0; i < len; i++) {
            if (list[i] != list[len-1-i]) return false;
        }
        return true;
    }
};
