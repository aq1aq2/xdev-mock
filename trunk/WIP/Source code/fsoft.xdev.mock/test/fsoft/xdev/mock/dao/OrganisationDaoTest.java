package fsoft.xdev.mock.dao;

import static org.mockito.Mockito.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.mockito.*;

import fsoft.xdev.mock.dao.imp.OrganisationDao;
import fsoft.xdev.mock.models.Organisation;

public class OrganisationDaoTest{
	
	@Mock
	private IOrganisationDao mockingOrganisationDao;

	@Before
	public void setUp() throws Exception {
		mockingOrganisationDao = mock(OrganisationDao.class);
	}

	@After
	public void tearDown() throws Exception {
		mockingOrganisationDao = null;
	}

	@Test
	public void testAdd_ExpectionTrue() {
		Organisation org = new Organisation(25);
		mockingOrganisationDao.add(org);
		verify(mockingOrganisationDao).add(org);
	}

	@Test
	public void testEdit_ExpectionTrue() {
		Organisation org = new Organisation(1);
		mockingOrganisationDao.edit(org);
		verify(mockingOrganisationDao).edit(org);
	}
	
	@Test 	
	public void testFindRange_All_Active_ExpectionNotEmptyList() {
		int from = 0;
		int to = 10;
		String filterKey = "All";
		boolean filterActive = true;
		mockingOrganisationDao.findRange(from, to, filterKey, filterActive);
		verify(mockingOrganisationDao).findRange(from, to, filterKey, filterActive);
	}
	
	@Test 
	public void testFindRange_09_Active_ExpectionNotEmptyList() {
		int from = 0;
		int to = 10;
		String filterKey = "0-9";
		boolean filterActive = true;
		mockingOrganisationDao.findRange(from, to, filterKey, filterActive);
		verify(mockingOrganisationDao).findRange(from, to, filterKey, filterActive);
	}
	
	@Test 	
	public void testFindRange_ABCDE_Active_ExpectionNotEmptyList() {
		int from = 0;
		int to = 10;
		String filterKey = "A B C D E";
		boolean filterActive = true;
		mockingOrganisationDao.findRange(from, to, filterKey, filterActive);
		verify(mockingOrganisationDao).findRange(from, to, filterKey, filterActive);
	}
	
	@Test 
	public void testFindRange_FGHIJ_Active_ExpectionNotEmptyList() {
		int from = 0;
		int to = 10;
		String filterKey = "F G H I J";
		boolean filterActive = true;
		mockingOrganisationDao.findRange(from, to, filterKey, filterActive);
		verify(mockingOrganisationDao).findRange(from, to, filterKey, filterActive);
	}
	
	@Test 	
	public void testFindRange_KLMN_Active_ExpectionNotEmptyList() {
		int from = 0;
		int to = 10;
		String filterKey = "K L M N";
		boolean filterActive = true;
		mockingOrganisationDao.findRange(from, to, filterKey, filterActive);
		verify(mockingOrganisationDao).findRange(from, to, filterKey, filterActive);
	}
	
	@Test 
	public void testFindRange_OPQR_Active_ExpectionNotEmptyList() {
		int from = 0;
		int to = 10;
		String filterKey = "O P Q R";
		boolean filterActive = true;
		mockingOrganisationDao.findRange(from, to, filterKey, filterActive);
		verify(mockingOrganisationDao).findRange(from, to, filterKey, filterActive);
	}
	
	@Test 
	public void testFindRange_STUV_Active_ExpectionNotEmptyList() {
		int from = 0;
		int to = 10;
		String filterKey = "S T U V";
		boolean filterActive = true;
		mockingOrganisationDao.findRange(from, to, filterKey, filterActive);
		verify(mockingOrganisationDao).findRange(from, to, filterKey, filterActive);
	}
	
	@Test 
	public void testFindRange_WXYZ_Active_ExpectionNotEmptyList() {
		int from = 0;
		int to = 10;
		String filterKey = "W X Y Z";
		boolean filterActive = true;
		mockingOrganisationDao.findRange(from, to, filterKey, filterActive);
		verify(mockingOrganisationDao).findRange(from, to, filterKey, filterActive);
	}

