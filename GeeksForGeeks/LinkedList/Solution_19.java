
class Intersect
{
	int intersectPoint(Node headA, Node headB)
	{
        HashSet<Node> hs = new HashSet<>();
        
        while(headA!=null){
            hs.add(headA);
            headA=headA.next;
        }
        
         while(headB!=null){
            if(hs.contains(headB))
                return headB.data;
            headB=headB.next; 
        }
        
        return 0;
        
	}
}

