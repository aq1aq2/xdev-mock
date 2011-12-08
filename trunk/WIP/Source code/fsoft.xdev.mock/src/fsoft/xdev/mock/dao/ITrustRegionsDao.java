package fsoft.xdev.mock.dao;
import java.util.List;

import fsoft.xdev.mock.models.TrustRegions;


public interface ITrustRegionsDao extends BaseDao<TrustRegions> {
	List<TrustRegions> search(String query);
}
