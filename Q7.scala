// Kirk Boyer
// 12/8/2013
// Scala 99 Questions
// Question 7: Flatten a Nested List structure.
//

def myFlatten(ls: List[Any]): List[Any] = ls.flatMap({
  case xs:List[_] => myFlatten(xs)
  case x => List(x)
})
