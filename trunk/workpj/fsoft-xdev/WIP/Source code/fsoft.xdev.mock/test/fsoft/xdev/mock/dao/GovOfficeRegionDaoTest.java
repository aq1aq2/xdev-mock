package fsoft.xdev.mock.dao;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import fsoft.xdev.mock.dao.imp.GovOfficeRegionDao;
public class GovOfficeRegionDaoTest {
	@Mock
	private IGovOfficeRegionDao mockingGovOfficeRegionDao;
	@Before
	public void setUp() throws Exception {
		mockingGovOfficeRegionDao = mock(GovOfficeRegionDao.class);
		
	}

	@After
	public void tearDown() throws Exception {
		mockingGovOfficeRegionDao = null;
	}
	
	
	@Test 	
	public void testFindRange_All_Active_ExpectionNotEmptyList() {
		int from = 0;
		int to = 10;
		String filterKey = "All";
		boolean filterActive = true;
		mockingGovOfficeRegionDao.findRange(from, to, filterKey, filterActive);
		verify(mockingGovOfficeRegionDao).findRange(from, to, filterKey, filterActive);
	}
	
	@Test 
	public void testFindRange_09_Active_ExpectionNotEmptyList() {
		int from = 0;
		int to = 10;
		String filterKey = "0-9";
		boolean filterActive = true;
		mockingGovOfficeRegionDao.findRange(from, to, filterKey, filterActive);
		verify(mockingGovOfficeRegionDao).findRange(from, to, filterKey, filterActive);
	}
	
	@Test 	
	public void testFindRange_ABCDE_Active_ExpectionNotEmptyList() {
		int from = 0;
		int to = 10;
		String filterKey = "A B C D E";
		boolean filterActive = true;
		mockingGovOfficeRegionDao.findRange(from, to, filterKey, filterActive);
		verify(mockingGovOfficeRegionDao).findRange(from, to, filterKey, filterActive);
	}
	
	@Test 
	public void testFindRange_FGHIJ_Active_ExpectionNotEmptyList() {
		int from = 0;
		int to = 10;
		String filterKey = "F G H I J";
		boolean filterActive = true;
		mockingGovOfficeRegionDao.findRange(from, to, filterKey, filterActive);
		verify(mockingGovOfficeRegionDao).findRange(from, to, filterKey, filterActive);
	}
	
	@Test 	
	public void testFindRange_KLMN_Active_ExpectionNotEmptyList() {
		int from = 0;
		int to = 10;
		String filterKey = "K L M N";
		boolean filterActive = true;
		mockingGovOfficeRegionDao.findRange(from, to, filterKey, filterActive);
		verify(mockingGovOfficeRegionDao).findRange(from, to, filterKey, filterActive);
	}
	
	@Test 
	public void testFindRange_OPQR_Active_ExpectionNotEmptyList() {
		int from = 0;
		int to = 10;
		String filterKey = "O P Q R";
		boolean filterActive = true;
		mockingGovOfficeRegionDao.findRange(from, to, filterKey, filterActive);
		verify(mockingGovOfficeRegionDao).findRange(from, to, filterKey, filterActive);
	}
	
	@Test 
	public void testFindRange_STUV_Active_ExpectionNotEmptyList() {
		int from = 0;
		int to = 10;
		String filterKey = "S T U V";
		boolean filterActive = true;
		mockingGovOfficeRegionDao.findRange(from, to, filterKey, filterActive);
		verify(mockingGovOfficeRegionDao).findRange(from, to, filterKey, filterActive);
	}
	
	@Test 
	public void testFindRange_WXYZ_Active_ExpectionNotEmptyList() {
		int from = 0;
		int to = 10;
		String filterKey = "W X Y Z";
		boolean filterActive = true;
		mockingGovOfficeRegionDao.findRange(from, to, filterKey, filterActive);
		verify(mockingGovOfficeRegionDao).findRange(from, to, filterKey, filterActive);
	}

