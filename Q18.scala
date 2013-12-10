// Kirk Boyer
// 12/8/2013
// Scala 99 Questions
// Question 18: Extract a slice (between indices I & K) from a List

def mySlice[A](ls:List[A], I:Int, K:Int):List[A] = ls.drop(I-1).take(K-I+1)
