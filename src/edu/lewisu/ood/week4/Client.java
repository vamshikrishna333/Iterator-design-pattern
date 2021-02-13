package edu.lewisu.ood.week4;

import java.nio.file.ReadOnlyFileSystemException;

public class Client {

	public static void main(String[] args) {
		
		
		System.out.println("*** Get animals through Iterator ***");
		IContainer iContainer = new AnimalContainer();
		IIterator iIterator = iContainer.createIterator();
		while (iIterator.hasNext()) {
			Object object = iIterator.next();
			System.out.println(object);
		}
		System.out.println("*** Get flowers through Iterator ***");
		IContainer iContainer2 = new FlowerContainer();
		IIterator iIterator2 = iContainer2.createIterator();
		while (iIterator2.hasNext()) {
			Object object = iIterator2.next();
			System.out.println(object);
		
	}

}
	
}
