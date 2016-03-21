; The rest function will return all the items of a sequence except the first.
;
; http://www.4clojure.com/problem/13

(def solution [20 30 40])
(= solution (rest  [10 20 30 40]))
