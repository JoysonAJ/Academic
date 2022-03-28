// Infix to Postfix without ()

#include<iostream>
#include<stack>
using namespace std;

int prec( char c ){
    if ( c == '^')
        return 3;
    
    else if(c == '*' || c == '/')
        return 2;
    
    else if( c == '+' || c == '-' )
        return 1;
    else
        return -1;

}

string InfixtoPostfix(string s){
    stack<char> st;
    string res;

    for (int i = 0; i < s.length(); i++){
        if ((s[i] >= 'a' && s[i] <= 'z') || (s[i] >= 'A' && s[i] <= 'Z'))
            res += s[i];
        else{
            while( !st.empty() && prec(st.top() >= prec(s[i])) ){
                res += st.top();
                st.pop();
            }
            st.push(s[i]);
        }
    }
    while( !st.empty()){
        res += st.top();
        st.pop();
    }
    return res;
}

int main(){
    cout << "\n\n\n";
    cout << "a+b/c-g"<<endl;
    cout << InfixtoPostfix("a+b/c-g") << endl;
    cout << "\n\n\n";
    return 0;
}