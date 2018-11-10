module Primes where

primes = filterPrime [2..]
  where
    filterPrime (p:xs) = p : filterPrime [x | x <- xs, x `mod` p /= 0]

foreign export java "@static peterlavalle.eta.Primes.primeN" primeN :: Int -> Int
primeN n = primes !! n
