package fsoft.xdev.mock.dao;

import fsoft.xdev.mock.models.County;
import java.util.List;

public interface ICountyDao extends BaseDao<County> {
	List<County> findAll();
}
