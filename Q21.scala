// Kirk Boyer
// 12/8/2013
// Scala 99 Questions
// Question 21: Insert an element into a given position in a list.
// Indexing starts at 0
// Inserting at indices below 1 appends to the front of the list, and 
// inserting at indices beyond the length of the list appends to the end of the list
def myInsertAt[A](ls:List[A], x:A, N:Int):List[A] = ls.take(N) ++ (x::ls.drop(N))
