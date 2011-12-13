package fsoft.xdev.mock.dao;
import java.util.List;

import fsoft.xdev.mock.models.TrustDistricts;


public interface ITrustDistrictsDao extends BaseDao<TrustDistricts>{
	List<TrustDistricts> findStart();
}
