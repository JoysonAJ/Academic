#include <iostream>
using namespace std;

class Node{
    public:
        int data;
        Node *next;

        Node(int n){
            data = n;
            next = NULL;
        }
};

void InsertAtHead(Node *&head, int val){
    Node *n = new Node(val);

    if (head == NULL){
        head = n;
        return;
    }

    n->next = head;
    head = n;
}

void Display(Node *&head){
    if (head == NULL){
        cout << "Empty List";
        return;
    }
    Node *temp = head;
    while (temp != NULL) {
        cout << temp->data << " -> ";
        temp = temp->next;
    }
    cout << "NULL";
}


Node* Revse(Node *&head){
    
    if (head == NULL ){
        return NULL;
    }
    if ( head->next == NULL){
        return head;
    }
    Node *newHead = Revse(head->next);
    newHead->next = head;
    head->next = NULL;

    return head;
}
int main(){
    int ch, ele;
    Node *head = NULL;
    do{
        cout << "\n1.Insert Node \n 2.Reverse Linked List \n";
        cout << "3.Display \n4.Exit\n Enter the Choice ";
        cin >> ch;
        switch (ch) {
            case 1:
            cout << "Enter the element ";
            cin >> ele;
            InsertAtHead(head, ele);
            break;
        case 2:
            head = Revse(head);
            break;
        case 3:
            Display(head);
            break;
        }
    
    } while (ch < 4);

    return 0;
}