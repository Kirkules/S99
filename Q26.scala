// Kirk Boyer
// 12/11/2013
// Scala 99 Questions
// Question 26: Generate the combinations of K distinct objects chosen from a given list.

def KCombinationsFrom[A](ls:List[A], K:Int):List[List[A]] = {

  def stickXInFront[B](x:B, xs:List[List[B]]):List[List[B]] = xs.map(x::_)
  if (ls.length < K) throw new IllegalArgumentException
  else
    if (K < 1) throw new IllegalArgumentException
    else if (K == 1) ls.map(List(_))
    else (for {i <- List.range(0,ls.length-1)} yield {
        stickXInFront(ls(i), KCombinationsFrom(ls.slice(i+1,ls.length), K-1) )
      }).flatten

}
