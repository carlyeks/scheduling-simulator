package org.bdgenomics.scheduling.simulator.events

import org.bdgenomics.scheduling.simulator.Job
import org.bdgenomics.scheduling.simulator.scheduler.Scheduler

case class JobFinished(job: Job) extends Event {
  override def execute(s: Scheduler): Unit = s.jobFinished(job)
}
