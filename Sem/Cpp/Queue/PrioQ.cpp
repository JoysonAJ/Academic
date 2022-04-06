#include <iostream>
using namespace std;

class Priority {

    private:
        int q[20], back = -1, n;
    
    public:
        Priority(int sz){
            n = sz;
        }

    void Insert(){
        if( back == (n - 1) ){
            cout << "Queue is Full";
            return;
        }
        cout << "Enter the element :";
        cin >> q[++back];
    }

    void Delete(){
        if( back == -1 ){
            back = -1;
            cout << "Queue is empty";
            return;
        }
        int idx = 0;
        int minEle = q[0];

        for (int i = 1; i <= back; i++){
            if ( minEle > q[i]){
                minEle = q[i];
                idx = i;
            }
        }
        cout << "Deleted element is : \t" << minEle;

        for (int i = idx; i < back;i++){
            q[i] = q[i + 1];
        }
        back--;
    }

    void Display(){
        if(back == -1){
            cout << "Queue is empty";
            return;
        }
        for (int i = 0; i <= back;i++){
            cout << q[i] << "\t";
        }
    }

};

int main() {
    int n, ch;
    cout << "Enter the size of the array :";
    cin >> n;
    Priority q(n);
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