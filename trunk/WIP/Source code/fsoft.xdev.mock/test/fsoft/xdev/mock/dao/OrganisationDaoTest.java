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
	
	@Test 	/// To be details 
	public void testFindRange_ExpectionNotEmptyList() {
		int from = 0;
		int to = 10;
		String filterKey = "All";
		boolean filterActive = true;
		mockingOrganisationDao.findRange(from, to, filterKey, filterActive);
		verify(mockingOrganisationDao).findRange(from, to, filterKey, filterActive);
	}

	@Test /// To be details 
	public void testCount_ExpectionNotZeroItems() {
		String filterKey = "All";
		boolean filterActive = true;
		mockingOrganisationDao.count(filterKey, filterActive);
		verify(mockingOrganisationDao).count(filterKey, filterActive);
	}
}
