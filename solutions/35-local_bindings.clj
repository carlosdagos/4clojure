; Clojure lets you give local names to values using the special let-form.
;
; http://www.4clojure.com/problem/35

(def solution 7)

(= solution (let [x 5] (+ 2 x)))
(= solution (let [x 3, y 10] (- y x)))
(= solution (let [x 21] (let [y 3] (/ x y))))
