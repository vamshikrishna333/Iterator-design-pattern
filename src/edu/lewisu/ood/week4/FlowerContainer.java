package edu.lewisu.ood.week4;

import java.util.ArrayList;
import java.util.List;

public class FlowerContainer implements IContainer {
	
	private List<String> flowerList = new ArrayList();
	
	public FlowerContainer() {
		flowerList.add("sun flower");
		flowerList.add("daffodil");
	}
	public IIterator createIterator() {
		FlowerIterator result = new FlowerIterator();
		return result;	
	}
	private class FlowerIterator implements IIterator {
		
		public boolean hasNext() {
			
			if (flowerList.size()> 0)
				return true;
			else
				return false;
		}
		public Object next() {
			if (this.hasNext()) {
				String flower = flowerList.get(0);
				flowerList.remove(0);
				return flower;	
			}	
			else
				return null;
		}
		
	}
}
