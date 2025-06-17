public class CustomStack<T> {
    private Node<T> lastNode;
    private Node<T> firstNode;

    //Insertar
    public void push(T value) {
        if (lastNode ==  null) {
            lastNode = new Node<T> (value);
            firstNode = lastNode;
        }
        else {
            Node <T> current = new Node<T> (value);
            current.setNext(firstNode);
            firstNode = current;
        }
    }

    //Eliminar
    public T pop() {
        if (lastNode != null) {
            if (firstNode.equals(lastNode)) {
                T valueT = lastNode.getValue();
                firstNode = null;
                lastNode = null;
                return valueT;
            } else {
                T valueFirst = firstNode.getValue();
                firstNode = firstNode.getNext();
                return valueFirst;
            }  
        } else {
        return null;
    }
}
}