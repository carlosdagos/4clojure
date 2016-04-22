; Write a function which behaves like reduce, but returns each intermediate
; value of the reduction. Your function must accept either two or three
; arguments, and the return sequence must be lazy.
;
; http://www.4clojure.com/problem/60

(fn reducts
  ([f init [x & xs]]
   (cons init (lazy-seq (when x (reducts f (f init x) xs)))))
  ([f xs]
   (reducts f (first xs) (rest xs))))

(= (take 5 (reducts + (range))) [0 1 3 6 10])
(= (reducts conj [1] [2 3 4]) [[1] [1 2] [1 2 3] [1 2 3 4]])
(= (last (reducts * 2 [3 4 5])) (reduce * 2 [3 4 5]) 120)
