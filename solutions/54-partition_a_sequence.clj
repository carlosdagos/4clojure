; Write a function which returns a sequence of lists of x items each.
; Lists of less than x items should not be returned.
;
; http://www.4clojure.com/problem/54

(fn partition-seq [n xs]
  (if (<= n (count xs))
   (cons (take n xs) (partition-seq n (drop n xs)))))

(= (partition-seq 3 (range 9)) '((0 1 2) (3 4 5) (6 7 8)))
(= (partition-seq 2 (range 8)) '((0 1) (2 3) (4 5) (6 7)))
(= (partition-seq 3 (range 8)) '((0 1 2) (3 4 5)))
