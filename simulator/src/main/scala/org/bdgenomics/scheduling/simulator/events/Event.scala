package org.bdgenomics.scheduling.simulator.events

import org.bdgenomics.scheduling.simulator.scheduler.Scheduler

trait Event {
  def execute(s: Scheduler)
}
