package com.knoldus.kip.assignment.ds

/**
  * Created by Neelaksh on 19/7/17.
  */
//shows contravariance

class ContravariantQueue[-T](x:T){
  override def toString:String = x.toString
}
object ContravariantQueue extends App{
  var contravariantqueue:ContravariantQueue[B] = new ContravariantQueue[B](new B())
  //val cv:ContravariantQueue[A] = contravariantqueue  won't work
}