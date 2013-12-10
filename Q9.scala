// Kirk Boyer
// 12/8/2013
// Scala 99 Questions
// Question 9: Pack consecutive duplicates of list elements into sublists

def myPack[A](ls: List[A]):List[List[A]] = {
  if (ls.isEmpty) {List(List())}
  else{
    val done = ls.takeWhile( x => x == ls.head )
    val next = ls.dropWhile( x => x == ls.head )
    if (next == Nil) {List(done)}
    else {done::myPack(next)}
  }
}
