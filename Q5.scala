// Kirk Boyer
// 12/8/2013
// Scala 99 Questions
// Question 5: Reverse a list

def myReverse[A](ls : List[A]): List[A] =
  ls.foldLeft(List[A]())( (acc,next) => next::acc)
