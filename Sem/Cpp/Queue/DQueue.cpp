#include<iostream>
using namespace std;

class Dequeue{

    private:
        int front = -1, back = -1, Qsize, dq[20];
    
    public:
        Dequeue(int n){
            Qsize = n;
        }
    
    void EnqueueBack(){
        if ( front == 0 && back == Qsize - 1){
            cout << "Queue is full ";
            return;
        }

        if( !front == -1 && back == (Qsize-1) ){
            cout << "Insert from front end \n Back End reached last location ";
            return;
        }

        cout << "Enter the element \t : ";
        cin >> dq[++back];
        if( front == -1)
            front++;
    }

    void EnqueueFront(){
        if (front == 0 && back == Qsize - 1){
            cout << "Queue is full ";
            return;
        }
        if(front <= 0){
            cout << "\nInsertion from front not possible";
            return;
        }
        cout << "Enter the element ";
        cin >> dq[--front];
    }

    void DequeueFront(){
        if( front == -1 && back == -1){
            cout << "\n Empty Queue ";
            return;
        }
        cout << "\n Deleted element " << dq[front];
        if(front == back){
            front = back = -1;
            return;
        }
        front++;
    }

    void DequeueBack(){
        if(front == -1 && back == -1){
            cout << "\n empty Queue";
            return;
        }
        cout << "\n Deleted element " << dq[back];
        if (front == back ){
            front = back = -1;
            return;
        }
        back--;
    }

    void Display(){

        if( front == -1 && back == -1){
            cout << "Queue empty";
            return;
        }
        for (int i = front; i <= back;i++){
            cout << dq[i] << "\t";
        }
    }
};

int main(){

    int arrSize, ch;
    cout << "Enter the size of the array :";
    cin >> arrSize;
    Dequeue dq(arrSize);
    do{
        cout << "\n \t 1.Enqueue\t--\t Back \n ";
        cout << "\t 2.Enqueue\t--\t Front \n ";
        cout << "\t 3.Dequeue\t--\t Front \n ";
        cout << "\t 4.Dequeue\t--\t Back \n ";
        cout << "\t 5.Display\n ";
        cout << "\n Enter the Choice";
        cin >> ch;
        switch(ch){
            case 1:
                dq.EnqueueBack();
                break;
            case 2:
                dq.EnqueueFront();
                break;
            case 3:
                dq.DequeueFront();
                break;
            case 4:
                dq.DequeueBack();
                break;
            case 5:
                dq.Display();
                break;
        }
    } while (ch < 6);
    return 0;
}