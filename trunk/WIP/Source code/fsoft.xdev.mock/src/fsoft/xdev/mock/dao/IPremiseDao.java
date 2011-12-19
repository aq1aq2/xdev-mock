package fsoft.xdev.mock.dao;

import java.util.List;

import fsoft.xdev.mock.models.Premise;
import fsoft.xdev.mock.models.PremiseList;

public interface IPremiseDao extends BaseDao<Premise> {
	List<PremiseList> findRange(int from, int to);
	
}
