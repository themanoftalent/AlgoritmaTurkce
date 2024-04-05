procedure bubbleSort(A : list of sortable items)
    n = length(A)
    repeat
        swapped = false
        for i = 1 to n-1 inclusive do
            if A[i-1] > A[i] then
                swap A[i-1] and A[i]
                swapped = true
            end if
        end for
        n = n - 1
    until not swapped
end procedure
