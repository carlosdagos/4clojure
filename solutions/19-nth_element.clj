; Write a function which returns the Nth element from a sequence.
;
; http://www.4clojure.com/problem/21
;
; Again, like the two previous one, this function is not total. It should 
; return a Just x or Nothing, instead of an element or 'nil' ... which is ok
; I suppose, but maybe I'm still thinking too much about Haskell XD
;

(fn nth-elem [xs n]
  (first (drop n xs)))

(= (nth-elem '(5 5 6 7) 2) 6)
(= (nth-elem [:a :b :c] 0) :a)
(= (nth-elem [1 2 3 4] 1) 2)
(= (nth-elem '([1 2]  [3 4]  [5 6]) 2)  [5 6])
