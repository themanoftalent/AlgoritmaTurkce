MERGE(A, p, q, r) 
n₁ ← q - p + 1 
n₂ ← r - q 
L[1..n₁+1] ve R[1..n₂+1] dizilerini oluştur 
i ← 1'den n₁'e kadar 
L[i] ← A[p + i - 1] 
j ← 1'den n₂'ye kadar 
R[j] ← A[q + j] 
L[n₁+1] ← ∞ 
R[n₂+1] ← ∞ 
i ← 1 
j ← 1 
k ← p 
while k ≤ r do 
if L[i] < R[j] then 
A[k] ← L[i] 
i ← i + 1 
 else 
A[k] ← R[j] 
j ← j + 1
k ← k + 1
![image](https://github.com/themanoftalent/AlgoritmaTurkce/assets/17935050/938d0eb0-6b3e-45d3-adcd-17c4b6b60578)
