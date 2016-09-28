#Scala Thoughts#

###What's easy to do in Scala?  What's not?###

Functional programming seems relatively easy in Scala.  In this respect, the
language had many similarities to other functional languages like Racket and
Haskell.  I didn't explicitly have to say "return", as is true of other functional
languages.  The use of higher-order functions was similar to my experiences with
Racket as well.  Scala also does support pattern matching like Haskell, but it
seemed slightly more cumbersome.  This made it very easy to, for example, return
different results based on different inputs, as we did in the `matchOnInputType`
function.  It was also very easy to declare variables and use type inference, at
least in the scope of this assignment.  Also, the collections seemed to have
extensive and intuitives APIs, supported by thorough documentation online.  This
made it very easy to take advantage of the built-in functionality of lists.

###What are your favorite choices that the designers of Scala made? Why?###

There were a few design choices that I very much appreciated.  I appreciated
the different ways you could use pattern matching.  In match/case statements,
it was possible to include a line like `case x : Int if x > 0`, so that we
could match by type and a predicate.  I cannot think of ways to express
something as concisely in other languages.  I also thought that the syntax was
relatively intuitive.  I appreciated that we didn't have to use lots of nested
parentheses as in Racket or LISP.  It was possible to declare new variables with
val (as if we were using let), and then return a result.  I was also impressed
by the testing frameworks.  It seems like Scala is very customizable, allowing
programmers to use syntax like `it should "do something" in {...}`.  I am
excited to learn more about these options, as they seem very useful for creating
a DSL.

###What are your least-favorite design choices?###

There were a couple of small situations that I thought were simpler or more
intuitive in other languages.  For example, if `myList` is a list, I am more
familiar with using `myList[0]` instead of `myList(0)` to access the first
element.  I am unsure why the language designers chose this, perhaps because the
bracket operator has a different use.  I also thought that the syntax for naming
a variable was unusual.  I don't understand why `val x: Int = 5` is better than,
for example `const int x = 5`, which I am much more familiar with, but I assume
that decision was not arbitrary.

###What Scala features would you like to learn more about?###

I am probably most interested in learning about creating new syntax like the
ones used in the testing frameworks--I am not aware of easy ways to do this in
other languages, and it seems quite unusual but convenient.  Also, in this
homework we dealt primarly with functional programming, and so I don't think I
ever created mutable object.  I would be curious to know how Scala deals with
mutable objects, and how this interacts with its functional style.

