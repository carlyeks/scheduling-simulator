package org.bdgenomics.scheduling.simulator.events

import org.bdgenomics.scheduling.simulator.Job
import org.bdgenomics.scheduling.simulator.scheduler.Scheduler

case class JobFailed(job: Job) extends Event {
  override def execute(s: Scheduler): Unit = s.jobFailed(job)
}
