#include<iostream>
using namespace std;

class Selection{
    public:
        int n,arr[];
        Selection(int sz){
            n = sz;
            arr[n];
        }

        void Input(){
            for (int i = 0; i < n; i++){
                cin >> arr[i];
            }
        }

        void Sorting(){
            for (int i = 0; i < n - 1;i++){
                for (int j = i + 1; j < n;j++){
                    if(arr[j] < arr[i]){
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }

        void Display(){
            cout << "\n";
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
    Selection S(n);
    cout << "Entr the element :";
    S.Input();
    cout << "Array Before Sorting";
    S.Display();
    S.Sorting();
    cout << "Array After Sorting ";
    S.Display();
}