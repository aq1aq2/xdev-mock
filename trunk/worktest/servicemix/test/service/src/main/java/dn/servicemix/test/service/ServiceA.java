package dn.servicemix.test.service;

import dn.servicemix.test.actor.ActorA;
import dn.servicemix.test.xml.ModelA;
import dn.servicemix.test.xml.ShowActorRequest;
import dn.servicemix.test.xml.ShowActorResponse;

public class ServiceA {
	private ActorA actorA;
	
	public ShowActorResponse showActor(ShowActorRequest request) {
		System.out.println(actorA.getModelA().getMyName());
		System.out.println(actorA.getModelA().getMyAge());
		
		ModelA model = new ModelA();
		model.setName(actorA.getModelA().getMyName());
		model.setAge(actorA.getModelA().getMyAge());
		
		ShowActorResponse response = new ShowActorResponse();
		response.setModelA(model);
		response.setMessage(request.getInput());
		
		return response;
	}

	public ActorA getActorA() {
		return actorA;
	}

	public void setActorA(ActorA actorA) {
		this.actorA = actorA;
	}
}
