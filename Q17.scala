// Kirk Boyer
// 12/8/2013
// Scala 99 Questions
// Question 17: Split a list into two parts, given the length of the first part.

def mySplit[A](ls:List[A], N:Int): (List[A],List[A]) = (ls.take(N),ls.drop(N))
