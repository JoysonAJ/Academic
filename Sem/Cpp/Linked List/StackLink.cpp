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

void Push(Node* &head,int val){
    Node* n = new Node(val);
    
    if(head == NULL){
        head = n;
        return;
    }
    n->next = head;
    head = n;
}

void Pop(Node* &head){
    if(head == NULL){
        cout << "Stack is Empty \n";
        return;
    }
    Node *todel = head;
    if(head->next == NULL){
        head = NULL;
        delete todel;
        return;
    }

    head = head->next;

    delete todel;
}

void Display(Node* &head){
    if(head == NULL){
        cout << "Stack is Empty \n";
        return;
    }
    cout << "\n\n";
    Node *temp = head;
    while(temp != NULL){
        cout <<"\t"<< temp->data << endl;
        temp = temp->next;
    }

    cout << "\n\n";
}


int main(){
    int ch, ele;
    Node *head = NULL;
    do{
        cout << "1.Push \n 2.Pop \n 3.Display\n";
        cout << "Enter the Choice";
        cin >> ch;
        switch(ch){
            case 1:
                cout << "Enter the element ";
                cin >> ele;
                Push(head, ele);
                break;
            case 2:
                Pop(head);
                break;
            case 3:
                Display(head);
                break;
        }
    } while (ch < 4);
    return 0;
    
}