; Write a higher-order function which flips the order of the arguments
; of an input function.
;
; http://www.4clojure.com/problem/46

(fn flip [f]
  (fn [a b]
    (f b a)))

(= 3 ((flip nth) 2 [1 2 3 4 5]))
(= true ((flip >) 7 8))
(= 4 ((flip quot) 2 8))
(= [1 2 3] ((flip take) [1 2 3 4 5] 3))
