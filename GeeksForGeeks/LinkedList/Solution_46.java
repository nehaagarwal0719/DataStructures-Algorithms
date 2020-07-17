class Node { 
    int key; 
    int value; 
    Node pre; 
    Node next; 
  
    public Node(int key, int value) 
    { 
        this.key = key; 
        this.value = value; 
    } 
} 


class LRUCache
{
    
    private HashMap<Integer, Node> map; 
    private int capicity, count; 
    private Node head, tail; 
    
    LRUCache(int capacity)
    {
        // Intialize the cache capacity with the given
        // cap
        this.capicity = capacity; 
        map = new HashMap<>(); 
        head = new Node(0, 0); 
        tail = new Node(0, 0); 
        head.next = tail; 
        tail.pre = head; 
        head.pre = null; 
        tail.next = null; 
        count = 0; 
    }

    // This method works in O(1)
    public int get(int key)
    {
        // your code here
        if (map.get(key) != null) { 
            Node node = map.get(key); 
            int result = node.value; 
            deleteNode(node); 
            addToHead(node); 
           
            return result; 
        } 

        return -1; 
    }

    // This method works in O(1)
    public void set(int key, int value)
    {

        if (map.get(key) != null) { 
            Node node = map.get(key); 
            node.value = value; 
            deleteNode(node); 
            addToHead(node); 
        } 
        else { 
            Node node = new Node(key, value); 
            map.put(key, node); 
            if (count < capicity) { 
                count++; 
                addToHead(node); 
            } 
            else { 
                map.remove(tail.pre.key); 
                deleteNode(tail.pre); 
                addToHead(node); 
            } 
        } 
    }
    
    
    public void deleteNode(Node node) 
    { 
        node.pre.next = node.next; 
        node.next.pre = node.pre; 
    } 
  
    public void addToHead(Node node) 
    { 
        node.next = head.next; 
        node.next.pre = node; 
        node.pre = head; 
        head.next = node; 
    } 
}
