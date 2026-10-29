class LinkedList{
    Node head;
    public void append(Integer val){
        // TODO: Insert node at the end
        Node t=new Node(val);
        if(head==null) head=t;
        else{   
            Node p=head;
            while(p.next!=null){
                p=p.next;
            }
            p.next=t;
        }
    }
    public void printList(){
        // TODO: Print all elements from head
        if(head==null) return;
        Node p=head;
        while(p!=null){
            System.out.print(p.elem +" ");
            p=p.next;
        }
        System.out.println();
    }
    public void prepend(Integer val){
        // TODO: Insert node at the beginning
        Node t=new Node(val);
        t.next=head;
        head=t;
    }
    public int length(){
        Node p=head;
        int count=0;
        while(p!=null){
            count++;
            p=p.next;
        }
        return count;
    }
    public Node nodeAt(int indx){
        if(indx<0 || indx>length()-1) return null;
        Node p=head;
        int idx=0;
        while(p!=null){
            if(idx==indx) return p;
            idx++;
            p=p.next;
        }
        return null;

        // for(int i=0;i<indx;i++) p=p.next;
        // return p;
    }
    public void removeFirst(){
        if(head==null) return;
        head=head.next;
    }
    public void removeLast(){
        // TODO: Remove the last node
        if(head==null) return;
        if(head.next==null){
            head=null;
            return;
        }
        Node p=head;
        while(p.next.next!=null) p=p.next;
        p.next=null;
    }
}