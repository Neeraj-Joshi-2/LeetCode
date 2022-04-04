class Solution {
public:
    ListNode* swapNodes(ListNode* head, int k) {
        ListNode* temp = head ;
        int i = 1 ;
        //get element at kth node from beginning
        while(i<k){
            temp=temp->next ;
            i++ ;
        }          
        int len = 0 ;
        ListNode* temp2 = head ;
        //get length of linked list for getting element at kth node from end
        while(temp2!=NULL){
            temp2=temp2->next ;
            len++ ;
        }
        // element at kth node from end
        temp2 = head ;
        for (int j = 1; j < len - k + 1; j++){
            temp2 = temp2->next;
        }
        // swap values
        int data = temp->val ;
        temp->val = temp2->val ;
        temp2->val = data ;
        
        return head ;
    }
};
