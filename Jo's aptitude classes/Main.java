#include<iostream>
using namespace std;
int main()
{
  int m,n,p,s=1000,g,i;
  cin>>m>>n>>p;
  if(m<=s)
    s=m;
  else if(n<=s)
    s=n;
  else if(p<=s)
    s=p;
  cin>>i;
  if(m%s==0 && n%s==0 && p%s==0)
  {g=s;
  }
  if(i==g)
    cout<<"Answer is correct.";
  else
    cout<<"Answer is wrong.";
}
    
  