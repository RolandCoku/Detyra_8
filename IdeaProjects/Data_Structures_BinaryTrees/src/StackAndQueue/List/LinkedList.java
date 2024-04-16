package StackAndQueue.List;

public class LinkedList <T extends Comparable<T>> {
    private ListNode<T> header;
    public LinkedList(){
        this.header = new ListNode<T>(null);
    }

    public boolean isEmpty(){
        return header.next == null;
    }
    public void makeEmpty(){
        this.header = null;
    }
    public ListNode<T> getHeader(){
        return this.header;
    }
    public LinkedListIterator<T> zeroth(){
        return new LinkedListIterator<T>(header);
    }
    public LinkedListIterator<T> zerothCircular(){
        return new LinkedListIterator<T>(header,header);
    }
    public LinkedListIterator<T> first(){
        return new LinkedListIterator<T>(header.next);
    }
    public LinkedListIterator<T> firstCircular(){
        return new LinkedListIterator<T>(header.next,this.header);
    }
    public LinkedListIterator<T> find (T x){
        ListNode<T> currentNode = header.next;
        while ((currentNode.next != null)&&(!currentNode.element.equals(x))){
            currentNode = currentNode.next;
        }
        if(currentNode.element.equals(x)){
            return new LinkedListIterator<T>(currentNode);
        }else
            return null;
    }
    public LinkedListIterator<T> findPrevious(T x){
        ListNode<T> currentNode = header;
        while ((currentNode.next != null)&&(!currentNode.next.element.equals(x))){
            currentNode = currentNode.next;
        }
        if((currentNode.next != null) && (currentNode.next.element.equals(x))){
            return new LinkedListIterator<T>(currentNode);
        }else
            return null;
    }

    public static <T extends Comparable<T>> void printList(LinkedList<T> list){
        if(list.header.next == null){
            System.out.println("Empty list!");
        }else {
            System.out.print("[ ");
            for (LinkedListIterator<T> iterator = list.first(); iterator.isValid(); iterator.advance()){
                System.out.print(iterator.retrive()+" ");
            }
            System.out.println("]");
        }
    }
    public static <T extends Comparable<T>> void printCircularList(LinkedList<T> list){
        if(list.isEmpty()){
            System.out.println("Empty list");
        }else {
            System.out.print("[ ");
            for (LinkedListIterator<T> iterator = list.firstCircular(); iterator.isValidCircular(); iterator.advanceCircular()){
                System.out.print(iterator.retrive()+" ");
            }
            System.out.println("]");
        }
    }
    public void insert(T newData, LinkedListIterator<T> positionIterator){
        if((positionIterator != null)&&(positionIterator.current != null)){
            positionIterator.current.next = new ListNode<T>(newData,positionIterator.current.next);
        }
    }

    public void remove(T dataToDelete){
        LinkedListIterator<T> iterator = this.findPrevious(dataToDelete);
        if(iterator != null){
            iterator.current.next = iterator.current.next.next;
        }
    }

    public LinkedListIterator<T> last(){
        if(this.isEmpty()){
            return null;
        }
        LinkedListIterator<T> iterator = this.first();
        while (iterator.nextIsValid()){
            iterator.advance();
        }
        return iterator;
    }

