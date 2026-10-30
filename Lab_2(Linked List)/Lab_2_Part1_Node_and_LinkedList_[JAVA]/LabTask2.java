// LabTask2: Word Decoder
public class LabTask2 {

    // No need to submit this task
    public static Node wordDecoder(Node head) {
        int len = 0;
        for (Node p = head; p != null; p = p.next)
            len++;

        Node dHead = new Node(null);

        if (len == 0)
            return dHead;
        int k = 13 % len;
        if (k == 0)
            return dHead;

        Node p = head;
        for (int i = 0; p != null; i++, p = p.next) {
            if (i != 0 && i % k == 0) {
                Node t = new Node(p.elem);
                t.next = dHead.next;
                dHead.next = t;
            }
        }
        return dHead;
    }

    // NOTE: if you find any issue with the driver code please inform AIB
    // DO NOT TOUCH THE DRIVER CODE BELOW
    public static void main(String[] args) {
        System.out.println("==============Test Case 1=============");
        Node head = LinkedList.createList(new Character[] { 'B', 'M', 'D', 'T', 'N', 'O', 'A', 'P', 'S', 'C' });
        System.out.print("Encoded Word: ");
        LinkedList.printLL(head);
        System.out.println("\nExpected output: null -> C -> A -> T");
        Node result = wordDecoder(head);
        System.out.println("Your output: ");
        LinkedList.printLL(result); // This should print null -> C -> A -> T
        System.out.println();
        System.out.println("==============Test Case 2=============");
        head = LinkedList.createList(new Character[] { 'Z', 'O', 'T', 'N', 'X' });
        System.out.print("Encoded Word: ");
        LinkedList.printLL(head);
        System.out.println("\nExpected output: null -> N");
        result = wordDecoder(head);
        System.out.println("Your output: ");
        LinkedList.printLL(result); // This should print null -> N
        System.out.println();
    }
}
