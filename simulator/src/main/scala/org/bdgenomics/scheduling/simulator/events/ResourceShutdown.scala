package org.bdgenomics.scheduling.simulator.events

import org.bdgenomics.scheduling.simulator.Resource
import org.bdgenomics.scheduling.simulator.scheduler.Scheduler

case class ResourceShutdown(resource: Resource) extends Event {
  override def execute(s: Scheduler): Unit = {}
}
