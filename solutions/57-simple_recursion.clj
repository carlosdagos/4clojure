; A recursive function is a function which calls itself. This is one of
; the fundamental techniques used in functional programming.
;
; http://www.4clojure.com/problem/57

(def solution '(5 4 3 2 1))

(= solution ((fn foo [x] (when (> x 0) (conj (foo (dec x)) x))) 5))
