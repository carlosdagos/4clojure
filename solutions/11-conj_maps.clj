; When operating on a map, the conj function returns a new map with one 
; or more key-value pairs  "added".
;
; http://www.4clojure.com/problem/11

(def solution [:b 2])
(= {:a 1, :b 2, :c 3}  (conj  {:a 1} solution [:c 3]))