    public LinkedListIterator<T> lastCircular(){
        if(this.isEmpty()){
            return null;
        }
        LinkedListIterator<T> iterator = this.firstCircular();
        while (!iterator.current.next.equals(header)){
            iterator.advance();
        }
        return iterator;
    }

//**********************************************************************************************************************
//EXERCISES
//1. Ndertoni nje funksion qe kthen shumen e elementeve ne nje liste te lidhur njedrejtimore.
    public static int findSum(LinkedList<Integer> list){
        int sum = 0;
        for (LinkedListIterator<Integer> iterator = list.first(); iterator.isValid(); iterator.advance()){
            sum += iterator.current.element;
        }
        return sum;
    }

//2. Ndertoni nje funksion qe llogarit dhe kthen gjatesine e nje liste te lidhur njedrejtimore.
    public int getSize(){
        int size = 0;
        for (LinkedListIterator<T> iterator = this.first(); iterator.isValid(); iterator.advance()){
            size++;
        }
        return size;
    }
    public int getSizeCircuar(){
        int size = 0;
        for(LinkedListIterator<T> iterator = this.firstCircular(); iterator.isValidCircular(); iterator.advanceCircular()){
            size++;
        }
        return size;
    }

//3. Ndertoni nje funksion qe merr nje numer te plote k dhe kthen vleren e nyjes se k-te te nje liste te lidhur njedrejtimore nqs ajo eksiston.
     public T getNodeElement(int k){
        int i = 0;
        LinkedListIterator<T> iterator = this.first();
        while (i<k){
            iterator.advance();
            i++;
        }
        if(i==k && iterator.isValid()){
            return iterator.current.element;
        }else {
            return null;
        }
     }

//4. Nje funksion duhet te gjeje dhe te fshije nyjen me vlere k nga nje liste.
//   (Provoni ta zgjidhni pa perdorur iterator, vetëm duke kaluar nga një nyje në tjetrën)
    public void delete(T k){
        ListNode<T> currentNode = header;
        while ((currentNode.next != null)&&(!currentNode.next.element.equals(k))){
            currentNode = currentNode.next;
        }
        if((currentNode.next != null)&&(currentNode.next.element.equals(k))){
            currentNode.next = currentNode.next.next;
        }else{
            System.out.println("Element not found!");
        }
    }

//5. Ndertoni nje funksion qe shton ne nje liste te lidhur njedrejtimore nje nyje me vlere k ne pozicionin e j-te ne liste.
//   (j eshte numer i plote).
    public void insert(T k, int j){
        int i = 0;
        LinkedListIterator<T> iterator = this.zeroth();
        while ((i<j)){
            iterator.advance();
            i++;
        }
        if((i==j)&&(iterator.isValid())){
            this.insert(k,iterator);
        }else {
            System.out.println("Invalid position!");
        }
    }

//6. Ndertoni nje funksion qe merr dy pozicione ne nje liste te lidhur njedrejtimore dhe kthen numrin e elementeve midis tyre.
    public int countNodesBetween(int i, int j){
        int index = 0;
        int nodesBetween = 0;
        LinkedListIterator<T> iterator = this.first();
        while ((index<=i)&&(iterator.isValid())){
            iterator.advance();
            index++;
        }
        while ((index<j)&&(iterator.isValid())){
            iterator.advance();
            nodesBetween++;
            index++;
        }
        return nodesBetween;
    }

    public int countNodesBetween(LinkedListIterator<T> position1, LinkedListIterator<T> position2){
        int nodesBetween = 0;
        position1.advance(); //Start counting after the given position;
        while (!position1.current.equals(position2.current)){
            nodesBetween++;
            position1.advance();
        }
        return nodesBetween;
    }
//7. Ndertoni nje funksion qe zhvendos maksimumin ne fillim te listes dhe minimumin ne fund te listes se lidhur njedrejtimore.
    public void moveMaxMin(){
        LinkedListIterator<T> iterator = this.first();
        LinkedListIterator<T> maxIterator = this.first();
        LinkedListIterator<T> minIterator = this.first();

        while (iterator.nextIsValid()){
            if(iterator.current.element.compareTo(maxIterator.current.element) > 0){
                maxIterator = new LinkedListIterator<T>(iterator.current);
            }
            if(iterator.current.element.compareTo(minIterator.current.element) < 0){
                minIterator = new LinkedListIterator<T>(iterator.current);
            }
            iterator.advance();
        }
        T max = maxIterator.current.element;
        T min = minIterator.current.element;
        this.delete(max);
        this.insert(max,0);
        this.delete(min);
        this.insert(min,this.getSize());
    }

//8. Ndertoni nje funksion qe fshin nga lista e lidhur njedrejtimore L te gjithe elementet qe ndodhen ne nje liste te dyte njedrejtimore P.
//a. Lista L dhe lista P jane te parenditura
//b. Lista L dhe lista P jane te renditura ne rend rrites.

    public void deleteAll(LinkedList<T> listToDelete){
        for (LinkedListIterator<T> iterator = listToDelete.first(); iterator.isValid(); iterator.advance()){
            this.remove(iterator.current.element);
        }
    }

