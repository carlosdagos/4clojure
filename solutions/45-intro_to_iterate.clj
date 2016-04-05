; The iterate function can be used to produce an infinite lazy sequence.
;
; http://www.4clojure.com/problem/45

(def solution '(1 4 7 10 13))

(= solution (take 5 (iterate #(+ 3 %) 1)))
