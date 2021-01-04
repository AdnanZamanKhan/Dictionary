
package dictionary;

import javax.swing.JOptionPane;

public class Tree {
  public Node root;
    
    public String find(String key)
    {
        Node current=root;
        
        while(!(key.equalsIgnoreCase(current.data)))
        {
            
            int k=key.compareTo(current.data);
            if(k>0)
            {
                current=current.right;
            }
            else
            {
                current=current.left;
            }
           
                if(current==null)
                {
                    return ("Not Found");
                }
        }
        return ("Meaning : "+current.mean+"\n\nSynonym  : "+current.synonym);
    }
    
    public void insert(String key1,String key2, String key3)
    {
        Node newNode = new Node(key1, key2, key3);
       
        if(root==null)
        {
            newNode.left=null;
            newNode.right=null;
            root=newNode;
        }
        else
        {
            Node current=root;
            boolean t=true;
            while(t)
            {
               
                int k=key1.compareTo(current.data);
                if(k>0)
                {
                    
                    if(current.right==null)
                    {
                        newNode.left=null;
                        newNode.right=null;
                        current.right=newNode;
                        t=false;
                        JOptionPane.showMessageDialog(null,"Word Added Successfully");
                    }
                    else
                    {
                    current=current.right;
                    }
                }
                
                else
                {
                    
                    if(current.left==null)
                    {
                        newNode.left=null;
                        newNode.right=null;
                        current.left=newNode;
                        t=false;
                        JOptionPane.showMessageDialog(null,"Word Added Successfully");
                    }
                    else
                    {
                    current=current.left;
                    }
                }
                
            }
        }
    }
      
}
