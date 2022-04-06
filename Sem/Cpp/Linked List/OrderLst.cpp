#include<iostream>
using namespace std;

class Node{
    public:
        int data;
        Node* next;

        Node(int n){
            data = n;
            next = NULL;
        }
};

void InsertAtHead(Node* &head,int val){
    Node *n = new Node(val);

    if(head == NULL){
        head = n;
        return;
    }
    n->next = head;
    head = n;
}

void InsertAtTail(Node* &head,int val){
    Node *n = new Node(val);
    Node *temp = head;
    while (temp->next != NULL){
        temp = temp->next;
    }
    temp->next = n;
}

void Insertion(Node *&head, int val){

    if(head == NULL || val < head->data){
        InsertAtHead(head, val);
        return;
    }    
    Node *temp = head;
    while( temp->next!=NULL && temp->next->data < val){
        temp = temp->next;
    }
    if(temp->next == NULL){
        InsertAtTail(head, val);
        return;
    }
    Node *n = new Node(val);
    n->next = temp->next;
    temp->next = n;
    cout << "\n\n ";
}

void Display(Node* head){
    if(head==NULL){
        cout<<"Empty List";
        return;
    }
    Node *temp = head;
    while (temp != NULL){
        cout << temp->data << " -> ";
        temp = temp->next;
    }
    cout << "NULL\n\n " ;
}

int main(){
    int ch, ele;
    Node* head = NULL;
    do{
        cout << "\n 1.Insertion \n 2.Display \n3.Exit\n";
        cout << "Enter the choice ";
        cin >> ch;
        switch(ch){
            case 1:
                cout << "Enter The element  :";
                cin >> ele;
                Insertion(head, ele);
                break;
            case 2:
                Display(head);
                break;
        }
    } while (ch < 3);   
    return 0;
}