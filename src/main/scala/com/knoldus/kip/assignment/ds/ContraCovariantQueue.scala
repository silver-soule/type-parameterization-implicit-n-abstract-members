package com.knoldus.kip.assignment.ds

/**
  * Created by Neelaksh on 19/7/17.
  */
//shows contravariance and covariance
class ContraCovariantQueue[-S, +T] {

  def write(x: S): T = {
    x match {
      case res: T => res
    }
  }
}

object ContraCovariantQueue extends App{
  val contraCovariantQueue = new ContraCovariantQueue[B,B]
  val ccq:ContraCovariantQueue[C,A] = contraCovariantQueue// works
}