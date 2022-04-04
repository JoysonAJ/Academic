#include<iostream>
using namespace std;

class Insertion{
    public:
        int n,arr[];
        Insertion(int sz){
            n = sz;
            arr[n];
        }

        void Input(){
            cout << "Entr the element :";
            for (int i = 0; i < n; i++){
                cin >> arr[i];
            }
        }

        void Sorting(){
            for (int i = 1; i < n; i++){
                int CurrNum = arr[i];
                int j = i - 1;
                while(arr[j] > CurrNum && j>= 0){
                    arr[j + 1] = arr[j];
                    j--;
                }
                arr[j+1] = CurrNum;
            }
            
        }

        void Display(){
            cout << "\n";
            cout<<n<<"\n\n";
            for (int i = 0; i < n; i++){
                cout << arr[i] << "\t";
            }
            cout << "\n\n";
        }
};

int main(){
    int n;
    cout << "Enter the size of array";
    cin >> n;
    Insertion Ins(n);
    Ins.Input();
    cout << "Array Before Sorting";
    Ins.Display();
    Ins.Sorting();
    cout << "Array After Sorting ";
    Ins.Display();
}