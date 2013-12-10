// Kirk Boyer
// 12/8/2013
// Scala 99 Questions
// Question 16: Drop every Nth element from a list.

def myDropEveryNth[A](ls:List[A], N:Int):List[A] = ls match{
  case Nil => Nil
  case _ => {
    if (N > 0) ls.take(N-1) ++ myDropEveryNth(ls.drop(N), N)
    else throw new IllegalArgumentException
  }
}
