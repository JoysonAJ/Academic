// String Operation

#include <iostream>
using namespace std;

int StringCount(char str[]){
    int StringNum = 0;
    for (int i = 0; str[i] != '\0';i++){
        StringNum++;
    }
    return StringNum;
}

void ReverseString(char str[]){
    int Last = StringCount(str);
    for (int i = Last-1; i >= 0;i--){
        cout << str[i];
    }
    cout << endl;
}

void ConcateString(char str[]){
    int j = 0, i, len1, len2;
    char str1[20],str3[50];
    cout << "Enter the String 2 :";
    cin >> str1;
    len1 = StringCount(str);
    len2 = StringCount(str1);
    
    for (i = 0; i < (len1 + len2);i++){
        if(i<len1)
            str3[i] = str[i];

        if (i >= len1 && i < (len1 + len2) )
            str3[i] = str1[j++];
    }

    for (i = 0; i < (len1 + len2); i++){
        cout << str3[i];
    }
    cout << endl;
}

void StringCompare(char str1[]){
    int len1,len2;
    char str2[20];
    
    cout << "Enter the string 2 : ";
    cin >> str2;
    len1 = StringCount(str1);
    len2 = StringCount(str2);

    if(len1 != len2){
        cout<<str1<<" Is Not Equal (length) to "<<str2<<endl;
        return;
    }
    for(int i = 0 ;i < len1;i++){
        if(str1[i] != str2[i] ){
            cout<<"String not Matching \n Not equal";
            return;
        }
    }
    cout<<"Equal";
}


void SubString(char str1[]){
    int StartPos,EndPos,len1;
    len1 = StringCount(str1);
    cout << "Enter the Starting position";
    cin >> StartPos;
    cout << " Enter the ending Pos ";
    cin >> EndPos;
    if( (StartPos > EndPos) || (0 <= StartPos && EndPos < len1) ){
        for (int i = StartPos; i < EndPos; i++){
            cout << str1[i] << "";
        }
        cout << endl;
        return;
    }
    cout << "Invalid postion ";
}

int main() {
        int ch;
        char str1[20];
        cout << "Enter the Main String :";
        cin >> str1;
        do {
            cout << "\n1.Count of String  ";
            cout << "\n2.Reverse a String ";
            cout << "\n3.Concation with  string2 ";
            cout << "\n4.Compare the String ";
            cout << "\n5.Substring ";
            cout << "\n6.Exit";
            cout << "\n Enter the choice :";
            cin >> ch;
            switch (ch)
            {
            case 1:
                cout<<"String Count is =" << StringCount(str1);
                break;
            case 2:
                ReverseString(str1);
                break;
            case 3:
                ConcateString(str1);
                break;
            case 4:
                StringCompare(str1);
                break;
            case 5:
                SubString(str1);
                break;
        }
    } while (ch < 6);
    return 0;
    
}