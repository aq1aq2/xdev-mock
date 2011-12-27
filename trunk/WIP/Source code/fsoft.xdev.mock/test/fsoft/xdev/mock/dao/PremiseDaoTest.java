package fsoft.xdev.mock.dao;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import fsoft.xdev.mock.dao.imp.OrganisationDao;
import fsoft.xdev.mock.dao.imp.PremiseDao;
import fsoft.xdev.mock.models.Organisation;
import fsoft.xdev.mock.models.Premise;

public class PremiseDaoTest {

	@Mock
	private IPremiseDao mockingPremiseDao;

	@Before
	public void setUp() throws Exception {
		mockingPremiseDao = mock(PremiseDao.class);
	}

	@After
	public void tearDown() throws Exception {
		mockingPremiseDao = null;
	}
	
	@Test
	public void testAdd_ExpectionTrue() {
		Premise premise = new Premise(22);
		mockingPremiseDao.add(premise);
		verify(mockingPremiseDao).add(premise);
	}
	
	@Test 	
	public void testFindRange_All_Active_ExpectionNotEmptyList() {
		int from = 0;
		int to = 3;
		String filterKey = "All";
		boolean filterActive = true;
		mockingPremiseDao.findRange(from, to, filterKey, filterActive);
		verify(mockingPremiseDao).findRange(from, to, filterKey, filterActive);
	}
	
	@Test 
	public void testFindRange_09_Active_ExpectionNotEmptyList() {
		int from = 0;
		int to = 3;
		String filterKey = "0-9";
		boolean filterActive = true;
		mockingPremiseDao.findRange(from, to, filterKey, filterActive);
		verify(mockingPremiseDao).findRange(from, to, filterKey, filterActive);
	}
	
	@Test 	
	public void testFindRange_ABCDE_Active_ExpectionNotEmptyList() {
		int from = 0;
		int to = 3;
		String filterKey = "A B C D E";
		boolean filterActive = true;
		mockingPremiseDao.findRange(from, to, filterKey, filterActive);
		verify(mockingPremiseDao).findRange(from, to, filterKey, filterActive);
	}
	
	@Test 
	public void testFindRange_FGHIJ_Active_ExpectionNotEmptyList() {
		int from = 0;
		int to = 10;
		String filterKey = "F G H I J";
		boolean filterActive = true;
		mockingPremiseDao.findRange(from, to, filterKey, filterActive);
		verify(mockingPremiseDao).findRange(from, to, filterKey, filterActive);
	}
	
	@Test 	
	public void testFindRange_KLMN_Active_ExpectionNotEmptyList() {
		int from = 0;
		int to = 3;
		String filterKey = "K L M N";
		boolean filterActive = true;
		mockingPremiseDao.findRange(from, to, filterKey, filterActive);
		verify(mockingPremiseDao).findRange(from, to, filterKey, filterActive);
	}
	
	@Test 
	public void testFindRange_OPQR_Active_ExpectionNotEmptyList() {
		int from = 0;
		int to = 3;
		String filterKey = "O P Q R";
		boolean filterActive = true;
		mockingPremiseDao.findRange(from, to, filterKey, filterActive);
		verify(mockingPremiseDao).findRange(from, to, filterKey, filterActive);
	}
	
	@Test 
	public void testFindRange_STUV_Active_ExpectionNotEmptyList() {
		int from = 0;
		int to = 3;
		String filterKey = "S T U V";
		boolean filterActive = true;
		mockingPremiseDao.findRange(from, to, filterKey, filterActive);
		verify(mockingPremiseDao).findRange(from, to, filterKey, filterActive);
	}
	
	@Test 
	public void testFindRange_WXYZ_Active_ExpectionNotEmptyList() {
		int from = 0;
		int to = 10;
		String filterKey = "W X Y Z";
		boolean filterActive = true;
		mockingPremiseDao.findRange(from, to, filterKey, filterActive);
		verify(mockingPremiseDao).findRange(from, to, filterKey, filterActive);
	}
	
	@Test 	
	public void testFindRange_All_InActive_ExpectionNotEmptyList() {
		int from = 0;
		int to = 3;
		String filterKey = "All";
		boolean filterActive = false;
		mockingPremiseDao.findRange(from, to, filterKey, filterActive);
		verify(mockingPremiseDao).findRange(from, to, filterKey, filterActive);
	}
	
	@Test 
	public void testFindRange_09_InActive_ExpectionNotEmptyList() {
		int from = 0;
		int to = 3;
		String filterKey = "0-9";
		boolean filterActive = false;
		mockingPremiseDao.findRange(from, to, filterKey, filterActive);
		verify(mockingPremiseDao).findRange(from, to, filterKey, filterActive);
	}
	
	@Test 	
	public void testFindRange_ABCDE_InActive_ExpectionNotEmptyList() {
		int from = 0;
		int to = 3;
		String filterKey = "A B C D E";
		boolean filterActive = false;
		mockingPremiseDao.findRange(from, to, filterKey, filterActive);
		verify(mockingPremiseDao).findRange(from, to, filterKey, filterActive);
	}
	
	@Test 
	public void testFindRange_FGHIJ_InActive_ExpectionNotEmptyList() {
		int from = 0;
		int to = 3;
		String filterKey = "F G H I J";
		boolean filterActive = false;
		mockingPremiseDao.findRange(from, to, filterKey, filterActive);
		verify(mockingPremiseDao).findRange(from, to, filterKey, filterActive);
	}
	
	@Test 	
	public void testFindRange_KLMN_InActive_ExpectionNotEmptyList() {
		int from = 0;
		int to = 3;
		String filterKey = "K L M N";
		boolean filterActive = false;
		mockingPremiseDao.findRange(from, to, filterKey, filterActive);
		verify(mockingPremiseDao).findRange(from, to, filterKey, filterActive);
	}
	
	@Test 
	public void testFindRange_OPQR_InActive_ExpectionNotEmptyList() {
		int from = 0;
		int to = 3;
		String filterKey = "O P Q R";
		boolean filterActive = false;
		mockingPremiseDao.findRange(from, to, filterKey, filterActive);
		verify(mockingPremiseDao).findRange(from, to, filterKey, filterActive);
	}
	
	@Test 
	public void testFindRange_STUV_InActive_ExpectionNotEmptyList() {
		int from = 0;
		int to = 3;
		String filterKey = "S T U V";
		boolean filterActive = false;
		mockingPremiseDao.findRange(from, to, filterKey, filterActive);
		verify(mockingPremiseDao).findRange(from, to, filterKey, filterActive);
	}
	
	@Test 
	public void testFindRange_WXYZ_InActive_ExpectionNotEmptyList() {
		int from = 0;
		int to = 3;
		String filterKey = "W X Y Z";
		boolean filterActive = false;
		mockingPremiseDao.findRange(from, to, filterKey, filterActive);
		verify(mockingPremiseDao).findRange(from, to, filterKey, filterActive);
	}

}
