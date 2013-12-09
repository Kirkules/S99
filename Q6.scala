// Kirk Boyer
// 12/8/2013
// Scala 99 Questions
// Question 6: Determine whether a list is a palindrome

def myReverse[A](ls : List[A]): List[A] =
  ls.foldLeft(List[A]())( (acc,next) => next::acc)

def myPalindrome[A](ls : List[A]): Boolean = (ls == myReverse(ls))
