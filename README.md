# REYSEN BİLETAL - Ulaşım Rezervasyon Sistemi

Bu proje, **Kocaeli Üniversitesi Bilgisayar Mühendisliği Programlama Laboratuvarı II** dersi kapsamında geliştirilmiştir[cite: 65, 68]. [cite_start]Java Swing kullanılarak tasarlanan uygulama, kullanıcıların kara, hava ve demir yolu ulaşım türleri için bilet rezervasyonu yapabilmelerini sağlayan kapsamlı bir sistemdir[cite: 77, 79, 81].

## 🚀 Proje Özellikleri

Sistem üç ana panelden oluşmaktadır: **Admin**, **Firma** ve **Bilet Al**.

* **Ulaşım Türleri:** Karayolu, havayolu ve demiryolu üzerinden seyahat imkanı.
* **Admin Paneli:**
    * Sistemdeki mevcut firmaları görüntüleme.
    * Yeni firma ekleme ve mevcut firmaları silme.
    * Sabit hizmet bedeli belirleme.
* **Firma Paneli:**
    * Firmaya özel kullanıcı adı ve şifre ile giriş.
    * Firmaya ait araçların ve seferlerin yönetimi.
    * Yeni araç ekleme veya mevcut araçları sistemden kaldırma.
* **Bilet Al Paneli:**
    * 4-10 Aralık tarihleri arasında sefer arama.
    * Kalkış/varış noktası ve tarih seçimine göre dinamik sefer listeleme.
    * Araca özel koltuk kapasitesine göre interaktif koltuk seçimi.
    * Yolcu bilgilerinin alınması ve ödeme simülasyonu.

## 🛠 Kullanılan Teknolojiler

* **Dil:** Java 
* **Arayüz Tasarımı:** Java Swing & JFrame 
* **Geliştirme Ortamı (IDE):** NetBeans 
* **Veri Yapıları:** Dinamik veri yönetimi için ArrayList yapıları kullanılmıştır.

## 🧠 Uygulanan Yaklaşımlar

* **Nesne Yönelimli Programlama (NYP):** Proje tamamen sınıflar (classes) üzerine inşa edilmiştir.
* **Get-Set Metotları:** Veri kapsülleme kurallarına uygun olarak getter ve setter metotları kullanılmıştır.
* **Dinamik Arayüz:** Araçların koltuk sayılarına göre değişkenlik gösteren dinamik JFrame yapıları oluşturulmuştur.
* **Hata Yönetimi:** Yanlış girişlerde veya dolu koltuk seçimlerinde kullanıcıya `JOptionPane` ile uyarı mesajları gösterilmektedir.

## 👥 Geliştiriciler

* **Sena KÖSEOĞLU** 
* **Reyhan KURTULMUŞ** 
