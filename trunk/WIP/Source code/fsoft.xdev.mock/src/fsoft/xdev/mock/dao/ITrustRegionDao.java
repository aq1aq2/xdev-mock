package fsoft.xdev.mock.dao;
import java.util.List;

import fsoft.xdev.mock.models.TrustRegion;


public interface ITrustRegionDao extends BaseDao<TrustRegion> {
	List<TrustRegion> search(String query);
	
}
