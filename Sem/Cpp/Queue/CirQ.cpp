#include <iostream>
using namespace std;

class CirQ{

    int Qsize, q[20], front = -1, back = -1, ele;
    public:
    CirQ(int n){
        Qsize = n;

    }
    void Insert(){
        if ((front == 0 && back == Qsize - 1) || (front == (back + 1) ) ){
            cout << "Queue is full";
            return;
        }
        cout << "Enter the element ";
        cin >> ele;

        back = (back + 1) % Qsize;
        q[back] = ele;

        cout << endl << q[back] << " : Is Inserted " << endl;
        if (front == -1){
            front = 0;
        }
    }

    void Delete(){
        if( front == -1 ){
            cout << "Empty Queue";
            return;
        }
        cout << endl << q[front] << " : Is Deleted " << endl;
        front = (front + 1) % Qsize;
        if (front == back)
            front = -1;
    }

    void display(){
        int i;
        if (front == -1){
            cout << "Empty Queue";
            return;
        }
        for (i = front; i != back; i = (i + 1) % Qsize){
            cout << q[i] << "\t";
        }
        cout << q[back] << endl;
    }
};

int main(){
    int ch, lmt;
    cout << "Enter the size array";
    cin >> lmt;
    CirQ c(lmt);
    do
    {
        cout << endl << "1. Insert";
        cout << endl << "2. Delete";
        cout << endl << "3. Display";
        cout << endl << "4.Exit";
        cout << endl << "Enter choice :";
        cin >> ch;
        switch (ch) {
        case 1:
            c.Insert();
            break;
        case 2:
            c.Delete();
            break;
        case 3:
            c.display();
            break;
        }
    } while (ch < 4);
}