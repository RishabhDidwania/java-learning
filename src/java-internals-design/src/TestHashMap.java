import java.util.HashMap;

public class TestHashMap<K,V> {
    int size = 18;
    double bufferSize = 0.67;
    static int current = 0;
    Node<K,V>[] nodeList = new Node[size];


    V get(K key){
        int hashVal = getHashCode(key);
        if(nodeList[hashVal] != null && nodeList[hashVal].key.equals(key)){
            return nodeList[hashVal].val;
        }else if(nodeList[hashVal] != null && nodeList[hashVal].next!=null){
            Node<K,V> temp = nodeList[hashVal];
            while(temp.next!=null){
                if(temp.key.equals(key)) return temp.val;
                temp = temp.next;
            }
        }
        return null;
    }

     boolean put(K key, V val){
        int hashVal = getHashCode(key);
        Node<K,V> node = new Node<>(key, val);

        if(nodeList[hashVal] != null){
            if(nodeList[hashVal].key.equals(key)){
                nodeList[hashVal].setValue(val);
            }else{
                Node<K,V> temp = nodeList[hashVal];
                while(temp.next!=null) {
                    if(temp.key.equals(key)) {
                        temp.setValue(val);
                        return true;
                    }
                    temp=temp.next;
                }
                nodeList[hashVal].setNext(node);
            }
        }else{
            nodeList[hashVal] = node;
        }
        return true;
     }

     int getHashCode(K key){
        return key==null ? 0 : hashCode()%size;
     }
}
