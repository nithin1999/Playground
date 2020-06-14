#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int n,nd=0,temp;
  cin>>n;
  temp=n;
  while(temp)
  {temp=temp/10;
   nd++;
  }
  int sn,snd=0,temp1,sum;
  sn=pow(n,2);
  temp1=sn;
  while(temp1)
  {temp1=temp1/10;
   snd++;
  }
  int d2=pow(10,nd);
  sum=sn/pow(10,nd)+sn%d2;
  if(sum==n)
    cout<<"Kaprekar Number";
  else 
    cout<<"Not a Kaprekar Number";
}
    
  
  