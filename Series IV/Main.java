#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int a[20],n;
  cin>>n;
  a[0]=1;
  for(int i=1;i<n;i++)
    a[i]=i+1;
  for(int i=0;i<n;i++)
  {if(a[i]%2)
    cout<<pow(a[i],2)-1<<" ";
   else
     cout<<pow(a[i],2)-2<<" ";
  }
}
    
  
