#include<iostream>
using namespace std;

class Stack{
    private:
        int top, ar_size;
        int arr[100];

        public:
            Stack(int n){
                top = -1;
                ar_size = n;
            }
            
        void push(){
            if( top == (ar_size-1) ){
                cout << "Stack is Full ";
                return;
            }

            cout << "Enter the element :\t";
            cin >> arr[++top];
        }
        void pop(){
            if(top == -1){
                cout << "Stack is Empty";
                return;
            }
            cout << "Deleted element is : \t" << arr[top--];
        }

        void Display(){
            if (top == -1){
                cout << "Stack is Empty";
                return;
            }
            for (int i = 0; i <= top;i++){
                cout << arr[i] << "\t";
            }
            cout << endl;
        }
};

int main(){
    int n,ch;
    cout << "Enter the size of array";
    cin >> n;
    Stack st(n);
    do{
        cout << "\n 1.PUSH \n 2.POP \n 3.DISPLAY \n 4.EXIT";
        cout << "\nEnter the Choice";
        cin >> ch;
        switch (ch){

            case 1:
                st.push();
                break;
            case 2:
                st.pop();
                break;
            case 3:
                st.Display();
                break;
        }
        cout << endl;
    } while (ch < 4);
    return 0;
}