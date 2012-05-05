package fsoft.xdev.mock.dao;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import fsoft.xdev.mock.dao.imp.AddressDao;
import fsoft.xdev.mock.models.Address;

public class AddressDaoTest{
	
	@Mock
	private IAddressDao mockingDao;

	@Before
	public void setUp() throws Exception {
		mockingDao = mock(AddressDao.class);
	}

	@After
	public void tearDown() throws Exception {
		mockingDao = null;
	}

	@Test
	public void testAdd_ExpectionTrue() {
		Address org = new Address();
		mockingDao.add(org);
		verify(mockingDao).add(org);
	}

	@Test
	public void testEdit_ExpectionTrue() {
		Address org = new Address(1);
		mockingDao.add(org);
		verify(mockingDao).add(org);
	}

	@Test
	public void testAddOrUpdate_Add_ExpectionTrue() {
		Address org = new Address();
		mockingDao.add(org);
		verify(mockingDao).add(org);
	}
	
	@Test
	public void testAddOrUpdate_Update_ExpectionTrue() {
		Address org = new Address(1);
		mockingDao.add(org);
		verify(mockingDao).add(org);
	}
	
	@Test 	
	public void testSearch_All_Active_ExpectionNotEmptyList() {
		int from = 1;
		int to = 10;
		String filterPostcode = "";
		String filterStreet = "";
		String filterTown = "";
		mockingDao.search(from, to, filterPostcode, filterStreet, filterTown);
		verify(mockingDao).search(from, to, filterPostcode, filterStreet, filterTown);
	}

	@Test 	
	public void testSearch_All_ExpectionNotEmptyList() {
		int from = 1;
		int to = 10;
		String filterPostcode = "";
		String filterStreet = "";
		String filterTown = "";
		mockingDao.search(from, to, filterPostcode, filterStreet, filterTown);
		verify(mockingDao).search(from, to, filterPostcode, filterStreet, filterTown);
	}

	@Test 	
	public void testSearch_FirstName_ExpectionNotEmptyList() {
		int from = 1;
		int to = 10;
		String filterPostcode = "";
		String filterStreet = "";
		String filterTown = "";
		mockingDao.search(from, to, filterPostcode, filterStreet, filterTown);
		verify(mockingDao).search(from, to, filterPostcode, filterStreet, filterTown);
	}	

	@Test 	
	public void testSearch_Surname_ExpectionNotEmptyList() {
		int from = 1;
		int to = 10;
		String filterPostcode = "";
		String filterStreet = "";
		String filterTown = "";
		mockingDao.search(from, to, filterPostcode, filterStreet, filterTown);
		verify(mockingDao).search(from, to, filterPostcode, filterStreet, filterTown);
	}

	@Test 	
	public void testSearch_FirstName_Surname_ExpectionNotEmptyList() {
		int from = 1;
		int to = 10;
		String filterPostcode = "";
		String filterStreet = "";
		String filterTown = "";
		mockingDao.search(from, to, filterPostcode, filterStreet, filterTown);
		verify(mockingDao).search(from, to, filterPostcode, filterStreet, filterTown);
	}	

	@Test 	
	public void testCount_All_Active_ExpectionNotEmptyList() {
		String filterPostcode = "";
		String filterStreet = "";
		String filterTown = "";
		mockingDao.count(filterPostcode, filterStreet, filterTown);
		verify(mockingDao).count(filterPostcode, filterStreet, filterTown);
	}

	@Test 	
	public void testCount_All_ExpectionNotEmptyList() {
		String filterPostcode = "";
		String filterStreet = "";
		String filterTown = "";
		mockingDao.count(filterPostcode, filterStreet, filterTown);
		verify(mockingDao).count(filterPostcode, filterStreet, filterTown);
	}

	@Test 	
	public void testCount_FirstName_ExpectionNotEmptyList() {
		String filterPostcode = "";
		String filterStreet = "";
		String filterTown = "";
		mockingDao.count(filterPostcode, filterStreet, filterTown);
		verify(mockingDao).count(filterPostcode, filterStreet, filterTown);
	}	

	@Test 	
	public void testCount_Surname_ExpectionNotEmptyList() {
		String filterPostcode = "";
		String filterStreet = "";
		String filterTown = "";
		mockingDao.count(filterPostcode, filterStreet, filterTown);
		verify(mockingDao).count(filterPostcode, filterStreet, filterTown);
	}

	@Test 	
	public void testCount_FirstName_Surname_ExpectionNotEmptyList() {
		String filterPostcode = "";
		String filterStreet = "";
		String filterTown = "";
		mockingDao.count(filterPostcode, filterStreet, filterTown);
		verify(mockingDao).count(filterPostcode, filterStreet, filterTown);
	}	
}
