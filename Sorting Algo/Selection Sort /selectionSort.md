procedure selectionSort(A : list of sortable items)
    n = length(A)
    for i = 0 to n-2 do
        minIndex = i
        for j = i+1 to n-1 do
            if A[j] < A[minIndex] then
                minIndex = j
            end if
        end for
        // Swap the found minimum element with the first unsorted element
        swap A[i] and A[minIndex]
    end for
end procedure
