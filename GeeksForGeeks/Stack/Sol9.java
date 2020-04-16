
class Stacks
{
    // sq is the object of class TwoStack

    /* The method push to push element into the stack 2 */
 public void push1(int x, TwoStack sq)
{
if (sq.top1 < sq.top2 - 1)
{
sq.top1++;
sq.arr[sq.top1] = x;
}
}

public void push2(int x, TwoStack sq)
{
if (sq.top1 < sq.top2 -1)
{
sq.top2--;
sq.arr[sq.top2] = x;
}
}

public int pop1(TwoStack sq)
{
if(sq.top1==-1)
return -1 ;
else
{
int x = sq.arr[sq.top1];
sq.top1--;
return x;
}
}

public int pop2(TwoStack sq)
{
if(sq.top2== sq.size)
return -1 ;
else
{
int x =sq.arr[sq.top2];
sq.top2++;
return x;
}
}

