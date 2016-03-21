; Write a function which returns the last element in a sequence.
;
; http://www.4clojure.com/problem/19
;
; This should be a total function, but it's not. Meaning this throws a function
; for empty sequences when it should return something like "just" or 
; "none/nothing"

(fn solution [xs]
  (if (empty? xs)
    (throw (Exception. "empyt list"))
    (nth xs (- (count xs) 1)))) ; use 'last' instead!

(= (solution [1 2 3 4 5]) 5)
(= (solution '(5 4 3)) 3)
(= (solution ["b"  "c"  "d"])  "d")
