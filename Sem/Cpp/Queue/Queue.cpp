#include <iostream>
using namespace std;

class Queue {

    private:
        int q[20], back = -1, front = -1, limit;
    
    public:
        Queue(int n){
            limit = n;
        }
    
    void Insert(){
        if( back == (limit-1) ){
            cout << "Queue is Full";
            return;
        }
        cout << "Enter the element :";
        cin >> q[++back];
        if(front == -1 )
            front++;
    }

    void Delete(){
        if(front == back ){
            front = back = -1;
            cout << "Queue is empty";
            return;
        }
        cout << "Deleted element is :" << q[front++];
    }

    void Display(){
        if(front == back){
            cout << "Queue is empty";
            return;
        }
        for (int i = front; i <= back;i++){
            cout << q[i] << "\t";
        }
    }

};

int main() {
    int n, ch;
    cout << "Enter the size of the array :";
    cin >> n;
    Queue q(n);
    do{
        cout << "\n1.ADD \n 2.DELETE \n 3.DISPLAY \n 4.EXIT \n";
        cout << "Enter the choice :";
        cin >> ch;
        switch(ch){
            case 1:
                q.Insert();
                break;
            case 2:
                q.Delete();
                break;
            case 3:
                q.Display();
                break;
        }
    } while (ch < 4);
    return 0;
}