// Kirk Boyer
// 12/8/2013
// Scala 99 Questions
// Question 27: Group the elements of a set into three disjoint subsets of specified size
// in all possible ways.

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
  def withoutSublist[B](bigList:List[B], subList:List[B]):List[B] =
    bigList.foldLeft( List[B]() )( (acc, elem) => if (subList.contains(elem)) acc else elem::acc)
  
  if (a+b+c != abcs.length) {
    //print("Subset sizes don't add up.")
    throw new IllegalArgumentException
  }
  else {
    for {as <- KCombinationsFrom(abcs,a)} yield {
      val bcs = withoutSublist(abcs,as)
      for {bs <- KCombinationsFrom(bcs,b)} yield {
        val onlycs = withoutSublist(bcs,bs)
        for {cs <- KCombinationsFrom(onlycs,c)} yield {
          List(as,bs,cs)
        }
      }
    }
  }.flatten.flatten.map(_.map(_.toSet)).map(_.toSet).toSet.toList.map( (z:Set[Set[A]]) => z.toList).map( (z:List[Set[A]]) => z.map((zz:Set[A]) => zz.toList))
// This is really nasty, but somehow scala wouldn't let me convert everything to a set and back from a set more nicely.
}
