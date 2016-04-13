; Write a function which returns a map containing the number of occurences of
; each distinct item in a sequence.
;
; http://www.4clojure.com/problem/55

(fn freqs [xs]
  (reduce-kv (fn [m k v]
               (assoc m k (count v)))
             {}
             (group-by identity (sort xs))))

(= (freqs [1 1 2 3 2 1 1]) {1 4, 2 2, 3 1})
(= (freqs [:b :a :b :a :b]) {:a 2, :b 3})
(= (freqs '([1 2] [1 3] [1 3])) {[1 2] 1, [1 3] 2})
