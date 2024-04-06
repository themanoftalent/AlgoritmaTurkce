procedure insertionSort(A : list of sortable items)
    n = length(A)
    for i = 1 to n-1 do
        key = A[i]
        j = i - 1
        // Move elements of A[0..i-1], that are greater than key, to one position ahead of their current position
        while j >= 0 and A[j] > key do
            A[j + 1] = A[j]
            j = j - 1
        end while
        A[j + 1] = key
    end for
end procedure
