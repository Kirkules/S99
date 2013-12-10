// Kirk Boyer
// 12/8/2013
// Scala 99 Questions
// Question 19: Rotate a list N places to the left.

def myRotateLeftN[A](ls:List[A], N:Int):List[A] = ls.drop(N)++ls.take(N)
