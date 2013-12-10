// Kirk Boyer
// 12/8/2013
// Scala 99 Questions
// Question 23: Extract a given number of randomly selected elements from a list
// My preferred approach to this problem includes ensuring that we don't select a given element more than once, since this was not specified
// in the description of the problem. Therefore, "extracting more than the length of the list" will return the whole list, and "extracting
// less than 1 element" will return an empty list.
import util.Random
import scala.math

def myRandomNSubset[A](ls:List[A], N:Int):List[A] = {
  if (N < 1) Nil
  else {
    var indices = List(Random.nextInt(ls.length))
    val n = math.min(N,ls.length)
    while (indices.length < n){
      val t = Random.nextInt(ls.length)
      indices = if (indices.contains(t)) indices else (t::indices)
    }
    indices.map(i=>ls(i))
  }
}
