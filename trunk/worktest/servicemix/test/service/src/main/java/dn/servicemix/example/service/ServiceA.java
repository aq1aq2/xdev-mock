package dn.servicemix.example.service;

import dn.servicemix.example.actor.ActorA;
import dn.servicemix.example.xml.ModelA;
import dn.servicemix.example.xml.ShowActorRequest;
import dn.servicemix.example.xml.ShowActorResponse;

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
	
	public ShowActorResponse showActor2(ShowActorRequest request) {
		System.out.println(actorA.getModelA().getMyName());
		System.out.println(actorA.getModelA().getMyAge());
		
		ModelA model = new ModelA();
		model.setName("MinhNTT2");
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
