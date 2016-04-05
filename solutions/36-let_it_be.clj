; bind x, y, and z so that these are all true
;
; http://www.4clojure.com/problem/36

(def solution [x 7, y 3, z 1])

(= 10 (let solution (+ x y)))
(= 4  (let solution (+ y z)))
(= 1  (let solution z))
