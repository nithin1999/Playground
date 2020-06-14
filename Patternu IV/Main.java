#include <iostream>
using namespace std;
int main() 
{
    int n,a[10][10],k=1,i,j;
  cin>>n;
  for(i=0;i<n;i++)
  {if(i%2==0)
  {for(j=0;j<n-1;j++)
    a[i][j]=k;
   k++;
   a[i][j]=k;
  }
   else
   {for(j=n-1;j>0;j--)
     a[i][j]=k;
    k++;
    a[i][j]=k;
   }
  }
  for(i=0;i<n;i++)
  {for(j=0;j<n;j++)
    cout<<a[i][j];
   cout<<endl;
  }
    return 0;
}