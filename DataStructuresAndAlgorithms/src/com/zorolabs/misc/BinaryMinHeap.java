package com.zorolabs.misc;

public class BinaryMinHeap {
	
	private int[] data;

    private int heapSize;

    public BinaryMinHeap(int size) {

          data = new int[size];
          heapSize = 0;

    }
   public int getMinimum() {
	   
          if (isEmpty())
        	  throw new HeapException("Heap is empty");
          else
        	  return data[0];

    }

    public boolean isEmpty() {

          return (heapSize == 0);

    }

    private int getLeftChildIndex(int nodeIndex) {

          return 2 * nodeIndex + 1;

    }

    private int getRightChildIndex(int nodeIndex) {

          return 2 * nodeIndex + 2;

    }

    private int getParentIndex(int nodeIndex) {

          return (nodeIndex - 1) / 2;

    }

    public class HeapException extends RuntimeException {

          public HeapException(String message) {

                super(message);

          }

    }
    
    public void insert(int value) {

        if (heapSize == data.length)

              throw new HeapException("Heap's underlying storage is overflow");

        else {

              heapSize++;

              data[heapSize - 1] = value;

              siftUp(heapSize - 1);

        }
        

  }  
    
    private void siftUp(int nodeIndex) {

        int parentIndex, tmp;

        if (nodeIndex != 0) {

              parentIndex = getParentIndex(nodeIndex);

              if (data[parentIndex] > data[nodeIndex]) {
            	  
            	  swap(parentIndex,nodeIndex);

                    siftUp(parentIndex);

              }

        }

  }
    
    public void removeMin() {

        if (isEmpty())

              throw new HeapException("Heap is empty");

        else {

              data[0] = data[heapSize - 1];

              heapSize--;

              if (heapSize > 0)

                    siftDown(0);

        }

  }


    
    private void siftDown(int nodeIndex) {

        int leftChildIndex, rightChildIndex, minIndex, tmp;

        leftChildIndex = getLeftChildIndex(nodeIndex);

        rightChildIndex = getRightChildIndex(nodeIndex);

        if (rightChildIndex >= heapSize) {

              if (leftChildIndex >= heapSize)

                    return;

              else

                    minIndex = leftChildIndex;

        } else {

              if (data[leftChildIndex] <= data[rightChildIndex])

                    minIndex = leftChildIndex;

              else

                    minIndex = rightChildIndex;

        }

        if (data[nodeIndex] > data[minIndex]) {

               swap(nodeIndex,minIndex);

              siftDown(minIndex);

        }
        


  }

      private void swap(int node1, int node2) {
    	  
    	  int tmp = data[node2];

          data[node2] = data[node1];

          data[node1] = tmp;

	}
    
    public static void main(String[] args){
    	
    	BinaryMinHeap bhm =  new BinaryMinHeap(30);
    	//1, 2, 4, 4, 5, 6, 9, 11, 12, 12, 17
    	bhm.insert(1);
    	bhm.insert(2);
    	bhm.insert(4);
    	bhm.insert(4);	
    	bhm.insert(5);
    	bhm.insert(6);
    	bhm.insert(9);
    	bhm.insert(11);
    	bhm.insert(12);
    	bhm.insert(12);
    	bhm.insert(17);
    	bhm.insert(14);
    	bhm.removeMin();
    	
    	
    	
    }

    
    

}
