-module(fibonacci_series).
-export([recursive_fibonacci/1, tail_recursive_fibonacci/1]).

recursive_fibonacci(0) -> [1];
recursive_fibonacci(1) -> [1, 1];
recursive_fibonacci(N) -> 
	Series = recursive_fibonacci(N - 1),
	Series ++ [lists:sum(lists:nthtail(N - 2, Series))].

tail_recursive_fibonacci(0) -> [1];
tail_recursive_fibonacci(N) -> tail_recursive_fibonacci(N, [1, 1]).

tail_recursive_fibonacci(1, Series) -> Series;
tail_recursive_fibonacci(N, Series) -> 
	tail_recursive_fibonacci(N - 1, Series ++ [lists:sum(lists:nthtail(length(Series) - 2, Series))]).



