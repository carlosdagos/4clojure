; Write a function which returns the first X fibonacci numbers.
;
; http://www.4clojure.com/problem/26

(fn fib [n]
  (take n ((fn rfib [a b] 
             (lazy-seq (cons a (rfib b (+ a b))))) 
           1 1)))

(= (fib 3) '(1 1 2))
(= (fib 6) '(1 1 2 3 5 8))
(= (fib 8) '(1 1 2 3 5 8 13 21))
