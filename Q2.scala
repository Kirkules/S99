// Kirk Boyer
// 12/8/2013
// Scala 99 Questions
// Question 2: Find the last (-but one) element of a list.

def myButLast[A](ls : List[A]): A = ls match {
  case x::y::Nil  => x
  case x::rest    => myButLast(rest)
  case _          => throw new NoSuchElementException
}
