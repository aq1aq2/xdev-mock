package fsoft.xdev.mock.actions.team;

import java.util.ArrayList;
import java.util.List;

import fsoft.xdev.mock.dao.ICountyDao;
import fsoft.xdev.mock.dao.ITeamDao;
import fsoft.xdev.mock.models.Team;
import fsoft.xdev.mock.models.TeamList;
import fsoft.xdev.mock.models.County;

public class TeamAction {
	private Team team;
	private List<TeamList> listModel = new ArrayList<TeamList>();
	private List<County> listCounty = new ArrayList<County>();
	private ITeamDao teamDao;
	private ICountyDao countyDao;
	private String filterKey;
	private Boolean filterActive;
	private Boolean mode;
	private Integer rows = 0;
	private Integer page = 0;
	private String sord;
	private String sidx;
	private Integer total = 0;
	private Integer records = 0;

	public String getFilterKey() {
		return filterKey;
	}

	public void setFilterKey(String filterKey) {
		this.filterKey = filterKey;
	}

	public Boolean getFilterActive() {
		return filterActive;
	}

	public void setFilterActive(Boolean filterActive) {
		this.filterActive = filterActive;
	}

	public Boolean getMode() {
		return mode;
	}

	public void setMode(Boolean mode) {
		this.mode = mode;
	}

	public Integer getRows() {
		return rows;
	}

	public void setRows(Integer rows) {
		this.rows = rows;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public String getSord() {
		return sord;
	}

	public void setSord(String sord) {
		this.sord = sord;
	}

	public String getSidx() {
		return sidx;
	}

	public void setSidx(String sidx) {
		this.sidx = sidx;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Integer getRecords() {
		return records;
	}

	public void setRecords(Integer records) {
		this.records = records;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	public List<TeamList> getListModel() {
		return listModel;
	}

	public void setListModel(List<TeamList> listModel) {
		this.listModel = listModel;
	}


	public List<County> getListCounty() {
		return listCounty;
	}

	public void setListCounty(List<County> listCounty) {
		this.listCounty = listCounty;
	}
	
	public void setTeamDao(ITeamDao teamDao) {
		this.teamDao = teamDao;
	}
	
	public void setCountyDao(ICountyDao countyDao) {
		this.countyDao = countyDao;
	}

	public String list() {
		int to = (rows * page);
		int from = to - rows;

		// Count Rows
		records = teamDao.count(filterKey, filterActive);
		listModel = teamDao.findRange(from, to, filterKey, filterActive);
		// calculate the total pages for the query
		total = (int) Math.ceil((double) records / (double) rows);
		return "list";
	}

	// save trust region into database
	public String add() {
		team.setStatus(false);
		teamDao.add(team);
		return "add";
	}

	public String edit() {
		teamDao.edit(team);
		return "edit";
	}

	public String input() {
		team = new Team();
		listCounty= countyDao.findAll();
		mode = true;
		return "input";
	}

	// find trust region by ID
	public String detail() {
		team = teamDao.find(team);
		listCounty= countyDao.findAll();
		mode = false;
		return "input";
	}
	public String active(){
		team = teamDao.find(team);
		team.setStatus(true);
		teamDao.edit(team);
		return "list";
	}
}