	@Test 	
	public void testFindRange_All_InActive_ExpectionNotEmptyList() {
		int from = 0;
		int to = 10;
		String filterKey = "All";
		boolean filterActive = false;
		mockingOrganisationDao.findRange(from, to, filterKey, filterActive);
		verify(mockingOrganisationDao).findRange(from, to, filterKey, filterActive);
	}
	
	@Test 
	public void testFindRange_09_InActive_ExpectionNotEmptyList() {
		int from = 0;
		int to = 10;
		String filterKey = "0-9";
		boolean filterActive = false;
		mockingOrganisationDao.findRange(from, to, filterKey, filterActive);
		verify(mockingOrganisationDao).findRange(from, to, filterKey, filterActive);
	}
	
	@Test 	
	public void testFindRange_ABCDE_InActive_ExpectionNotEmptyList() {
		int from = 0;
		int to = 10;
		String filterKey = "A B C D E";
		boolean filterActive = false;
		mockingOrganisationDao.findRange(from, to, filterKey, filterActive);
		verify(mockingOrganisationDao).findRange(from, to, filterKey, filterActive);
	}
	
	@Test 
	public void testFindRange_FGHIJ_InActive_ExpectionNotEmptyList() {
		int from = 0;
		int to = 10;
		String filterKey = "F G H I J";
		boolean filterActive = false;
		mockingOrganisationDao.findRange(from, to, filterKey, filterActive);
		verify(mockingOrganisationDao).findRange(from, to, filterKey, filterActive);
	}
	
	@Test 	
	public void testFindRange_KLMN_InActive_ExpectionNotEmptyList() {
		int from = 0;
		int to = 10;
		String filterKey = "K L M N";
		boolean filterActive = false;
		mockingOrganisationDao.findRange(from, to, filterKey, filterActive);
		verify(mockingOrganisationDao).findRange(from, to, filterKey, filterActive);
	}
	
	@Test 
	public void testFindRange_OPQR_InActive_ExpectionNotEmptyList() {
		int from = 0;
		int to = 10;
		String filterKey = "O P Q R";
		boolean filterActive = false;
		mockingOrganisationDao.findRange(from, to, filterKey, filterActive);
		verify(mockingOrganisationDao).findRange(from, to, filterKey, filterActive);
	}
	
	@Test 
	public void testFindRange_STUV_InActive_ExpectionNotEmptyList() {
		int from = 0;
		int to = 10;
		String filterKey = "S T U V";
		boolean filterActive = false;
		mockingOrganisationDao.findRange(from, to, filterKey, filterActive);
		verify(mockingOrganisationDao).findRange(from, to, filterKey, filterActive);
	}
	
	@Test 
	public void testFindRange_WXYZ_InActive_ExpectionNotEmptyList() {
		int from = 0;
		int to = 10;
		String filterKey = "W X Y Z";
		boolean filterActive = false;
		mockingOrganisationDao.findRange(from, to, filterKey, filterActive);
		verify(mockingOrganisationDao).findRange(from, to, filterKey, filterActive);
	}

	
	@Test
	public void testCount_All_InActive_ExpectionNotZeroItems() {
		String filterKey = "All";
		boolean filterActive = false;
		mockingOrganisationDao.count(filterKey, filterActive);
		verify(mockingOrganisationDao).count(filterKey, filterActive);
	}
	
	@Test
	public void testCount_09_InActive_ExpectionNotZeroItems() {
		String filterKey = "0-9";
		boolean filterActive = false;
		mockingOrganisationDao.count(filterKey, filterActive);
		verify(mockingOrganisationDao).count(filterKey, filterActive);
	}
	
	@Test
	public void testCount_ABCDE_InActive_ExpectionNotZeroItems() {
		String filterKey = "A B C D E";
		boolean filterActive = false;
		mockingOrganisationDao.count(filterKey, filterActive);
		verify(mockingOrganisationDao).count(filterKey, filterActive);
	}
	
