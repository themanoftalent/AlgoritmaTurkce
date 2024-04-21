Bu algoritmanın amacı, graph üzerindeki bir başlangıç noktasından hedef noktaya en kısa yolu bulmaktır. Bu algoritma ağırlıklı graph üzerinde çalışır. Ağırlıklı graph, her kenera bir ağırlık veya maliyet atandığı zaman oluşur. <br>
Bu algoritmayı Djikstra algoritmasından ayıran en temel özellik, negatif değerli algoritmalar üzerinde de çalışmasıdır. <br><br>
##### İşleyişi şu şekilde özetlenebilir: <br>
1. Başlangıç düğümüne olan uzaklıkları sonsuz olarak tanımlarız, başlagıç düğümünün değeri 0'dır.
2. Tüm kenarları tek tek gezerek, başlangıç düğümünden diğer düğümlere olan tahmini mesafeyi güncelleriz. (Eğer yeni bulunan yol eski yoldan daha kısa ise yeni yolu seçeriz.) Bu işlem tüm kenarlar için tekrar edilir.
3. Bu işleme toplam düğüm sayısı kadar devam ederiz.
4. Son olarak, her düğümün başlangıç düğümüne en kısa mesafesini bulmuş oluruz.
<br><br>
##### Bellman Ford algoritmasında negatif ağırlıkların günlük hayattan örnekleri:
* Şehirler arası yolda bazı yollar kötü durumda olduğu için bu yollar negatif ağırlıklı kenar olarak hesaplanır.
* Elektrik iletim hatlarında belirli bölgelerde direnç yüksek olur. Bu bölgeler kullanılan graph için negatif ağırlıklı kenar olarak tanımlanır.

