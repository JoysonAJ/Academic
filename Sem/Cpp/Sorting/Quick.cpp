#include<iostream>
using namespace std;

void Display(int arr[], int n){
    cout << "\n";
    cout << "Array element are \n";
    for (int i = 0; i < n; i++){
        cout << arr[i] << "\t";
    }
    cout << "\n\n";
}

void swap(int arr[],int i,int j){
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}

int Partition(int arr[],int start,int last){
    int pivt = arr[last];
    int i = start - 1;
    int j;

    for (j = start; j < last;j++){
        if( arr[j] < pivt ){
            i++;
            swap(arr,i,j);
        }
    }
    swap(arr, i + 1, j);
    return i + 1;
}

void QuickSort(int arr[], int start, int last)
{
    if(start<last){
        int pi = Partition(arr, start, last);
        QuickSort(arr, start, pi - 1);
        QuickSort(arr, pi + 1, last);
    }
}

int main(){

    int n;
    cout << "Enter the size of array";
    cin >> n;
    int arr[n];
    cout << "Entr the element :";
    for (int i = 0; i < n; i++){
        cin >> arr[i];
    }
    cout << "Before Sorting";
    Display(arr, n);
    QuickSort(arr, 0, n - 1);
    cout << "After Sorting";
    Display(arr, n);
}