// Kirk Boyer
// 12/8/2013
// Scala 99 Questions
// Question 12: Decode a run-length-encoded list, encoded as in Q10 

def myEncode[A](ls: List[A]): List[(Int,A)] = ls match {
  case Nil => Nil
  case xs: List[_] => {
    val (done, rest) = xs.span(x => x == xs.head)
    (done.length, done.head)::myEncode(rest)
  }
}

def myDecode[A](ls: List[(Int,A)] ): List[A] = ls match {
  case Nil => Nil
  case x::xs => x match {
    case (n, x) => if (n > 1) x::myDecode((n-1,x)::xs) else x::myDecode(xs)
    case _ => throw new IllegalArgumentException
  }
}
