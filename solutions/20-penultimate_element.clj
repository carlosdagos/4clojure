; Write a function which returns the second to last element from a sequence.
;
; http://www.4clojure.com/problem/20
;
; This one, like the previous one, will throw a function which makes it
; a non-total function

(defn solution [xs]
  (if (<= (count xs) 1)
    (throw (Exception. "list is too small"))
    (nth xs (- (count xs) 2))))

(= (solution (list 1 2 3 4 5)) 4)
(= (solution ["a"  "b"  "c"])  "b")
(= (solution [[1 2]  [3 4]])  [1 2])
