
public class Node<K,V> {

    K key;
    V val;
    Node<K,V> next;

    Node(K key, V val){
        this.key=key;
        this.val=val;
    }

    void setNext(Node<K,V> node){
        this.next = node;
    }

    void setValue(V value){
        this.val = value;
    }
}
