class Solution {
public:
	ListNode* mergeTwoLists(ListNode* l1, ListNode* l2) {
		if(l1 == NULL){
			return l2;
		}
		if(l2 == NULL){
			return l1;
		}
		ListNode* newHead = NULL;
		ListNode* newTail = NULL;
		if(l1->val < l2->val){
			newHead = l1;
			newTail = l1;
			l1 = l1->next;
		}
		else{
			newHead = l2;
			newTail = l2;
			l2 = l2->next;
		}
		while(l1 != NULL and l2 != NULL){
			if(l1->val < l2->val){
				newTail->next = l1;
				newTail = newTail->next;
				l1 = l1->next;
			}
			else{
				newTail->next = l2;
				newTail = newTail->next;
				l2 = l2->next;
			}
		}
		if(l1 != NULL){
			newTail->next = l1;
			l1 = l1->next;
		}
		if(l2 != NULL){
			newTail->next = l2;
		}
		return newHead;
	}
};


class Solution {
public:
	ListNode* mergeTwoLists(ListNode* l1, ListNode* l2) {
		if (l1 == NULL) return l2;
        if (l2 == NULL) return l1;
        if (l1->val <= l2->val) {
            l1->next = mergeTwoLists(l1->next, l2);
            return l1;
        } else {
            l2->next = mergeTwoLists(l1, l2->next);
            return l2;
        }
    }
};
