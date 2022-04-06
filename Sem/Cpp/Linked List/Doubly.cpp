#include<iostream>
using namespace std;

class Node{

    public:
        int data;
        Node *next;
        Node* back;
    
    Node(int n){
        data = n;
        next = NULL;
        back = NULL;
    }
};

void InsertAtHead(Node* &head,int val){
    Node* n = new Node(val);

    n->next=head;

    if(head != NULL){
        head->back=n;
    }
    head=n;
}

void InsertAtTail(Node* &head,int val){

    if(head == NULL){
        InsertAtHead(head, val);
        return;
    }

    Node *n = new Node(val);
    Node *temp = head;

    while(temp->next!=NULL){
        temp = temp->next;
    }
    temp->next = n;
    n->back = temp;
}

void DeleteAtHead(Node* &head){
    if(head == NULL){
        cout << "Empty List ";
        return;
    }

    if(head->next == NULL){
        Node *todelete = head;
        head = NULL;
        delete todelete;
        return;
    }

    Node *todelete = head;
    head = head->next;
    head->back = NULL;

    delete todelete;
}

void DeleteAtTail(Node* &head){
    if(head == NULL){
        cout << "Empty List ";
        return;
    }

    if(head->next == NULL){
        DeleteAtHead(head);
        return;

    }

    Node *temp = head;
    while(temp->next!=NULL){
        temp = temp->next;
    }
    Node *todelete = temp;
    temp->back->next = temp->next;

    delete todelete;
}

void Display(Node* head){

    if(head == NULL){
        cout << "Empty List ";
        return;
    }
    
    Node *temp = head;
    cout<<"NULL <-";
    while(temp!=NULL){
        cout << temp->data << "<- ->";
        temp = temp->next;
    }
    cout<<"NULL";
    cout << "\n";
}

int main(){
    int ch, ele;
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
                cout << "Enter the element";
                cin >> ele;
                InsertAtHead(head, ele);
                break;
            case 2:
                cout << "Enter the element";
                cin >> ele;
                InsertAtTail(head, ele);
                break;
            case 3:
                DeleteAtHead(head);
                break;
            case 4:
                DeleteAtTail(head);
                break;
            case 5:
                Display(head);
                break;
        }
    } while (ch < 6);

    return 0;
}