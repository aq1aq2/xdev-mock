package fsoft.xdev.mock.dao;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import fsoft.xdev.mock.dao.imp.ContactDao;
import fsoft.xdev.mock.models.Contact;

public class ContactDaoTest{
	
	@Mock
	private IContactDao mockingDao;

	@Before
	public void setUp() throws Exception {
		mockingDao = mock(ContactDao.class);
	}

	@After
	public void tearDown() throws Exception {
		mockingDao = null;
	}

	@Test
	public void testAdd_ExpectionTrue() {
		Contact org = new Contact();
		mockingDao.add(org);
		verify(mockingDao).add(org);
	}

	@Test
	public void testEdit_ExpectionTrue() {
		Contact org = new Contact(1);
		mockingDao.add(org);
		verify(mockingDao).add(org);
	}

	@Test
	public void testAddOrUpdate_Add_ExpectionTrue() {
		Contact org = new Contact();
		mockingDao.add(org);
		verify(mockingDao).add(org);
	}
	
	@Test
	public void testAddOrUpdate_Update_ExpectionTrue() {
		Contact org = new Contact(1);
		mockingDao.add(org);
		verify(mockingDao).add(org);
	}
	
	@Test 	
	public void testSearch_All_Active_ExpectionNotEmptyList() {
		int from = 1;
		int to = 10;
		String filterFirstName = "";
		String filterSurname = "";
		boolean filterActive = false;
		mockingDao.search(from, to, filterFirstName, filterSurname, filterActive);
		verify(mockingDao).search(from, to, filterFirstName, filterSurname, filterActive);
	}

	@Test 	
	public void testSearch_All_ExpectionNotEmptyList() {
		int from = 1;
		int to = 10;
		String filterFirstName = "";
		String filterSurname = "";
		boolean filterActive = true;
		mockingDao.search(from, to, filterFirstName, filterSurname, filterActive);
		verify(mockingDao).search(from, to, filterFirstName, filterSurname, filterActive);
	}

	@Test 	
	public void testSearch_FirstName_ExpectionNotEmptyList() {
		int from = 1;
		int to = 10;
		String filterFirstName = "Nhan";
		String filterSurname = "";
		boolean filterActive = true;
		mockingDao.search(from, to, filterFirstName, filterSurname, filterActive);
		verify(mockingDao).search(from, to, filterFirstName, filterSurname, filterActive);
	}	

	@Test 	
	public void testSearch_Surname_ExpectionNotEmptyList() {
		int from = 1;
		int to = 10;
		String filterFirstName = "";
		String filterSurname = "Le Duc";
		boolean filterActive = true;
		mockingDao.search(from, to, filterFirstName, filterSurname, filterActive);
		verify(mockingDao).search(from, to, filterFirstName, filterSurname, filterActive);
	}

	@Test 	
	public void testSearch_FirstName_Surname_ExpectionNotEmptyList() {
		int from = 1;
		int to = 10;
		String filterFirstName = "Nhan";
		String filterSurname = "Le Duc";
		boolean filterActive = true;
		mockingDao.search(from, to, filterFirstName, filterSurname, filterActive);
		verify(mockingDao).search(from, to, filterFirstName, filterSurname, filterActive);
	}	

	@Test 	
	public void testCount_All_Active_ExpectionNotEmptyList() {
		String filterFirstName = "";
		String filterSurname = "";
		boolean filterActive = false;
		mockingDao.count(filterFirstName, filterSurname, filterActive);
		verify(mockingDao).count(filterFirstName, filterSurname, filterActive);
	}

	@Test 	
	public void testCount_All_ExpectionNotEmptyList() {
		String filterFirstName = "";
		String filterSurname = "";
		boolean filterActive = true;
		mockingDao.count(filterFirstName, filterSurname, filterActive);
		verify(mockingDao).count(filterFirstName, filterSurname, filterActive);
	}

	@Test 	
	public void testCount_FirstName_ExpectionNotEmptyList() {
		String filterFirstName = "Nhan";
		String filterSurname = "";
		boolean filterActive = true;
		mockingDao.count(filterFirstName, filterSurname, filterActive);
		verify(mockingDao).count(filterFirstName, filterSurname, filterActive);
	}	

	@Test 	
	public void testCount_Surname_ExpectionNotEmptyList() {
		String filterFirstName = "";
		String filterSurname = "Le Duc";
		boolean filterActive = true;
		mockingDao.count(filterFirstName, filterSurname, filterActive);
		verify(mockingDao).count(filterFirstName, filterSurname, filterActive);
	}

	@Test 	
	public void testCount_FirstName_Surname_ExpectionNotEmptyList() {
		String filterFirstName = "Nhan";
		String filterSurname = "Le Duc";
		boolean filterActive = true;
		mockingDao.count(filterFirstName, filterSurname, filterActive);
		verify(mockingDao).count(filterFirstName, filterSurname, filterActive);
	}	
}
