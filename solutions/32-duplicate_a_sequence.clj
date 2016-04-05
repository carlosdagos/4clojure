; Wrhite a function which duplicates each element of a sequence
;
; http://www.4clojure.com/problem/32

(fn duplicate-sequence [xs]
  (apply concat (map #(repeat 2 %) xs)))

(= (duplicate-sequence [1 2 3]) '(1 1 2 2 3 3))
(= (duplicate-sequence [:a :a :b :b]) '(:a :a :a :a :b :b :b :b))
(= (duplicate-sequence [[1 2]  [3 4]]) '([1 2]  [1 2]  [3 4]  [3 4]))
(= (duplicate-sequence [[1 2]  [3 4]]) '([1 2]  [1 2]  [3 4]  [3 4]))
