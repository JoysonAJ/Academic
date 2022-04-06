#include<iostream>
using namespace std;

class Node{
    public:
        int data;
        Node* next;
        Node* back;

        Node(int n){
            data = n;
            back = NULL;
            next = NULL;
        }        
};
void InsertAthead(Node* &head,int val){
    Node* n = new Node(val);

    if(head == NULL){
        n->next = head;
        head = n;
        head->next = n;
        head->back = n;
        return;
    }

    Node *temp = head;

    while(temp->next != head){
        temp = temp->next;
    }
    n->next = head;
    head->back = n;
    temp->next = n;
    n->back = temp;
    head = n;
}

void InsertAtTail(Node* &head,int val){

    if(head == NULL){
        InsertAthead(head, val);
        return;
    }
    Node *n = new Node(val);

    Node *temp = head;

    while (temp->next != head){
        temp = temp->next;
    }

    n->next = head;
    head->back = n;
    temp->next = n;
    n->back = temp;
}

void DeleteAthead(Node* &head){
    
    if(head == NULL){
        cout << "Empty List";
        return;
    }

    Node *todel = head;

    if (head->next == head){
        head = NULL;
        delete todel;
        return;
    }
    Node *temp = head;
    while(temp->next != head){
        temp = temp->next;
    }

    head = head->next;
    temp->next = head;
    head->back = temp;

    delete todel;
}

void DeleteAtTail(Node* &head){

    if(head == NULL){
        cout << "Empty List";
        return;
    }
    if(head->next == head){
        DeleteAthead(head);
        return;
    }
    Node *temp = head;

    while (temp->next->next != head){
        temp = temp->next;
    }
    Node *todel = temp->next;
    temp->next = temp->next->next;
    head->back=temp;

} 

void Display(Node* head){
    if(head == NULL){
        cout << "Empty List";
        return;
    }
    Node *temp = head;
    do{
        cout << temp->data<<"->";
        temp = temp->next;
    } while (temp != head);
}


int main(){
    int ele, ch;
    Node *head = NULL;
    do{
        cout << "\n \n";
        cout << "\n 1.Insert At Head ";
        cout << "\t 2.Insert At Tail ";
        cout << "\n 3.Delete At Head ";
        cout << "\t 4.Insert At Tail ";
        cout << "\n 5.Display  ";
        cout << "\nEnter the Choice";
        cin >> ch;
        switch(ch){
            case 1:
                cout << "Enter the element ";
                cin >> ele;
                InsertAthead(head, ele);
                break;
            case 2:
                cout << "Enter the element ";
                cin >> ele;
                InsertAtTail(head, ele);
                break;
            case 3:
                DeleteAthead(head);
                break;
            case 4:
                DeleteAtTail(head);
                break;
            case 5:
                Display(head);
                break;
        }
    } while (ch < 7);
    return 0;
}