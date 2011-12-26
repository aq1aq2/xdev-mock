package fsoft.xdev.mock.dao;

import java.util.List;

import fsoft.xdev.mock.models.Premise;
import fsoft.xdev.mock.models.PremiseList;
import fsoft.xdev.mock.models.Service;

public interface IPremiseDao extends BaseDao<Premise> {
	//List<Service> listServiceAlready();
	//void remove(Service service);
	//List<Premise> listPremisebyLocationType(String type);
	List<Premise> listPremiseByLocationType(String value);
	
	
}
