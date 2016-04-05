; Write a function which can rotate a sequence in either direction.
;
; http://www.4clojure.com/problem/44

(fn rotate-sequence [n xs]
  (->> (concat xs xs)
       (drop (mod n (count xs)))
       (take (count xs))))

(= (rotate-sequence  2 [1 2 3 4 5]) '(3 4 5 1 2))
(= (rotate-sequence -2 [1 2 3 4 5]) '(4 5 1 2 3))
(= (rotate-sequence  6 [1 2 3 4 5]) '(2 3 4 5 1))
(= (rotate-sequence  1 '(:a :b :c)) '(:b :c :a))
(= (rotate-sequence -4 '(:a :b :c)) '(:c :a :b))
