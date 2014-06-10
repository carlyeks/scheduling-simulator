package org.bdgenomics.scheduling.simulator.scheduler

import org.bdgenomics.scheduling.simulator.{Resource, Job}

class SimpleMultipathScheduler(pathProvider: PathProvider) extends Scheduler {

  override def start(): Unit = {
    val state = world.snapshot()
    val 
  }

  override def resourceAvailable(resource: Resource): Unit = ???

  override def resourceDead(resource: Resource): Unit = ???

  override def jobFailed(job: Job): Unit = ???

  override def jobFinished(job: Job): Unit = ???
}
