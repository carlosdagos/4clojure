; Maps store key-value pairs. Both maps and keywords can be used as 
; lookup functions. Commas can be used to make maps more readable, 
; but they are not required.
;
; http://www.4clojure.com/problem/10

(def solution 20)
(= solution ((hash-map :a 20, :b 20, :c 30) :b))
(= solution (:b {:a 10, :b 20, :c 30}))
