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

void InsertAtTail(Node *&head, int val){
    if(head == NULL){
        InsertAtHead(head, val);
        return;
    }
    Node *n = new Node(val);

    Node *temp = head;
    while(temp->next != NULL){
        temp = temp->next;
    }
    temp->next = n;
}

void InsertAtLoc(Node *&head, int val, int loc){
    if(loc == 1){
        InsertAtHead(head, val);
        return;
    }

    Node *n = new Node(val);

    Node *temp = head;

    cout << temp->data << "->";

    for (int i = 1; i < (loc - 1);i++){
        temp = temp->next;
        cout << temp->data << "->";

        if(temp->next == NULL){
            cout << "\n Location does not exist";
            return;
        }
    }
    n->next = temp->next;
    temp->next = n;
}

void DeleteAtHead(Node* &head){

    if(head == NULL){
        cout << "Empty List";
        return;
    }

    Node *todel = head;
    head = head->next;

    delete todel;
}

void DeleteAtTail(Node* &head){
    if (head == NULL){
        cout << "Empty List";
        return;
    }

    Node *temp = head;

    while(temp->next->next != NULL){
        temp = temp->next;
    }
    Node* todel = temp->next;
    temp->next = temp->next->next;
}

void DeleteAtLoc(Node* &head,int loc){
    Node *todel = head;
    if (head == NULL){
        cout << "Empty List";
        return;
    }

    cout<<"Location="<<loc<<endl;
    Node *temp = head;
    cout<<temp->data<<" -> ";
    for (int i = 1; i < (loc-1); i++){
        temp = temp->next;
        cout<<temp->data<<" -> ";
        if (temp == NULL) {
            cout << "Location does not exist";
            return;
        }
    }
    
    if (temp == head) {
        DeleteAtHead(head);
        return;
    }

    if (temp->next == NULL){
        DeleteAtTail(head);
        return;
    }

    todel = temp->next;
    temp->next = temp->next->next;

    delete todel;
}

void Display(Node *head){

    if(head==NULL){
        cout<<"Empty List";
        return;
    }
    Node *temp = head;
    while (temp != NULL){
        cout << temp->data << " -> ";
        temp = temp->next;
    }
    cout << "NULL";
}

int main()
{
    int ch, ele,loc;
    Node* head = NULL;

    do {
        cout << "\n  \t\tInsert Element    \n\n";
        cout << endl << "1.Insert at Head  ";
        cout << endl << "2.Insert at tail"; 
        cout << endl << "3.Insert at Paticular location" << endl;

        cout << "\n \t\t Deleting the Element  \n\n";
        cout << endl << "4.Deleting at Head  ";
        cout << endl << "5.Deleting at tail";
        cout << endl << "6.Deleting at Paticular location"<<endl;
        
        cout << endl << "\n7.Display  \n8.exit";
        cout << endl << "Enter The choice  : ";
        cin >> ch;
        switch (ch){
            case 1:
                    cout << "Enter The element  :";
                    cin >> ele;
                    InsertAtHead(head, ele);
                    cout << "\n \n ";
                    break;
            case 2:
                    cout << "Enter The element  :";
                    cin >> ele;
                    InsertAtTail(head, ele);
                    cout << "\n \n ";
                    break;
            case 3:
                    cout << "Enter The element  :";
                    cin >> ele;
                    cout << "Enter The Location";
                    cin >> loc;
                    InsertAtLoc(head, ele, loc);
                    cout << "\n \n ";
                    break;
            case 4:
                    DeleteAtHead(head);
                    cout << "\n \n ";
                    break;
            case 5:
                    DeleteAtTail(head);
                    cout << "\n \n ";
                    break;
            case 6:
                    cout << "Enter The Location:";
                    cin >> loc;
                    DeleteAtLoc(head, loc);
                    cout << "\n \n ";
                    break;
            case 7:
                    Display(head);
                    cout << "\n \n ";
                    break;
        }
    } while (ch < 8);

    return 0;
}