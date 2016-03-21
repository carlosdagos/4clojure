; Clojure has many different ways to create functions.
;
; http://www.4clojure.com/problem/14

(def solution 8)
(= solution ((fn add-five  [x]  (+ x 5)) 3))
(= solution ((fn  [x]  (+ x 5)) 3))
(= solution (#(+ % 5) 3))
(= solution ((partial + 5) 3))
