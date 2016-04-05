; Write a function which drops every Nth item from a sequence.
;
; http://www.4clojure.com/problem/41

(fn drop-every-nth [xs n]
  (vec (keep-indexed #(if (not (= 0 (mod (+ 1 %1) n))) %2) xs)))

(= (drop-every-nth [1 2 3 4 5 6 7 8] 3) [1 2 4 5 7 8])
(= (drop-every-nth [:a :b :c :d :e :f] 2) [:a :c :e])
(= (drop-every-nth [1 2 3 4 5 6] 4) [1 2 3 5 6])

