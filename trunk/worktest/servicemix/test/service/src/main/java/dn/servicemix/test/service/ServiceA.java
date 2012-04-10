package dn.servicemix.test.service;

import dn.servicemix.test.actor.ActorA;

public class ServiceA {
	private ActorA actorA;
	
	public void showActor() {
		System.out.println(actorA.getModelA().getMyName());
		System.out.println(actorA.getModelA().getMyAge());
	}

	public ActorA getActorA() {
		return actorA;
	}

	public void setActorA(ActorA actorA) {
		this.actorA = actorA;
	}
}
