package dn.servicemix.example.actor;

import dn.servicemix.example.entity.ModelA;

public class ActorA {
	private ModelA modelA;
	
	public ActorA() {
		
	}
	
	public ActorA(String myName, int myAge) {
		modelA = new ModelA(myName, myAge);
	}

	public ModelA getModelA() {
		return modelA;
	}

	public void setModelA(ModelA modelA) {
		this.modelA = modelA;
	}
}
