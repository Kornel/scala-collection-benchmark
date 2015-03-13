package bench

import scala.collection.immutable.Queue
import org.openjdk.jmh.annotations.{Benchmark, Setup, State, Scope}

@State(Scope.Thread)
class CollectionsBench {

 
  var list: List[Int] = _
  var queue:  Queue[Int] = _
  var vector: Vector[Int] = _

  @Setup
  def setup(): Unit = {
    val Max = 20000
    list = (1 to Max).toList
    queue = Queue(1 to Max: _*)
    vector = Vector(1 to Max: _*)
  }


  @Benchmark
  def appendL(): Unit = list :+ 10
  
  @Benchmark
  def prependL(): Unit = 10 +: list

  @Benchmark
  def appendQ(): Unit = queue :+ 10

  @Benchmark
  def prependQ(): Unit = 10 +: queue
  
  @Benchmark
  def appendV(): Unit = vector :+ 10

  @Benchmark
  def prependV(): Unit = 10 +: vector
}


