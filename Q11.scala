// Kirk Boyer
// 12/8/2013
// Scala 99 Questions
// Question 11: Modified run-length encoding. Now, don't add a tuple if there is just 1 copy.

def myModifiedEncode[A](ls: List[A]): List[Any] = ls match {
  case Nil => Nil
  case xs: List[_] => {
    val (done, rest) = xs.span(x => x == xs.head)
    val n = done.length
    if (n > 1) (n, done.head)::myModifiedEncode(rest)
    else done.head::myModifiedEncode(rest)
  }
}
