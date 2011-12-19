package fsoft.xdev.mock.dao;
import java.util.List;

import fsoft.xdev.mock.models.TrustRegion;
import fsoft.xdev.mock.models.TrustRegionList;


public interface ITrustRegionDao extends BaseDao<TrustRegion> {
	List<TrustRegion> search(String query);

	List<TrustRegionList> findRange(int from, int to, String key, Boolean status);
	
}
