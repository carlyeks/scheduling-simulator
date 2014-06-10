package org.bdgenomics.scheduling.simulator.scheduler

import org.bdgenomics.scheduling.simulator.{TaskDAG, Params, Provisioner}

trait SchedulerFactory {
  def factory(provisioner: Provisioner, params: Params, dag: TaskDAG): Scheduler
}
