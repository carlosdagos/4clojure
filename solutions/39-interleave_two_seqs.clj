; Write a function which takes two sequences and returns the first item
; from each, then the second item from each, then the third, etc.
;
; http://www.4clojure.com/problem/39

(fn interleave-seqs [xs ys]
  (mapcat vector xs ys))

(= (interleave-seqs [1 2 3] [:a :b :c]) '(1 :a 2 :b 3 :c))
(= (interleave-seqs [1 2] [3 4 5 6]) '(1 3 2 4))
(= (interleave-seqs [1 2 3 4] [5]) [1 5])
(= (interleave-seqs [30 20] [25 15]) [30 25 20 15])
