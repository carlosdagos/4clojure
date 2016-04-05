; Write a function which creates a list of all integers in a given range.
;
; http://www.4clojure.com/problem/34

(fn neu-range [start finish]
  (if (= (+ 1 start) finish)
    (list start)
    (conj (neu-range (inc start) finish) start)))

(= (neu-range 1 4) '(1 2 3))
(= (neu-range -2 2) '(-2 -1 0 1))
(= (neu-range 5 8) '(5 6 7))
