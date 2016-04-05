; Write a function which separates the items of a sequence by an
; arbitrary value.
;
; http://www.4clojure.com/problem/40

(fn interpose-seq [sep xs]
  (drop 1 (interleave (repeat sep) xs)))


(= (interpose-seq 0 [1 2 3]) [1 0 2 0 3])
(= (apply str (interpose-seq ", " ["one" "two" "three"])) "one, two, three")
(= (interpose-seq :z [:a :b :c :d]) [:a :z :b :z :c :z :d])
