#include<iostream>
using namespace std;
int main()
{
  int n,a[10];
  cin>>n;
  
  int i=0,temp=n,count=0,se=0,so=0;
  while(temp)
  {a[i]=temp%10;
   temp=temp/10;
   i++;
   count++;
  }
  for(i=0;i<=count;i++)
  {if(i%2==0)
    se+=a[i];
   else
     so+=a[i];
  }
  
  if(se==so)
    cout<<"Yes";
  else
    cout<<"No";
}
    