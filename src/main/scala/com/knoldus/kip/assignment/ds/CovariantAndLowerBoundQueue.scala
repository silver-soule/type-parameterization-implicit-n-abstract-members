package com.knoldus.kip.assignment.ds

/**
  * Created by Neelaksh on 19/7/17.
  */
class CovariantAndLowerBoundQueue[+T](private val popList:List[T],private val addList:List[T]){

  private def updatestructure = {
    if(popList.isEmpty) new CovariantAndLowerBoundQueue[T](addList.reverse,Nil) else this
  }

  def enqueue[U>:T](element:U): CovariantAndLowerBoundQueue[U] ={
    new CovariantAndLowerBoundQueue[U](popList,element::addList)
  }

  def tail : CovariantAndLowerBoundQueue[T] = {
    val queue = updatestructure
    queue.popList match{
      case h::t => new CovariantAndLowerBoundQueue[T](t,addList)
      case _ => throw new Exception("queue empty")
    }
  }
}

object CovariantAndLowerBoundQueue extends App{
  val covariantandlowerboundqueue = new CovariantAndLowerBoundQueue[B](Nil,Nil)
  val iv :CovariantAndLowerBoundQueue[A] = new CovariantAndLowerBoundQueue[B](Nil,Nil) //works
}