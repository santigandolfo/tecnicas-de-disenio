(ns exercise3)

(defn fibonacci
	"Fibonacci element on that position."
	[x]
	(cond 
		(= x 0) 0
		(= x 1) 1
		:else (+ (fibonacci(- x 1)) (fibonacci(- x 2)))
	)
)




