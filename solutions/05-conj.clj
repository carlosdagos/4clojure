; When operating on a list, the conj function will return a new
; list with one or more items  "added" to the front.
;
; http://www.4clojure.com/problem/5

(def solution '(1 2 3 4))
(= solution (conj '(2 3 4) 1))
(= solution (conj '(3 4) 2 1))
