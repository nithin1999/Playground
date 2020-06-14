#include<iostream>
using namespace std;
int main()
{float a[20];
 a[0]=0.5;
 int n;
 cin>>n;
 for(int i=1;i<=n;i++)
   a[i]=3*a[i-1];
 for(int i=0;i<n;i++)
 {cout<<a[i]<<" ";}
}
   
 