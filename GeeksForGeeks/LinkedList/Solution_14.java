
class GfG {

    public static int countPairs(LinkedList<Integer> head1, LinkedList<Integer> head2,
                          int x) {
    
        int c=0;
        HashSet<Integer> hs = new HashSet<>();
        
        Iterator<Integer> itr=head1.iterator();  
        
        while(itr.hasNext()){  
             hs.add(itr.next());
        }
        
        Iterator<Integer> itr2 =head2.iterator();  
        
         while(itr2.hasNext()){  
               if(hs.contains(x-itr2.next()))
                c++;
        }
 
        return c;
    }
}
