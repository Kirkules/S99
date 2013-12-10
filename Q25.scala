// Kirk Boyer
// 12/8/2013
// Scala 99 Questions
// Question 25: Generate a random permutation of the elements of a list
import util.Random
import scala.math

def myRandomPermutation[A](ls:List[A]):List[A] = myRandomNSubset(ls,ls.length)

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
