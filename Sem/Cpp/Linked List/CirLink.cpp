#include<iostream>
using namespace std;

class Node{

    public:
        int data;
        Node* next;

        Node(int val){
            data = val;
            next = NULL;
        }
};

void InsertAtHead(Node* &head,int val){

    Node* n=new Node(val);
    if(head == NULL){
        n->next =n;
        head =n;
        return;
    }

    Node *temp = head;

    if(temp->next != head){
        while(temp->next != head){
            temp = temp->next;
        }
    }

    temp->next = n;
    n->next = head;
    head = n;
}

void InsertAtTail(Node* &head,int val){

    Node *n = new Node(val);

    if(head == NULL){
        InsertAtHead(head, val);
        return;
    }

    Node *temp = head;

    while(temp->next != head){
        temp = temp->next;
    }
    temp->next = n;
    n->next = head;
} 

void DeleteAtHead(Node* &head){
    if(head == NULL){
        cout << "Empty List " << endl;
        return;
    }

    Node *todelete = head;

    Node *temp=head;
    while (temp->next != head){
        temp = temp->next;
    }

    head = head->next;
    temp->next = head;

    delete todelete;
}

void DeleteAtTail(Node* &head){
    if (head == NULL){
        cout << "Empty List " << endl;
        return;
    }

    Node *temp=head;

    while(temp->next->next !=head){
        temp = temp->next;
    }

    Node *todel = temp->next;
    temp->next = head;
}

void display(Node *head){

    if (head == NULL){
        cout << "Empty List " << endl;
        return;
    }

    Node *temp = head;
    cout << "\n\t\t";
    do{
        cout << temp->data << "->";
        temp = temp->next;
    } while (temp != head);
    cout << "\n" << temp->data << "<- head" << endl;
}

int main(){
    int ch, ele;
    Node *head = NULL;
    do{
        cout << "1. Insert at Head :\n";
        cout << "2. Insert at Tail :\n";
        cout << "3. Delete at Head :\n";
        cout << "4. Delete At Tail :\n";
        cout << "5.Display :\n";
        cout << "Enter the Choice :";
        cin >> ch;
        switch(ch){
            case 1:
                cout << "Enter Element the Element :";
                cin >> ele;
                InsertAtHead(head, ele);
                break;
            case 2:
                cout << "Enter Element the Element :";
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
                display(head);
                break;
            
        }
    } while (ch < 6);
    return 0;
}