package test;

import test.Hibernate.dao.PersonDao;

public class DaoTest {
public static void main(String[] args) {
	PersonDao pd = new PersonDao();
	pd.add();
	System.out.println("add person");
	pd.get();
}
}
