//creates the elements and the builder to be able to delete and add to a hashtable
class HashTableBuilder {
  Element [] hashTable;
  int tableSize;

  //makes a hashtablebuiler
  HashTableBuilder(int numKeyWords) {
    //tableSize = nextPrime(numKeyWords * 2);
    tableSize = nextPrime(numKeyWords * 2);
    hashTable = new Element[tableSize];
  }

  //returns the new element
  private Element createNewElement(String keyword, Record recordToAdd) {
    return new Element(keyword, recordToAdd);
  }
  
  //inserts the words
  void insert(String keyword, FileData fd) {
    Record recordToAdd = new Record(fd.id, fd.title, fd.author, null);
    int index = find(keyword);
    if (index == -1)
      insert(keyword, recordToAdd);
    else {
      //System.out.printf("%s: %d\n", keyword, index);
      recordToAdd.next = hashTable[index].head;
      hashTable[index].head = recordToAdd;
    }
    /*if (!contains(keyword, recordToAdd)) {
      insert(keyword, recordToAdd);*/
  }

  //insets the words
  private void insert(String keyword, Record recordToAdd) {
    int key = convertStringToInt(keyword);
    //System.out.printf("%d %d\n", key, tableSize);
    int index = key % tableSize;
    int  probe = 1;
    while (hashTable[index] != null) {
      System.out.printf("%s conflicts with %s at index: %d\n", keyword, hashTable[index].keyword, index);
      index = getNextQuadProbIndex(key, probe++);
    }
    hashTable[index] = createNewElement(keyword, recordToAdd);
  }

  //finds the words
  int find(String keyword) {
    int key = convertStringToInt(keyword);
    //System.out.printf("%d %d\n", key, tableSize);
    int index = key % tableSize;
    int  probe = 1;
    while (hashTable[index] != null) {
      if (hashTable[index].keyword.compareTo(keyword) == 0)
        return index;
      index = getNextQuadProbIndex(key, probe++);
    }
    return -1;
  }

  //gets the next index in the list
  private int getNextQuadProbIndex(int key, int probe) {
    return ((key % tableSize) + (int) Math.pow(probe, 2)) % tableSize;
  }
  
  //converts to int
  private int convertStringToInt(String keyword) {
    int sum = 0;
    for (int i=0; i < keyword.length(); i++)
      sum += (int) keyword.charAt(i);
    return sum;
  }
  //checks fo rthe next prime
  private int nextPrime(int num) {
      num++;
      for (int i = 2; i < num; i++) {
         if(num%i == 0) {
            num++;
            i=2;
         } else {
            continue;
         }
      }
      return num;
   }
  
  //delete function for the next node
  public void delete(String keyword) {

	    root = deleteRecord(root, keyword); // calls deleteRecords function

	  }
  
  //deletes the record of the next node
	  public Node deleteRecord(Node root, String keyword) {
	    if (root == null) { // if null, returns null
	      return root;
	    }

	    if (root.keyword.compareTo(keyword) < 0) {
	      root.left = deleteRecord(root.left, keyword);
	    } else if (root.keyword.compareTo(keyword) > 0) {
	      root.right = deleteRecord(root.right, keyword);

	    } else {

	      if (root.left == null) {
	        return root.right;
	      } else if (root.right == null) {
	        return root.left;
	      }

	      root.keyword = lowestNode(root.right);
	      root.right = deleteRecord(root.right, root.keyword);
	    }
	    return root;
	  }

	  //prints the function
   public void print() {
     int count = 0;
     int printWrap = 0;
     System.out.print("\n\n\n");
     for (int index=0; index<tableSize; index++) {
       if (hashTable[index] != null) {
         System.out.printf("index [%d]: %s (E ---> int): %d\n", index, hashTable[index].keyword, convertStringToInt(hashTable[index].keyword));
         Record rec = hashTable[index].head;
         //System.out.printf("%d|%s|%s\n ---> ", rec.id, rec.author, rec.title);
         System.out.print("\t\t");
         while(rec != null) {
           if (++printWrap%3 == 0) {
             System.out.println();
             System.out.print("\t\t");
           }
           //System.out.printf("\t%s\n",r.title);
           System.out.printf("%d|%s|%s ---> ", rec.id, rec.author, rec.title);
           rec = rec.next;
           //printWrap++;
         }
         System.out.println("null\n");
         printWrap = 0;

       }
     }
   }
}