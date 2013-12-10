// Kirk Boyer
// 12/8/2013
// Scala 99 Questions
// Question 8: Eliminate consecutive duplicates of list elements

def myCompress[A](ls:List[A]) : List[A] = ls match{
  case Nil => Nil
  case x::xs => x::myCompress(xs.dropWhile(x==_))
}
