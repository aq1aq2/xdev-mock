package fsoft.xdev.mock.actions.test.team;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import fsoft.xdev.mock.models.Team;

public class TeamAction extends ActionSupport{

	private List<Team> listTeam;
	
	public String execute(){
		listTeam = new ArrayList<Team>();
		
		Team team1 = new Team("team1", "Ha Noi", "084", "newYork", true);
		Team team2 = new Team("team2", "Hai Phong", "123", "China", false);
		listTeam.add(team2);
		listTeam.add(team1);
		
		return SUCCESS;
	}

	public List<Team> getListTeam() {
		return listTeam;
	}

	public void setListTeam(List<Team> listTeam) {
		this.listTeam = listTeam;
	}
	
	
}
