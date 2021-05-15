/*
PROBLEM STATEMENT
If Give an integer N . Write a program to obtain the sum of the first and last digits of this number.

Input
The first line contains an integer T, the total number of test cases. Then follow T lines, each line contains an integer N.

Output
For each test case, display the sum of first and last digits of N in a new line.

Constraints
1 ≤ T ≤ 1000
1 ≤ N ≤ 1000000

Example
Input
3 
1234
124894
242323

Output
5
5
5

**/


#include <iostream>
using namespace std;

int main() {
    int t,a,r,q1;
    cin>> t;
    while(t--){
        cin>> a;
    }
    int q = a%10;
    while(a>10){
        r = a%10;
        a = a/10;
        q1 = a;
    }
     int sum = q+q1;
     cout<<sum;
     
	// your code goes here
	return 0;
}
