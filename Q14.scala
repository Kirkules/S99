// Kirk Boyer
// 12/8/2013
// Scala 99 Questions
// Question 14: Duplicate the elements of a list.

def myDuplicate[A](ls:List[A]):List[A] = ls match {
  case Nil => Nil
  case x::xs => x::x::myDuplicate(xs)
}
