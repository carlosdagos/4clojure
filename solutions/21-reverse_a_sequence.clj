; Write a function which reverses a sequence.
;
; http://www.4clojure.com/problem/23

(fn reverse-seq [xs]
  (#(into () %) xs))

(= (reverse-seq [2 2 3 4 5])  [5 4 3 2 1])
(= (reverse-seq (sorted-set 5 7 2 7)) '(7 5 2))
(= (reverse-seq [[1 2] [3 4] [5 6]])  [[5 6] [3 4] [1 2]])
