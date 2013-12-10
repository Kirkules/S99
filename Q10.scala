// Kirk Boyer
// 12/8/2013
// Scala 99 Questions
// Question 10: Run-length encoding of a list
// List('a', 'a', 'a', 'b', 'b', 'c') => List(List(3,'a'), List(2,'b'), List(1,'c'))

def myEncode[A](ls: List[A]): List[(Int,A)] = ls match {
  case Nil => Nil
  case xs: List[_] => {
    val (done, rest) = xs.span(x => x == xs.head)
    (done.length, done.head)::myEncode(rest)
  }
}
