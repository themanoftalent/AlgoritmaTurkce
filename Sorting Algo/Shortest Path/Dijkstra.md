    
    Dijkstra(Graf, BaşlangıçNoktası):
    BaşlangıçNoktası'nın mesafesini 0 olarak ayarla
    Tüm diğer noktaların mesafesini sonsuz olarak ayarla
    İşlenmeyenNoktalar kümesini oluştur ve başlangıç noktasını içine koy
    
    while İşlenmeyenNoktalar kümesi boş değilse:
        Şu ankiNokta = İşlenmemişNoktalar kümesindeki en yakın nokta
        Şu ankiNokta'yı işleme al ve İşlenmemişNoktalar kümesinden kaldır
        
        for Her bir komşuNokta:
            Eğer komşuNokta'nın mesafesi, (Şu ankiNokta'nın mesafesi + aralarındaki mesafe) < komşuNokta'nın mevcut mesafesi ise:
                komşuNokta'nın mesafesini güncelle
                komşuNokta'nın önceki düğümünü Şu ankiNokta olarak ayarla
                Eğer komşuNokta İşlenmemişNoktalar kümesinde değilse, onu İşlenmemişNoktalar kümesine ekle
