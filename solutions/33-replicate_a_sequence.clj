; Write a function which replicates each element of a sequence a
; variable number of times.
;
; http://www.4clojure.com/problem/33

(fn replicate-sequence [xs n]
  (apply concat (map #(repeat n %) xs)))

(= (replicate-sequence [1 2 3] 2) '(1 1 2 2 3 3))
(= (replicate-sequence [:a :b] 4) '(:a :a :a :a :b :b :b :b))
(= (replicate-sequence [4 5 6] 1) '(4 5 6))
(= (replicate-sequence [[1 2]  [3 4]] 2) '([1 2]  [1 2]  [3 4]  [3 4]))
(= (replicate-sequence [44 33] 2)  [44 44 33 33])
