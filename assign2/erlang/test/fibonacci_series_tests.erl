-module(fibonacci_series_tests).

-include_lib("eunit/include/eunit.hrl").

recursive_fibinacci_with_0_test() ->
    ?assertEqual([1], fibonacci_series:recursive_fibonacci(0)).
	
recursive_fibinacci_with_1_test() ->
    ?assertEqual([1, 1], fibonacci_series:recursive_fibonacci(1)).
	
recursive_fibinacci_with_2_test() ->
    ?assertEqual([1, 1, 2], fibonacci_series:recursive_fibonacci(2)).
	
recursive_fibinacci_with_3_test() ->
    ?assertEqual([1, 1, 2, 3], fibonacci_series:recursive_fibonacci(3)).
	
recursive_fibinacci_with_5_test() ->
    ?assertEqual([1, 1, 2, 3, 5, 8], fibonacci_series:recursive_fibonacci(5)).
	
recursive_fibinacci_with_10_test() ->
    ?assertEqual([1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89], fibonacci_series:recursive_fibonacci(10)).

	
tail_recursive_fibinacci_with_0_test() ->
    ?assertEqual([1], fibonacci_series:tail_recursive_fibonacci(0)).
	
tail_recursive_fibinacci_with_1_test() ->
    ?assertEqual([1, 1], fibonacci_series:tail_recursive_fibonacci(1)).
	
tail_recursive_fibinacci_with_2_test() ->
    ?assertEqual([1, 1, 2], fibonacci_series:tail_recursive_fibonacci(2)).
	
tail_recursive_fibinacci_with_3_test() ->
    ?assertEqual([1, 1, 2, 3], fibonacci_series:tail_recursive_fibonacci(3)).
	
tail_recursive_fibinacci_with_5_test() ->
    ?assertEqual([1, 1, 2, 3, 5, 8], fibonacci_series:tail_recursive_fibonacci(5)).
	
tail_recursive_fibinacci_with_10_test() ->
    ?assertEqual([1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89], fibonacci_series:tail_recursive_fibonacci(10)).