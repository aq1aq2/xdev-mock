package fsoft.xdev.mock.actions.premise;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import fsoft.xdev.mock.dao.IPremisesDao;
import fsoft.xdev.mock.models.Premises;

public class PremiseAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private IPremisesDao premisesDao;
	private Premises premises;
	private List<Premises> listPremises = new ArrayList<Premises>();
	
	public String list(){
		
		listPremises = premisesDao.findAll();
		System.out.println("List premises is listed");
		return "list";
	}
	
	public String save(){
		System.out.println("vao day");
		premises.setIsActive(false);
		premisesDao.add(premises);
		System.out.println("one premise is added");
		return "add";
	}

	public void setPremisesDao(IPremisesDao premisesDao) {
		this.premisesDao = premisesDao;
	}

	public Premises getPremises() {
		return premises;
	}

	public void setPremises(Premises premises) {
		this.premises = premises;
	}

	public List<Premises> getListPremises() {
		return listPremises;
	}

	public void setListPremises(List<Premises> listPremises) {
		this.listPremises = listPremises;
	}
	
}
