// Kirk Boyer
// 12/8/2013
// Scala 99 Questions
// Question 15: Duplicate the elements of a list N times each.

def myDuplicateN[A](ls: List[A], N:Int):List[A] = ls match{
  case Nil => Nil
  case x::xs => {
    def replicate[A](y:A, n:Int):List[A] = List.range(0,n).map(_ => y)
    replicate(x, N) ++ myDuplicateN(xs, N)
  }
}

