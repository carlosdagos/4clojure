; Write a function which flattens a sequence.
;
; http://www.4clojure.com/problem/28

(fn flatten-seq [xs]
  (filter (comp not sequential?)
          (tree-seq sequential? seq xs)))

(= (flatten-seq '((1 2) 3  [4  [5 6]])) '(1 2 3 4 5 6)
(= (flatten-seq '((1 2) 3  [4  [5 6]])) '(1 2 3 4 5 6))
(= (flatten-seq ["a"  ["b"]  "c"]) '("a"  "b"  "c"))
(= (flatten-seq '((((:a))))) '(:a))
