; Write a function which removes consecutive duplicates from a sequence.
;
; http://www.4clojure.com/problem/30

(fn remove-seq-dups [xs]
  (map first (partition-by identity xs)))

(= (apply str (remove-seq-dups "Leeeeeerrroyyy"))  "Leroy")
(= (remove-seq-dups [1 1 2 3 3 2 2 3]) '(1 2 3 2 3))
(= (remove-seq-dups [[1 2]  [1 2]  [3 4]  [1 2]]) '([1 2]  [3 4]  [1 2]))
