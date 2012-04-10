package dn.servicemix.test.actor;

import dn.servicemix.test.entity.ModelA;

public class ActorA {
	private ModelA modelA;
	
	
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