	@Test 	
	public void testFindRange_All_InActive_ExpectionNotEmptyList() {
		int from = 0;
		int to = 10;
		String filterKey = "All";
		boolean filterActive = false;
		mockingGovOfficeRegionDao.findRange(from, to, filterKey, filterActive);
		verify(mockingGovOfficeRegionDao).findRange(from, to, filterKey, filterActive);
	}
	
	@Test 
	public void testFindRange_09_InActive_ExpectionNotEmptyList() {
		int from = 0;
		int to = 10;
		String filterKey = "0-9";
		boolean filterActive = false;
		mockingGovOfficeRegionDao.findRange(from, to, filterKey, filterActive);
		verify(mockingGovOfficeRegionDao).findRange(from, to, filterKey, filterActive);
	}
	
	@Test 	
	public void testFindRange_ABCDE_InActive_ExpectionNotEmptyList() {
		int from = 0;
		int to = 10;
		String filterKey = "A B C D E";
		boolean filterActive = false;
		mockingGovOfficeRegionDao.findRange(from, to, filterKey, filterActive);
		verify(mockingGovOfficeRegionDao).findRange(from, to, filterKey, filterActive);
	}
	
	@Test 
	public void testFindRange_FGHIJ_InActive_ExpectionNotEmptyList() {
		int from = 0;
		int to = 10;
		String filterKey = "F G H I J";
		boolean filterActive = false;
		mockingGovOfficeRegionDao.findRange(from, to, filterKey, filterActive);
		verify(mockingGovOfficeRegionDao).findRange(from, to, filterKey, filterActive);
	}
	
	@Test 	
	public void testFindRange_KLMN_InActive_ExpectionNotEmptyList() {
		int from = 0;
		int to = 10;
		String filterKey = "K L M N";
		boolean filterActive = false;
		mockingGovOfficeRegionDao.findRange(from, to, filterKey, filterActive);
		verify(mockingGovOfficeRegionDao).findRange(from, to, filterKey, filterActive);
	}
	
	@Test 
	public void testFindRange_OPQR_InActive_ExpectionNotEmptyList() {
		int from = 0;
		int to = 10;
		String filterKey = "O P Q R";
		boolean filterActive = false;
		mockingGovOfficeRegionDao.findRange(from, to, filterKey, filterActive);
		verify(mockingGovOfficeRegionDao).findRange(from, to, filterKey, filterActive);
	}
	
	@Test 
	public void testFindRange_STUV_InActive_ExpectionNotEmptyList() {
		int from = 0;
		int to = 10;
		String filterKey = "S T U V";
		boolean filterActive = false;
		mockingGovOfficeRegionDao.findRange(from, to, filterKey, filterActive);
		verify(mockingGovOfficeRegionDao).findRange(from, to, filterKey, filterActive);
	}
	
	@Test 
	public void testFindRange_WXYZ_InActive_ExpectionNotEmptyList() {
		int from = 0;
		int to = 10;
		String filterKey = "W X Y Z";
		boolean filterActive = false;
		mockingGovOfficeRegionDao.findRange(from, to, filterKey, filterActive);
		verify(mockingGovOfficeRegionDao).findRange(from, to, filterKey, filterActive);
	}

	
	@Test
	public void testCount_All_InActive_ExpectionNotZeroItems() {
		String filterKey = "All";
		boolean filterActive = false;
		mockingGovOfficeRegionDao.count(filterKey, filterActive);
		verify(mockingGovOfficeRegionDao).count(filterKey, filterActive);
	}
	
	@Test
	public void testCount_09_InActive_ExpectionNotZeroItems() {
		String filterKey = "0-9";
		boolean filterActive = false;
		mockingGovOfficeRegionDao.count(filterKey, filterActive);
		verify(mockingGovOfficeRegionDao).count(filterKey, filterActive);
	}
	
	@Test
	public void testCount_ABCDE_InActive_ExpectionNotZeroItems() {
		String filterKey = "A B C D E";
		boolean filterActive = false;
		mockingGovOfficeRegionDao.count(filterKey, filterActive);
		verify(mockingGovOfficeRegionDao).count(filterKey, filterActive);
	}
	
