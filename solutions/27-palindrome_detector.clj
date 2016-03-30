; Write a function which returns true if the given sequence is a
; palindrome
;
; http://www.4clojure.com/problem/27

(fn is-palindrome? [xs]
  (= (#(into '() %) xs) (seq xs)))

(false?  (is-palindrome? '(1 2 3 4 5)))
(true?  (is-palindrome? "racecar"))
(true?  (is-palindrome? [:foo :bar :foo]))
(true?  (is-palindrome? '(1 1 3 3 1 1)))
(false?  (is-palindrome? '(:a :b :c)))
