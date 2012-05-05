package fsoft.xdev.mock.dao;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import fsoft.xdev.mock.dao.imp.TypeOfBusinessDao;
import fsoft.xdev.mock.models.TypeOfBusiness;

public class TypeOfBusinessDaoTest{
	
	@Mock
	private ITypeOfBusinessDao mockingDao;

	@Before
	public void setUp() throws Exception {
		mockingDao = mock(TypeOfBusinessDao.class);
	}

	@After
	public void tearDown() throws Exception {
		mockingDao = null;
	}

	@Test
	public void testAdd_ExpectionTrue() {
		TypeOfBusiness org = new TypeOfBusiness();
		mockingDao.add(org);
		verify(mockingDao).add(org);
	}

	@Test
	public void testEdit_ExpectionTrue() {
		TypeOfBusiness org = new TypeOfBusiness(1);
		mockingDao.add(org);
		verify(mockingDao).add(org);
	}

	@Test
	public void testAddOrUpdate_Add_ExpectionTrue() {
		TypeOfBusiness org = new TypeOfBusiness();
		mockingDao.add(org);
		verify(mockingDao).add(org);
	}
	
	@Test
	public void testAddOrUpdate_Update_ExpectionTrue() {
		TypeOfBusiness org = new TypeOfBusiness(1);
		mockingDao.add(org);
		verify(mockingDao).add(org);
	}
	
	@Test 	
	public void testSearch_All_Active_ExpectionNotEmptyList() {
		int from = 1;
		int to = 10;
		String filterBusinessName = "";
		String filterSicCode = "";
		mockingDao.search(from, to, filterBusinessName, filterSicCode);
		verify(mockingDao).search(from, to, filterBusinessName, filterSicCode);
	}

	@Test 	
	public void testSearch_All_ExpectionNotEmptyList() {
		int from = 1;
		int to = 10;
		String filterBusinessName = "";
		String filterSicCode = "";
		mockingDao.search(from, to, filterBusinessName, filterSicCode);
		verify(mockingDao).search(from, to, filterBusinessName, filterSicCode);
	}

	@Test 	
	public void testSearch_FirstName_ExpectionNotEmptyList() {
		int from = 1;
		int to = 10;
		String filterBusinessName = "";
		String filterSicCode = "";
		mockingDao.search(from, to, filterBusinessName, filterSicCode);
		verify(mockingDao).search(from, to, filterBusinessName, filterSicCode);
	}	

	@Test 	
	public void testSearch_Surname_ExpectionNotEmptyList() {
		int from = 1;
		int to = 10;
		String filterBusinessName = "";
		String filterSicCode = "";
		mockingDao.search(from, to, filterBusinessName, filterSicCode);
		verify(mockingDao).search(from, to, filterBusinessName, filterSicCode);
	}

	@Test 	
	public void testSearch_FirstName_Surname_ExpectionNotEmptyList() {
		int from = 1;
		int to = 10;
		String filterBusinessName = "";
		String filterSicCode = "";
		mockingDao.search(from, to, filterBusinessName, filterSicCode);
		verify(mockingDao).search(from, to, filterBusinessName, filterSicCode);
	}	

	@Test 	
	public void testCount_All_Active_ExpectionNotEmptyList() {
		String filterBusinessName = "";
		String filterSicCode = "";
		mockingDao.count(filterBusinessName, filterSicCode);
		verify(mockingDao).count(filterBusinessName, filterSicCode);
	}

	@Test 	
	public void testCount_All_ExpectionNotEmptyList() {
		String filterBusinessName = "";
		String filterSicCode = "";
		mockingDao.count(filterBusinessName, filterSicCode);
		verify(mockingDao).count(filterBusinessName, filterSicCode);
	}

	@Test 	
	public void testCount_FirstName_ExpectionNotEmptyList() {
		String filterBusinessName = "";
		String filterSicCode = "";
		mockingDao.count(filterBusinessName, filterSicCode);
		verify(mockingDao).count(filterBusinessName, filterSicCode);
	}	

	@Test 	
	public void testCount_Surname_ExpectionNotEmptyList() {
		String filterBusinessName = "";
		String filterSicCode = "";
		mockingDao.count(filterBusinessName, filterSicCode);
		verify(mockingDao).count(filterBusinessName, filterSicCode);
	}

	@Test 	
	public void testCount_FirstName_Surname_ExpectionNotEmptyList() {
		String filterBusinessName = "";
		String filterSicCode = "";
		mockingDao.count(filterBusinessName, filterSicCode);
		verify(mockingDao).count(filterBusinessName, filterSicCode);
	}	
}
