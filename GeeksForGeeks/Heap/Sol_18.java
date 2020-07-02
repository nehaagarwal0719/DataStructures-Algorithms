class Decode
{
    static String decodeHuffmanData(MinHeapNode root, String binaryString)
    {
        MinHeapNode temp=root; String res="";
        // add your codehere
        for(int i=0;i<binaryString.length();){
            temp=root;
            while(temp.data=='$'){   /// dollar ke jagah can check for root.lef==null && root.right==null
                if(binaryString.charAt(i)=='0')
                  temp=temp.left;
                else
                  temp=temp.right;
                  i++;
            }
            res+=temp.data;
        }
        return res;
    }
}

