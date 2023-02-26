package stackrfp;

public class OurLinkedList {
    Node head;
    Node tail;
    public OurLinkedList(Node nodeOne, Node nodeTwo){
        this.head = nodeOne;
        this.tail = nodeTwo;
    }
    public OurLinkedList(Node nodeOne){
        this.head = nodeOne;
        this.tail = nodeOne;
    }
    public OurLinkedList(){
        this.head = null;
        this.tail = null;
    }
    //To add new node
    public void addNode(Node newNode){
        if (this.tail == null){
            this.tail = newNode;
        }
        if (this.head == null){
            this.head = newNode;
        }
        else {
            Node tempNode = this.head;
            this.head = newNode;
            newNode.setNextNode(tempNode);
        }
    }
    //method to print all elements of linked list
    public void printLinkdListElements(){
        StringBuffer myLinkedListElements = new StringBuffer("My Linked list elements : ");
        Node tempNode = this.head;

        while (tempNode.getNextNode() != null){
            myLinkedListElements.append(tempNode.getValue());
            myLinkedListElements.append("-->");
            tempNode = tempNode.getNextNode();
        }
        myLinkedListElements.append(tempNode.getValue());
        System.out.println(myLinkedListElements);
    }

    public static void main(String[] args) {
        OurLinkedList emptyLnkdList = new OurLinkedList();
        //System.out.println(emptyLnkdList.head.value);
        //System.out.println(emptyLnkdList.tail.value);

        Node nodeOne = new Node(14);
        OurLinkedList ourLinkedList = new OurLinkedList(nodeOne);
        //System.out.println(ourLinkedList.head.value);
        //System.out.println(ourLinkedList.tail.value);

        Node nodeTwo = new Node(11);
        ourLinkedList.addNode(nodeTwo);

        Node nodeThree = new Node(36);
        ourLinkedList.addNode(nodeThree);

        OurLinkedList ourLnkdList = new OurLinkedList(nodeTwo,nodeThree);
        //System.out.println(ourLinkedList.head.value);
        //System.out.println(ourLnkdList.tail.value);

        //System.out.println(ourLnkdList.head.getValue());

        ourLnkdList.addNode(nodeThree);

        ourLinkedList.printLinkdListElements();

    }
}
