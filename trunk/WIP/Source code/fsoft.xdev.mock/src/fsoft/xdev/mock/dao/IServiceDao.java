package fsoft.xdev.mock.dao;
import java.util.List;

import fsoft.xdev.mock.models.Service;
import fsoft.xdev.mock.models.ServiceList;


public interface IServiceDao extends BaseDao<Service>{
	List<ServiceList> findRange(int from, int to);
}
