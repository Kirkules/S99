// Kirk Boyer
// 12/8/2013
// Scala 99 Questions
// Question 1: Find the last element of a list

def myLast[A](ls: List[A]): A = ls match {
  case x::Nil   => x
  case _::rest  => myLast(rest)
  case _        => throw new NoSuchElementException 
}
