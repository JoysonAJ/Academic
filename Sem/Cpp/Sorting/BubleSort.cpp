#include <iostream>
using namespace std;

class Sorting
{

public:
    int n, arr[];
    Sorting(int len) {
        n = len;
        arr[n];
    }

    void Input() {
        for (int i = 0; i < n; i++) {
            cin >> arr[i];
        }
    }

    void Display() {
        cout << "\n";
        for (int i = 0; i < n; i++) {
            cout << arr[i] << "\t";
        }
        cout << "\n\n";
    }

    void BubleSort() {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++){
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
};

int main(){
    int n;
    cout << "Enter the Size of the array:";
    cin >> n;
    Sorting S(n);
    cout << "Enter the element into the array";
    S.Input();
    cout << "Element before sorting" ;
    S.Display();
    S.BubleSort();
    cout << "Array After Sorting " ;
    S.Display();
    return 0;
}