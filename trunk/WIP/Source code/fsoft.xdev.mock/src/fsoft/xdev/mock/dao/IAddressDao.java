package fsoft.xdev.mock.dao;

import java.util.List;

import fsoft.xdev.mock.models.Address;

public interface IAddressDao extends BaseDao<Address>{
	public int count(String postcode, String street, String town);
	public List search(int from, int to, String postcode, String street, String town);
}
