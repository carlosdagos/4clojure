; All Clojure collections support sequencing. You can operate on
; sequences with functions like first, second, and last.
;
; http://www.4clojure.com/problem/12

(def solution 3)
(= solution (first '(3 2 1)))
(= solution (second [2 3 4]))
(= solution (last (list 1 2 3)))
