// Kirk Boyer
// 12/8/2013
// Scala 99 Questions
// Question 28: Sort a list of lists according to length of sublists

def lengthSort[_](ls:List[List[_]]):List[List[_]] = ls.sortWith( (a:List[_], b:List[_]) => a.length < b.length)
