#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int m,n,req,p;
  cin>>m>>n>>req;
  p=pow(m,n);
  if(p>=req)
    cout<<"Doctor, you can proceed with your experiment.";
  else
    cout<<"Sorry Doctor! You need more bacteria.";
}