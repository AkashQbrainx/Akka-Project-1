package com.qbrainx.main
import akka.actor.SupervisorStrategy.Stop
import akka.actor.{ActorRef, ActorSystem, Props}
import com.qbrainx.model.{MyActor, ReceiveJson, Student}

object main extends App {
  val system=ActorSystem("myActorSystem")
  val actorJson: ActorRef =system.actorOf(Props[MyActor],"myActor")
  actorJson ! ReceiveJson
  actorJson ! Student("aaksh",12,34)
  actorJson ! Stop


}
