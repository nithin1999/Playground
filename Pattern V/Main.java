#include<iostream>
using namespace std;
int main()
{
  int n,f=0,lt;
  cin>>n;
  int l=n*(n+1);
  int r=1;
  for(int i=n;i>0;i--)
  {for(int space=0;space<(n-i);space++)
    cout<<"--";
    for(int j=1;j<=i;j++)
  {cout<<r<<"*";
   r++;
  }
  f+=(i);
  lt=l-f+1;
   for(int k=1;k<=i;k++)
   {
    cout<<lt;
    if(k<i)
    {
    cout<<"*";
  lt++;}
   }
   cout<<endl;
  }
}   