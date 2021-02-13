package edu.lewisu.ood.week4;

class AnimalContainer implements IContainer {
	private String animals[]= {"dog","cow","lion","monkey"};
	
	public IIterator createIterator() {
		
		AnimalIterator result = new AnimalIterator();
		return result;
		
	}
	
	private class AnimalIterator implements IIterator {
		private int position;
		
		public boolean hasNext() {
		
			if (position < animals.length)
				return true;
			else
				return false;
		}
		public Object next() {
			if (this.hasNext())
				return animals[position++];
			else
				return null;
		}
	}
	

}
