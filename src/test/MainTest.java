package test;

import utils.DatabaseUtils;

public class MainTest {

	public static void main(String[] args) {
		DatabaseUtils db = new DatabaseUtils();
		
		db.connect();
	}

}
