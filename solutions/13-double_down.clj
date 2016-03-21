; Write a function which doubles a number.
;
; http://www.4clojure.com/problem/15

(def solution #(* % 2))

(= (solution 2) 4)
(= (solution 3) 6)
(= (solution 11) 22)
(= (solution 7) 14)
