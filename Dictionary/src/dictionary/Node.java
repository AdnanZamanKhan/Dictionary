
package dictionary;

public class Node {
    Node left,right;
    String data;
    String mean;
    String synonym;
    
    Node(String data, String mean, String synonym)
    {
        
        this.data=data;
        this.mean=mean;
        this.synonym=synonym;
    }
    
}
