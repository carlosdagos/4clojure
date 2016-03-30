; Write a function which packs consecutive duplicates into sub-lists
;
; http://www.4clojure.com/problem/31

(fn pack-dups [xs]
  (partition-by identity xs))

(= (pack-dups [1 1 2 1 1 1 3 3]) '((1 1)  (2)  (1 1 1)  (3 3)))
(= (pack-dups [:a :a :b :b :c]) '((:a :a)  (:b :b)  (:c)))
(= (pack-dups [[1 2]  [1 2]  [3 4]]) '(([1 2]  [1 2])  ([3 4])))
