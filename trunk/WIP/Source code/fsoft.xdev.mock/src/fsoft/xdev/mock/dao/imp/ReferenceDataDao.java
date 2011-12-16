package fsoft.xdev.mock.dao.imp;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import fsoft.xdev.mock.dao.IReferenceDataDao;
import fsoft.xdev.mock.models.ReferenceData;

public class ReferenceDataDao extends HibernateDaoSupport implements IReferenceDataDao {

	@Override
	public boolean add(ReferenceData entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean edit(ReferenceData entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(ReferenceData entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ReferenceData find(ReferenceData entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ReferenceData> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ReferenceData> findRange(int from, int to) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}

}
