package fsoft.xdev.mock.dao;
import java.util.List;

import fsoft.xdev.mock.models.TypeOfBusiness;

public interface ITypeOfBusinessDao extends BaseDao<TypeOfBusiness>{
	public int count(String businesstName, String sicCode);
	public List search(int from, int to, String businesstName, String sicCode);
}
