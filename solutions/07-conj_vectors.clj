; When operating on a Vector, the conj function will return a
; new vector with one or more items  "added" to the end.
;
; http://www.4clojure.com/problem/7

(def solution [1 2 3 4])
(= solution (conj  [1 2 3] 4))
(= solution (conj  [1 2] 3 4))
