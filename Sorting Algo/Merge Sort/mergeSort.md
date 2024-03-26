## MergeSort(dizi[])
    - Eğer dizi uzunluğu <= 1 ise
        - Diziyi zaten sıralı kabul et, sıralama gerekmez
    - solDizi = dizi'nin sol yarısı
    - sağDizi = dizi'nin sağ yarısı
    - MergeSort(solDizi)  // Sol yarıyı sıralamak için MergeSort'u tekrar çağır
    - MergeSort(sağDizi)  // Sağ yarıyı sıralamak için MergeSort'u tekrar çağır
    - birleştir(solDizi, sağDizi, dizi)  // Sıralı alt dizileri birleştir
    
## birleştir(solDizi[], sağDizi[], dizi[])
    - solIndex = 0  // Sol dizinin indeksi
    - sağIndex = 0  // Sağ dizinin indeksi
    - diziIndex = 0  // Birleştirilmiş dizinin indeksi
    
    - while solIndex < solDizi.length ve sağIndex < sağDizi.length yap
        - Eğer solDizi[solIndex] < sağDizi[sağIndex] ise
            - dizi[diziIndex] = solDizi[solIndex]  // Sol diziden eleman al
            - solIndex artır
        - değilse
            - dizi[diziIndex] = sağDizi[sağIndex]  // Sağ diziden eleman al
            - sağIndex artır
        - diziIndex artır
    
    - kalan elemanları kopyala (solDizi'nin kalanı)
    - while solIndex < solDizi.length yap
        - dizi[diziIndex] = solDizi[solIndex]  // Sol dizide kalan elemanları kopyala
        - solIndex artır
        - diziIndex artır
    
    - kalan elemanları kopyala (sağDizi'nin kalanı)
    - while sağIndex < sağDizi.length yap
        - dizi[diziIndex] = sağDizi[sağIndex]  // Sağ dizide kalan elemanları kopyala
        - sağIndex artır
        - diziIndex artır
