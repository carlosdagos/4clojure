; Write a function which returns only the odd numbers from a sequence.
;
; http://www.4clojure.com/problem/25

(fn odds-only [xs]
  (filter odd? xs))

(= (odds-only #{1 2 3 4 5}) '(1 3 5))
(= (odds-only [4 2 1 6]) '(1))
(= (odds-only [2 2 4 6]) '())
(= (odds-only [1 1 1 3]) '(1 1 1 3))