    public void deleteAllSorted(LinkedList<T> listToDelete){
        if(this.getSize()<listToDelete.getSize()){
            System.out.println("This list doesn't contain the list you want to delete!");
            return;
        }
        LinkedListIterator<T> listIterator = this.first();
        LinkedListIterator<T> listToDeleteIterator = listToDelete.first();
        while (listIterator.isValid()&&listToDeleteIterator.isValid()){
            if (listIterator.current.element.equals(listToDeleteIterator.current.element)){
                this.remove(listToDeleteIterator.current.element);
                listIterator.advance();
                listToDeleteIterator.advance();
            }else if (listIterator.current.element.compareTo(listToDeleteIterator.current.element)<0){
                listIterator.advance();
            } else
                listToDeleteIterator.advance();
        }
    }

//9. Ndertoni nje funksion qe kthen mbrapsht nje liste te lidhur njedrejtimore pa perdorur liste te re. Lista eshte:
//a. njedrejtimore.
//c. njedrejtimore rrethore
    public void reverseLinkedList(){
        ListNode<T> currentNode = header.next;
        ListNode<T> nextNode;
        ListNode<T> previousNode = null;

        while (currentNode != null){
            nextNode = currentNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = nextNode;
        }
        header.next = previousNode;
    }

    public void reverseCircularLinkedList(){
        ListNode<T> currentNode = header.next;
        ListNode<T> nextNode;
        ListNode<T> previousNode = header;

        while (currentNode != header){
            nextNode = currentNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = nextNode;
        }
        header.next = previousNode;
    }

//10. Ndertoni nje funksion qe kthen true nqs nje liste e lidhur eshte palindrome dhe false ne te kundert. Lista eshte:
//a. njedrejtimore.
//c. njedrejtimore rrethore
    public boolean isPalindrome(){
        LinkedList<T> reversedlist = new LinkedList<T>();
        for (LinkedListIterator<T> iterator = this.first(); iterator.isValid(); iterator.advance()){
            reversedlist.insert(iterator.current.element,reversedlist.zeroth());
        }
        int middle = this.getSize()/2;
        LinkedListIterator<T> listIterator = this.first();
        LinkedListIterator<T> reverseIterator = reversedlist.first();
        int index = 0;
        while (index < middle){
            if(!listIterator.current.element.equals(reverseIterator.current.element)){
                return false;
            }
            listIterator.advance();
            reverseIterator.advance();
            index++;
        }
        return true;
    }

    public boolean isPalidromeCircular(){
        LinkedList<T> reversedList = new LinkedList<T>();
        for (LinkedListIterator<T> iterator = this.firstCircular(); iterator.isValidCircular(); iterator.advanceCircular()){
            reversedList.insert(iterator.retriveCircular(),reversedList.zerothCircular());
        }
        reversedList.makeCircular();
        LinkedListIterator<T> listIterator = this.firstCircular();
        LinkedListIterator<T> reversedListIterator = reversedList.firstCircular();
        int middle = this.getSizeCircuar()/2;
        int index = 0;
        while (index<middle){
            if(!listIterator.current.element.equals(reversedListIterator.current.element)){
                return false;
            }
            listIterator.advanceCircular();
            reversedListIterator.advanceCircular();
            index++;
        }
        return true;
    }
//11. Ndertoni nje funksion qe shton nje element ne nje liste te lidhur te renditur pa prishur renditjen. Lista eshte:
//a. njedrejtimore.
//c. njedrejtimore rrethore
    public void insertSorted (T element){
        LinkedListIterator<T> iterator = this.zeroth();
        while (iterator.current != null && iterator.current.next != null){
            iterator.advance();
            if(iterator.current.element.compareTo(element) < 0 && iterator.nextIsValid())//?????
                iterator.advance();
        }
        this.insert(element,iterator);
    }

    public void insertSortedCircular(T element){
        LinkedListIterator<T> iterator = this.firstCircular();
        while (!iterator.current.next.equals(this.header) && iterator.current.element.compareTo(element) < 0){
            iterator.advanceCircular();
        }
        this.insert(element,iterator);
    }

//12. Shkruani funksionin qe nderron vendet e dy elementeve fqinje ne liste. Lista eshte:
//a. e lidhur nje drejtimore
    public void swapNeighbors(){
        LinkedListIterator<T> iterator = this.zeroth();

        while (iterator.nextIsValid() && iterator.current.next.next != null){

            ListNode<T> tempNode1 = iterator.current.next;
            ListNode<T> tempNode2 = tempNode1.next;

            tempNode1.next = tempNode2.next;
            tempNode2.next = tempNode1;
            iterator.current.next = tempNode2;

            iterator.advance();
            iterator.advance();
        }
    }

//13. Ndertoni nje funksion qe konverton nje liste te lidhur njedrejtimore ne nje liste te lidhur njedrejtimore rrethore.
    public void makeCircular(){
        if(this.isEmpty()){
            return;
        }
        this.last().current.next = header;
    }


//**********************************************************************************************************************
//LAB-1

