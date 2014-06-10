package org.bdgenomics.scheduling.simulator.events

import org.bdgenomics.scheduling.simulator.Resource
import org.bdgenomics.scheduling.simulator.scheduler.Scheduler

case class ResourceAvailable(resource: Resource) extends Event {
  override def execute(s: Scheduler): Unit = s.resourceAvailable(resource)
}
