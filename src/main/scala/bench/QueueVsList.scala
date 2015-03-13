package bench

import org.openjdk.jmh.annotations.Benchmark

object L {
  private val Max = 20000
  val list = (1 to Max).toList
  val queue = scala.collection.immutable.Queue(1 to Max: _*)
  val vector = Vector(1 to Max: _*)
}

class CollectionsBench {

  @Benchmark
  def appendL(): Unit = L.list :+ 10
  
  @Benchmark
  def prependL(): Unit = 10 +: L.list

  @Benchmark
  def appendQ(): Unit = L.queue :+ 10

  @Benchmark
  def prependQ(): Unit = 10 +: L.queue
  
  @Benchmark
  def appendV(): Unit = L.vector :+ 10

  @Benchmark
  def prependV(): Unit = 10 +: L.vector
}


