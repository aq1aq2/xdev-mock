package fsoft.xdev.mock.dao;

import fsoft.xdev.mock.models.Country;
import fsoft.xdev.mock.models.CountryList;
import java.util.List;

public interface ICountryDao extends BaseDao<Country>{
	List<CountryList> findAll();
}
