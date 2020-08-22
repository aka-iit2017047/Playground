#include<iostream>
using namespace std;
int difference(int n){
    int count=0;
    int c1=0;
    int c2=0;
    while(n>0){
      if(count==0 or (count%2==0)){
        c1=c1+n%10;
        n=n/10;
        count++;
      }
      else{
        c2=c2+n%10;
        n=n/10;
        count++;
      }
    }
    return abs(c1-c2);
 
}
int main()
{
  //Type your code here
  int n;
  cin>>n;
  cout<<difference(n)<<endl;
}