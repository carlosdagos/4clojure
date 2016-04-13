; Write a function which removes the duplicates from a sequence.
; Order of the items must be maintained.
;
; http://www.4clojure.com/problem/56

(fn uniques [coll]
  ((fn step [[x & xs] acc]
     (when x
       (if (acc x)
         (step xs acc)
         (cons x (step xs (conj acc x))))))
  coll #{}))

(= (uniques [1 2 1 3 1 2 4]) [1 2 3 4])
(= (uniques [:a :a :b :b :c :c]) [:a :b :c])
(= (uniques '([2 4] [1 2] [1 3] [1 3])) '([2 4] [1 2] [1 3]))
(= (uniques (range 50)) (range 50))
