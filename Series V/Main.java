#include<iostream>
#include<math.h>
using namespace std;
int main()
{int a[10],n;
 a[0]=11;
 cin>>n;
 for(int i=1;i<n;i++)
 {a[i]=a[i-1]+4;
 }
 for(int i=0;i<n;i++)
 {cout<<pow(a[i],2)<<" ";
 }
}