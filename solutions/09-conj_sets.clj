; When operating on a set, the conj function returns a new set with
; one or more keys  "added".
;
; http://www.4clojure.com/problem/9

(def solution #{1 2 3 4})
(= solution (conj #{1 4 3} 2))

; Note how the order of declared elements doesn't matter in the set
