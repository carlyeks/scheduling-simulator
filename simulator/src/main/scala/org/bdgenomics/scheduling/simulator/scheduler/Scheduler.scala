package org.bdgenomics.scheduling.simulator.scheduler

import org.bdgenomics.scheduling.simulator.{Resource, Job}

trait Scheduler {
  def start()

  def jobFailed(job: Job)
  def jobFinished(job: Job)
  def resourceAvailable(resource: Resource)
  def resourceDead(resource: Resource)
}
