; Vectors can be constructed several ways. You can compare them with lists.
;
; http://www.4clojure.com/problem/6

(def solution [:a :b :c])
(= solution (list :a :b :c) (vec '(:a :b :c)) (vector :a :b :c))
