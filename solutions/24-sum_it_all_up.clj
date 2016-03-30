; Write a function which returns the sum of a sequence of numbers
;
; http://www.4clojure.com/problem/24

(fn sum [xs]
  (reduce (fn [acc i] (+ acc i)) 0 xs))

(= (sum [1 2 3]) 6)
(= (sum (list 0 -2 5 5)) 8)
(= (sum #{4 2 1}) 7)
(= (sum '(0 0 -1)) -1)
(= (sum '(1 10 3)) 14)
