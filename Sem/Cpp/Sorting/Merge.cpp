#include<iostream>
using namespace std;

void Display(int arr[],int n){
    cout << "\n";
    cout << "Array element are \n";
    for (int i = 0; i < n; i++){
        cout << arr[i] << "\t";
    }
    cout << "\n\n";
}

void Merge(int arr[],int Start, int mid, int End){
    int sz1 = mid-Start+1;
    int sz2 = End - mid;

    int temp1[sz1];
    int temp2[sz2];

    for (int i = 0; i < sz1;i++){
        temp1[i] = arr[Start + i];
    }

    for (int i = 0; i < sz2; i++) {
        temp2[i] = arr[mid + 1 + i];
    }

    int i = 0, j = 0, k = Start;
    while(i < sz1 && j < sz2){
        
        if(temp1[i] < temp2[j])
            arr[k++] = temp1[i++];
        else
            arr[k++] = temp2[j++];
    }
    
    while(i < sz1){
        arr[k++] = temp1[i++];
    }

    while(j < sz2){
        arr[k++] = temp2[j++];
    }

}

void mergeSort(int arr[],int Start, int End){
    if (Start < End){
        int mid = (Start + End) / 2;

        mergeSort(arr,Start, mid);
        mergeSort(arr,mid + 1, End);

        Merge(arr,Start, mid, End);
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
    // int arr[] = {5,4,3,2,1 };
    cout << "Before Sorting";
    Display(arr, n);
    mergeSort(arr, 0, n-1   );
    cout << "After Sorting";
    Display(arr, n);

    return 0;
}