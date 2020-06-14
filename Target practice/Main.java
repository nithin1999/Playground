#include<iostream>
using namespace std;
int main()
{
  int t,sum=0;
  cin>>t;
  int n,i=0;
  while(sum<t)
  {cin>>n;
   sum+=n;
   i++;
  }
  cout<<"The number of turns is "<<i;
  
}