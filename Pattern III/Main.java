#include<iostream>
using namespace std;
int main()
{int n;
 cin>>n;
 for(int i=1;i<=n;i++)
 {
   for(int j=1;j<i;j++)
   cout<<i<<"*";
   cout<<i<<endl;
 }
 for(int i=n;i>0;i--)
 {
   for(int j=1;j<i;j++)
   cout<<i<<"*";
   cout<<i<<endl;
 }
}