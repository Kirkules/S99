// Kirk Boyer
// 12/8/2013
// Scala 99 Questions
// Question 3: Find the Kth element of a list, indexing from 0.

def myKth[A](k:Int, ls:List[A]): A = k match {
  case 0 => ls.head
  case n => if (n < 0) {throw new IllegalArgumentException} else {myKth(k-1,ls.tail)} 
}
