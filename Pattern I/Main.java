#include<iostream>
using namespace std;
int main()
{int n;
 cin>>n;
 for(int i=1;i<=8;i++)
 {int k=i;
  if(i<=3)
  {
  do
  {cout<<n;
   k--;
  }while(k>0);
    cout<<"\n";
    n++;
  }
  else if(i==4||i==5)
  {int k=4;
   do
  {cout<<n;
   k--;
  }while(k>0);
    cout<<"\n";
   if(i==5)
     n--;
  }
  else if(i>5)
  {k=8-i;
    do
    {cout<<n;
     k--;
    }while(k>=0);
     cout<<"\n";
    n--;
  }
 }
}