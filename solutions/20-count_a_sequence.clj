; Write a function which returns the total number of elements in a sequence.
; 
; http://www.4clojure.com/problem/22

(fn count-elems [xs]
  (if (empty? xs) 0 
    (+ 1 (count-elems (rest xs)))))


(= (count-elems '(1 2 3 3 1)) 5)
(= (count-elems "Hello World") 11)
(= (count-elems [[1 2]  [3 4]  [5 6]]) 3)
(= (count-elems '(13)) 1)
(= (count-elems '(:a :b :c)) 3)

; Could be more efficient with 'recur', but that would have to be
; at the tail position