    //Grupi - C
    public static <T extends Comparable<T>> void mergeListsAlternatively(LinkedList<T> L1, LinkedList<T> L2){
        if (L1.isEmpty() || L2.isEmpty()){
            System.out.println("Cannot merge empty lists");
            return;
        }
        LinkedListIterator<T> iterator1 = L1.first();
        LinkedListIterator<T> iterator2 = L2.first();
        LinkedList<T> mergedList = new LinkedList<T>();
        while (iterator1.isValid() && iterator2.isValid()){
            mergedList.insert(iterator1.current.element, mergedList.zeroth());
            mergedList.insert(iterator2.current.element, mergedList.zeroth());
            iterator1.advance();
            iterator2.advance();
        }
        while (iterator1.isValid()){
            mergedList.insert(iterator1.current.element, mergedList.zeroth());
            iterator1.advance();
        }
        while (iterator2.isValid()){
            mergedList.insert(iterator2.current.element, mergedList.zeroth());
            iterator2.advance();
        }
        mergedList.reverseLinkedList();
        printList(mergedList);
    }

    //Grupi - D
    public void deleteDublicates() {
        for (LinkedListIterator<T> iterator1 = this.first(); iterator1.isValid(); iterator1.advance()) {
            ListNode<T> temp = iterator1.current;
            boolean flag = false;
            for (LinkedListIterator<T> iterator2 = new LinkedListIterator<T>(iterator1.current.next); iterator2.isValid(); iterator2.advance()) {
                if (temp.element.equals(iterator2.current.element)) {
                    this.remove(temp.element);
                    flag = true;
                }
            }
            if (flag) {
                this.remove(temp.element);
            }
        }
    }

    //Grupi - A
//Një funksionin që bashkon dy lista të renditura të lidhura një-drejtimore pa prishur renditjen e tyre.
//Zgjidheni këtë problem duke krijuar një listë të re në të cilën do të ruhet bashkimi i dy listave të para.

    public void insertAtEnd(T element){
        LinkedListIterator<T> iterator = this.zeroth();
        while (iterator.nextIsValid()){
            iterator.advance();
        }
        this.insert(element,iterator);
    }

    public LinkedList<T> mergeSorted(LinkedList<T> list){
        LinkedList<T> mergedList = new LinkedList<T>();
        LinkedListIterator<T> listIterator = list.first();
        LinkedListIterator<T> thisIterator = this.first();

        while (listIterator.isValid() && thisIterator.isValid()){
            if(thisIterator.current.element.compareTo(listIterator.current.element)<0){
                mergedList.insertAtEnd(thisIterator.current.element);
                thisIterator.advance();
            } else{
                mergedList.insertAtEnd(listIterator.current.element);
                listIterator.advance();
            }

        }

        while (listIterator.isValid()){
            mergedList.insertAtEnd(listIterator.current.element);
            listIterator.advance();
        }

        while (thisIterator.isValid()){
            mergedList.insertAtEnd(thisIterator.current.element);
            thisIterator.advance();
        }
        return mergedList;
    }

    //Grupi - B
//Ndërtoni një funksion që ndan një listë të lidhur njëdrejtimore L1 cfarëdo, në dy lista:
//L2 mban elementet cift të renditur në rend rritës dhe L3 mban elementet tek të renditur në rend rritës

    public void splitAndSort(){
        if(this.isEmpty()){
            System.out.println("Empty List!");
        }

        LinkedList<T> list1 = new LinkedList<T>();
        LinkedList<T> list2 = new LinkedList<T>();

        LinkedListIterator<T> thisIterator = this.first();

        while (thisIterator.isValid()){
            list1.insertSorted(thisIterator.current.element);
            thisIterator.advance();
            list2.insertSorted(thisIterator.current.element);
            thisIterator.advance();
        }
        System.out.println("List 1: ");
        printList(list1);
        System.out.println("List 2: ");
        printList(list2);
    }

}

