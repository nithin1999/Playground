#include<iostream>
using namespace std;
int main()
{int a[20],b[20],n;
 a[0]=5;
 b[0]=6;
 cin>>n;
 for(int i=1;i<n;i++)
   a[i]=a[i-1]+5;
 for(int i=0;i<n;i++)
 {b[i+1]=b[i]+a[i];}
 for(int i=0;i<n;i++)
   cout<<b[i]<<" ";
}