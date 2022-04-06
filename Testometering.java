class bst{
    
    Node root;

    private class Node{
    	
    	// These attributes of the Node class will not be sufficient for those attempting the AVL extra credit.
    	// You are free to add extra attributes as you see fit, but do not remove attributes given as it will mess with help code.
        String keyword;
        Record record;
        int size;
        Node l;
        Node r;

        private Node(String k){
        	// TODO Instantialize a new Node with keyword k.
            this.keyword = k;
            this.l = null;
            this.r = null;
        }

        private void update(Record r){
        	//TODO Adds the Record r to the linked list of records. You do not have to check if the record is already in the list.
        	//HINT: Add the Record r to the front of your linked list.
            Record temp = this.record;
            this.record = r;
            this.record.next = temp;
            this.size++;

        }

       
    }

    public bst(){
        this.root = null;
    }
      
    public void insert(String keyword, FileData fd){
        Record recordToAdd = new Record(fd.id, fd.author, fd.title, null);
        //TODO Write a recursive insertion that adds recordToAdd to the list of records for the node associated
        //with keyword. If there is no node, this code should add the node.
        this.root = insert(this.root, keyword, recordToAdd);
    }
    
    private Node insert(Node subtree, String keyword, Record record)
    {
        if(null == subtree)
        {
            Node n = new Node(keyword);
            n.update(record);
            subtree = n;
        }
        else
        {
            int determinant = subtree.keyword.compareTo(keyword);

            if(determinant < 0)
            {
                subtree.r = insert(subtree.r, keyword, record);
            }
            if(determinant > 0)
            {
                subtree.l = insert(subtree.l, keyword, record);
            }
            else
            {
                subtree.update(record);
            }
        }

        return subtree;
    }
    
    public boolean contains(String keyword){
    	//TODO Write a recursive function which returns true if a particular keyword exists in the bst
    	return contains(this.root, keyword);
    }
    
    private boolean contains(Node current, String keyword)
    {
        if(null == current)
        {
            return false;
        }

        int determinant = current.keyword.compareTo(keyword);

        if(determinant < 0)
        {
            return contains(current.r, keyword);
        }
        if(determinant > 0)
        {
            return contains(current.l, keyword);
        }
        else
        {
            return true;
        }
    }

    public Record get_records(String keyword){
        //TODO Returns the first record for a particular keyword. This record will link to other records
    	//If the keyword is not in the bst, it should return null.
    	return get_records(this.root, keyword);
    }
    
    private Record get_records(Node current, String keyword)
    {
        if(null == current)
        {
            return null;
        }

        int determinant = current.keyword.compareTo(keyword);

        if(determinant < 0)
        {
            return get_records(current.r, keyword);
        }
        if(determinant > 0)
        {
            return get_records(current.l, keyword);
        }
        else
        {
            return current.record;
        }
    }

    public void delete(String keyword){
    	//TODO Write a recursive function which removes the Node with keyword from the binary search tree.
    	//You may not use lazy deletion and if the keyword is not in the bst, the function should do nothing.
    	this.root = delete(this.root, keyword);
    }
    
    private Node delete(Node current, String keyword)
    {
        if(null == current)
        {
            return null;
        }

        int determinant = current.keyword.compareTo(keyword);

        if(determinant > 0)
        {
            current.l = delete(current.l, keyword);
        }
        if(determinant < 0)
        {
            current.r = delete(current.r, keyword);
        }
        if(null != current.l && null != current.r)
        {
            Node min = find_min(current.r);

            current.keyword = min.keyword;
            current.record = min.record;
            current.size = min.size;
            current.r = delete(current.r, current.keyword);
        }
        else
        {
            if(null != current.l)
            {
                current = current.l;
            }
            if(null != current.r)
            {
                current = current.r;
            }
            else
            {
                current = null;
            }
        }

        return current;
    }
    
    private Node find_min(Node current)
    {
        return (null != current.l) ? find_min(current.l) : current;
    }

    public void print(){
        print(root);
    }

    private void print(Node t){
        if (t!=null){
            print(t.l);
            System.out.println(t.keyword);
            Record r = t.record;
            while(r != null){
                System.out.printf("\t%s\n",r.title);
                r = r.next;
            }
            print(t.r);
        } 
    }
    

}