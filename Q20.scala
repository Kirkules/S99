// Kirk Boyer
// 12/8/2013
// Scala 99 Questions
// Question 20: Remove the Kth element from a list, return result and element as tuple.
// Indexing starts at 0.

def myRemoveNth[A](ls:List[A], N:Int):(A,List[A]) = (ls(N), ls.take(N)++ls.drop(N+1))
