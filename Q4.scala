// Kirk Boyer
// 12/8/2013
// Scala 99 Questions
// Question 4: Find the number of elements of a list

def myLength[A](ls: List[A]): Int = 
  ls.foldLeft(0)((acc,_) => acc + 1)