	@Test
	public void testCount_FGHIJ_InActive_ExpectionNotZeroItems() {
		String filterKey = "F G H I J";
		boolean filterActive = false;
		mockingGovOfficeRegionDao.count(filterKey, filterActive);
		verify(mockingGovOfficeRegionDao).count(filterKey, filterActive);
	}
	
	@Test
	public void testCount_KLMN_InActive_ExpectionNotZeroItems() {
		String filterKey = "K L M N";
		boolean filterActive = false;
		mockingGovOfficeRegionDao.count(filterKey, filterActive);
		verify(mockingGovOfficeRegionDao).count(filterKey, filterActive);
	}
	
	@Test
	public void testCount_OPQR_InActive_ExpectionNotZeroItems() {
		String filterKey = "O P Q R";
		boolean filterActive = false;
		mockingGovOfficeRegionDao.count(filterKey, filterActive);
		verify(mockingGovOfficeRegionDao).count(filterKey, filterActive);
	}
	
	@Test
	public void testCount_STUV_InActive_ExpectionNotZeroItems() {
		String filterKey = "S T U V";
		boolean filterActive = false;
		mockingGovOfficeRegionDao.count(filterKey, filterActive);
		verify(mockingGovOfficeRegionDao).count(filterKey, filterActive);
	}
	
	@Test
	public void testCount_WXYZ_InActive_ExpectionNotZeroItems() {
		String filterKey = "W X Y Z";
		boolean filterActive = false;
		mockingGovOfficeRegionDao.count(filterKey, filterActive);
		verify(mockingGovOfficeRegionDao).count(filterKey, filterActive);
	}
	
	@Test
	public void testCount_All_Active_ExpectionNotZeroItems() {
		String filterKey = "All";
		boolean filterActive = true;
		mockingGovOfficeRegionDao.count(filterKey, filterActive);
		verify(mockingGovOfficeRegionDao).count(filterKey, filterActive);
	}
	
	@Test
	public void testCount_09_Active_ExpectionNotZeroItems() {
		String filterKey = "0-9";
		boolean filterActive = true;
		mockingGovOfficeRegionDao.count(filterKey, filterActive);
		verify(mockingGovOfficeRegionDao).count(filterKey, filterActive);
	}
	
	@Test
	public void testCount_ABCDE_Active_ExpectionNotZeroItems() {
		String filterKey = "A B C D E";
		boolean filterActive = true;
		mockingGovOfficeRegionDao.count(filterKey, filterActive);
		verify(mockingGovOfficeRegionDao).count(filterKey, filterActive);
	}
	
	@Test
	public void testCount_FGHIJ_Active_ExpectionNotZeroItems() {
		String filterKey = "F G H I J";
		boolean filterActive = true;
		mockingGovOfficeRegionDao.count(filterKey, filterActive);
		verify(mockingGovOfficeRegionDao).count(filterKey, filterActive);
	}
	
	@Test
	public void testCount_KLMN_Active_ExpectionNotZeroItems() {
		String filterKey = "K L M N";
		boolean filterActive = true;
		mockingGovOfficeRegionDao.count(filterKey, filterActive);
		verify(mockingGovOfficeRegionDao).count(filterKey, filterActive);
	}
	
	@Test
	public void testCount_OPQR_Active_ExpectionNotZeroItems() {
		String filterKey = "O P Q R";
		boolean filterActive = true;
		mockingGovOfficeRegionDao.count(filterKey, filterActive);
		verify(mockingGovOfficeRegionDao).count(filterKey, filterActive);
	}
	
	@Test
	public void testCount_STUV_Active_ExpectionNotZeroItems() {
		String filterKey = "S T U V";
		boolean filterActive = true;
		mockingGovOfficeRegionDao.count(filterKey, filterActive);
		verify(mockingGovOfficeRegionDao).count(filterKey, filterActive);
	}
	
	@Test
	public void testCount_WXYZ_Active_ExpectionNotZeroItems() {
		String filterKey = "W X Y Z";
		boolean filterActive = true;
		mockingGovOfficeRegionDao.count(filterKey, filterActive);
		verify(mockingGovOfficeRegionDao).count(filterKey, filterActive);
	}
	
}
