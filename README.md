# Kullanım Kılavuzu
Bu projeyi Eclipse Ide for Enterprise Java and Web Developer'de geliştirdim.
Bu projeyi oluşturma aşamalarım  
- import/Existing Maven Project  
- Root directory/Browse(start.spring.io sayfasından indirdiğim zip dosyasını seçtim)  
- Projemde com.web.uygulama paketi altında 4 farklı paket oluşturdum. Tüm paketlerin altındaki kodlarımı inceleyebilirsiniz.
Filmleri tek tek kendim MySql içine kaydettim. Yaklaşık 10 tane film var. Daha sonra sql database ni javaya bağladım.
Bağlantıyı localhost:8080 üzerinden yapıyorum. 
# Güncelleme
maven.bat ile uygulama kurulumunu başlatabilirsiniz
uygulama-0.0.1-SNAPSHOT.jar adlı dosya oluştuysa tıklayıp kurulumu bitirebilirsiniz.
## Komutlar  
localhost:8080/uygulama/movies -> tüm filmleri gösterir.  
localhost:8080/uygulama/order-> filmlerin yıllarına göre sıralama yapar  
localhost:8080/uygulama/movies/searchname/***aramayapılacakfilmismi***-> arama yapmak istediğiniz filmin tam ismini girerek filmlere ulaşabilirsiniz.  
localhost:8080/uygulama/movies/searchplayer/***aramayapılacakoyuncuismi***->arama yapmak istediğiniz oyuncunun tam ismini girerek filmlere ulaşabilirsiniz  
localhost:8080/uygulama/movies/searchtype/***aramayapılacakfilmtürü*** ->arama yapmak istediğiniz film türünü yazarak filmlere ulaşabilirsiniz 

## Not: Ekleme silme ve güncelleme işlemlerini postman üzerinden yapabildim. Onların komutları;  
localhost:8080/uygulama/add  
localhost:8080/uygulama/update  
localhost:8080/uygulama/delete

## Mysql baglantısı
jdbc:mysql://localhost:3306/?user=root  
root@localhost:3306
### password=12345678
### login name=root
### Hostname: 127.0.0.1
### port: 3306  
## Filmler
| Name                      | Year  |Type |Media              |Language|Player          |Player2         |Player3 |
|:-------:                  | -----:| ---:|-----:             |------:|--------:        |----:          |-------: |
| The Shawshank Redemption  | 1994  |Drama|Frank Darabont    |English|Morgan Freeman   |Tim Robbins    |Bob Gunton|
| The Dark Knight           | 2008  |Action|Christopher Nolan|English|Heath Ledger      |Christian Bale|Gary Oldman|
| The Godfather             |1972   |Mafia|Francis Ford Coppola|English|Marlon Brando   |Al Pacino     |James Caan|
|Fight Club                 | 1999|Thriller|David Fincher       |English|Brad Pitt|Edward Norton|Helena Bonham Carter|
|Inception|2010|Science Fiction|Christopher Nolan|English|Leonardo DiCaprio|Cillion Murphy|Tom Hardy|
|The Matrix|1999|Action|Lilly Wachowski|English|Keanu Reeves|Laurence Fishburne|Carrie-Anne Moss|
|Seven|1995|Crime|David Fincher|English|Brad Pitt|Morgan Freeman|Kevin Spacey|
|Interstellar|2014|Science Fiction|Christopher Nolan|English|Matthew McConaughey|Anne Hathaway|Jessica Chastain|
|Léon|1994|Action|Luc Besson|English|Natalie Portman|Jean Reno|Gary Oldman|
|Memento|2000|Mystery|Christopher Nolan|English|Guy Pearce|Joe Pantoliano|Jorja Fox|
