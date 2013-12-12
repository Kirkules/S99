// Kirk Boyer
// 12/8/2013
// Scala 99 Questions
// Question 27: Group the elements of a set into three disjoint subsets of specified size
// in all possible ways.
//
// The provided solution produces all of the possible outcomes, but contains duplicate
// solutions.
//
// The easiest way I can imagine to fix this is to use the Sets class (or else
// manually check for repetition), which is not going to be very nice, however it is done.
//
// The REASON the provided solution produces these duplicates is that, if 2 (or more) group sizes
// are the same, the solution will "forget" that it considered a different permutation
// of these groups and produce it again.
//
def KCombinationsFrom[A](ls:List[A], K:Int):List[List[A]] = {

    def stickXInFront[B](x:B, xs:List[List[B]]):List[List[B]] = xs.map(x::_)

    if (K < 1 || K > ls.length) throw new IllegalArgumentException
    else if (K == 1) ls.map(List(_))
    else if (K == ls.length) List(ls)
    else (for {i <- List.range(0,ls.length-K+1)} yield {
      stickXInFront(ls(i), KCombinationsFrom(ls.slice(i+1,ls.length), K-1) )
    }).flatten

}


def myGroup3[A](abcs:List[A], a:Int, b:Int, c:Int):List[List[List[A]]] ={
  if (a+b+c != abcs.length) {
    //print("Subset sizes don't add up.")
    throw new IllegalArgumentException
  }
  else {
    for {as <- KCombinationsFrom(abcs,a); bs <- KCombinationsFrom(abcs diff as, b)} yield {
      List(as, bs, (abcs diff as) diff bs)
    }
  }.map(_.map(_.toSet)).map(_.toSet).toSet.toList.map( (z:Set[Set[A]]) => z.toList).map( (z:List[Set[A]]) => z.map((zz:Set[A]) => zz.toList))

  
  /* OLD CODE
  else {
    for {as <- KCombinationsFrom(abcs,a)} yield {
      for {bs <- KCombinationsFrom(abcs diff as,b)} yield {
        for {cs <- KCombinationsFrom(abcs diff (as ++ bs),c)} yield {
          List(as,bs,cs)
        }
      }
    }
  }.flatten.flatten.map(_.map(_.toSet)).map(_.toSet).toSet.toList.map( (z:Set[Set[A]]) => z.toList).map( (z:List[Set[A]]) => z.map((zz:Set[A]) => zz.toList))

// This is really nasty, but somehow scala wouldn't let me convert everything to a set and back from a set more nicely.
  */
}
