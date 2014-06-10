package org.bdgenomics.scheduling.simulator.events

import org.bdgenomics.scheduling.simulator.scheduler.Scheduler

class TestEvent extends Event {
  override def execute(s: Scheduler): Unit = {}
  override def toString: String = "TestEvent"
}
