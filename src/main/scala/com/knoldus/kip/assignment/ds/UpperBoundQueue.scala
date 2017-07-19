package com.knoldus.kip.assignment.ds

/**
  * Created by Neelaksh on 19/7/17.
  */
//shows upperbound <: upper
//>: lower

class UpperBoundQueue[T <: B  ](x:T) {
  override def toString: String = x.toString
}

object UpperBoundQueue extends App{
  val upperBoundQueue = new UpperBoundQueue[B](new B())
 // val ubq : UpperBoundQueue[A] = upperBoundQueue wont work
}