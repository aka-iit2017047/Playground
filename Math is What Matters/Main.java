#include<iostream>
using namespace std;
int powerr(int m,int n){
  int c=1;
  for(int i=1;i<=n;i++){
    c=c*m;
  }
  return c;
}
int count_digits(int n){
  int count=0;
  while(n>0){
    n=n/10;
    count++;
  }
  return count;
}
bool arm_storng(int n){
  int sum=0;
  int t=n;
  int x=count_digits(n);
  while(n>0){
    int y=n%10;
    sum=sum+powerr(y,x);
    n=n/10;
  }
  if(t==sum){
    return true;
  }
  else{
    return false;
  }
}
int main()
{
  //Type your code here
  int n;
  cin>>n;
  if(arm_storng(n)==true){
    cout<<"Yes"<<endl;
  }
  else{
    cout<<"No"<<endl;
  }
}