	@Test
	public void testCount_FGHIJ_InActive_ExpectionNotZeroItems() {
		String filterKey = "F G H I J";
		boolean filterActive = false;
		mockingOrganisationDao.count(filterKey, filterActive);
		verify(mockingOrganisationDao).count(filterKey, filterActive);
	}
	
	@Test
	public void testCount_KLMN_InActive_ExpectionNotZeroItems() {
		String filterKey = "K L M N";
		boolean filterActive = false;
		mockingOrganisationDao.count(filterKey, filterActive);
		verify(mockingOrganisationDao).count(filterKey, filterActive);
	}
	
	@Test
	public void testCount_OPQR_InActive_ExpectionNotZeroItems() {
		String filterKey = "O P Q R";
		boolean filterActive = false;
		mockingOrganisationDao.count(filterKey, filterActive);
		verify(mockingOrganisationDao).count(filterKey, filterActive);
	}
	
	@Test
	public void testCount_STUV_InActive_ExpectionNotZeroItems() {
		String filterKey = "S T U V";
		boolean filterActive = false;
		mockingOrganisationDao.count(filterKey, filterActive);
		verify(mockingOrganisationDao).count(filterKey, filterActive);
	}
	
	@Test
	public void testCount_WXYZ_InActive_ExpectionNotZeroItems() {
		String filterKey = "W X Y Z";
		boolean filterActive = false;
		mockingOrganisationDao.count(filterKey, filterActive);
		verify(mockingOrganisationDao).count(filterKey, filterActive);
	}
	
	@Test
	public void testCount_All_Active_ExpectionNotZeroItems() {
		String filterKey = "All";
		boolean filterActive = true;
		mockingOrganisationDao.count(filterKey, filterActive);
		verify(mockingOrganisationDao).count(filterKey, filterActive);
	}
	
	@Test
	public void testCount_09_Active_ExpectionNotZeroItems() {
		String filterKey = "0-9";
		boolean filterActive = true;
		mockingOrganisationDao.count(filterKey, filterActive);
		verify(mockingOrganisationDao).count(filterKey, filterActive);
	}
	
	@Test
	public void testCount_ABCDE_Active_ExpectionNotZeroItems() {
		String filterKey = "A B C D E";
		boolean filterActive = true;
		mockingOrganisationDao.count(filterKey, filterActive);
		verify(mockingOrganisationDao).count(filterKey, filterActive);
	}
	
	@Test
	public void testCount_FGHIJ_Active_ExpectionNotZeroItems() {
		String filterKey = "F G H I J";
		boolean filterActive = true;
		mockingOrganisationDao.count(filterKey, filterActive);
		verify(mockingOrganisationDao).count(filterKey, filterActive);
	}
	
	@Test
	public void testCount_KLMN_Active_ExpectionNotZeroItems() {
		String filterKey = "K L M N";
		boolean filterActive = true;
		mockingOrganisationDao.count(filterKey, filterActive);
		verify(mockingOrganisationDao).count(filterKey, filterActive);
	}
	
	@Test
	public void testCount_OPQR_Active_ExpectionNotZeroItems() {
		String filterKey = "O P Q R";
		boolean filterActive = true;
		mockingOrganisationDao.count(filterKey, filterActive);
		verify(mockingOrganisationDao).count(filterKey, filterActive);
	}
	
	@Test
	public void testCount_STUV_Active_ExpectionNotZeroItems() {
		String filterKey = "S T U V";
		boolean filterActive = true;
		mockingOrganisationDao.count(filterKey, filterActive);
		verify(mockingOrganisationDao).count(filterKey, filterActive);
	}
	
	@Test
	public void testCount_WXYZ_Active_ExpectionNotZeroItems() {
		String filterKey = "W X Y Z";
		boolean filterActive = true;
		mockingOrganisationDao.count(filterKey, filterActive);
		verify(mockingOrganisationDao).count(filterKey, filterActive);
	}
}
