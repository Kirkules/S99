// Kirk Boyer
// 12/8/2013
// Scala 99 Questions
// Question 24: Draw N different random numbers from the set 1..M
import util.Random
import scala.math

def myLotto(N:Int, M:Int):List[Int] = myRandomNSubset(List.range(1,M+1),N)

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
