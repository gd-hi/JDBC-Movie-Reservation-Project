# Movie-Reservation-Project
자바 JDBC와 MySQL DB를 연동하여 자바 GUI를 통해 영화를 예매하는 프로그램 제작

[시연 영상입니다(3분이내)](https://www.youtube.com/watch?v=p3Ag17ESiH4)

## 같이 첨부한 jcalendar-1.4와 mysql-connector-j-8.2.0 jar 파일, images 폴더 경로 설정 확인해주세요.
![image](https://github.com/gd-hi/Movie-Reservation-Project/assets/148930703/c1d04253-0f35-4422-a5c5-37139dbbf45d)




## MySQL

```sql
INSERT INTO movie.movie (moviename, movieenglishname, agelimit, time, imgsrc) VALUES ('서울의봄', '12.12: The Day', '12세 이상 관람가', 141, 'images/1212THEDAY.jpg');
INSERT INTO movie.movie (moviename, movieenglishname, agelimit, time, imgsrc) VALUES ('범죄도시3', 'THE ROUNDUP : NO WAY OUT', '15세 이상 관람가', 105, 'images/THEROUNDUPNOWAYOUT.jpg');
INSERT INTO movie.movie (moviename, movieenglishname, agelimit, time, imgsrc) VALUES ('엘리멘탈', 'Elemental', '전체 관람가', 109, 'images/Elemental.jpg');
INSERT INTO movie.movie (moviename, movieenglishname, agelimit, time, imgsrc) VALUES ('스즈메의 문단속', 'Suzume', '12세 이상 관람가', 122, 'images/Suzume.jpg');
INSERT INTO movie.movie (moviename, movieenglishname, agelimit, time, imgsrc) VALUES ('밀수', 'Smugglers', '15세 이상 관람가', 129, 'images/Smugglers.jpg');
INSERT INTO movie.movie (moviename, movieenglishname, agelimit, time, imgsrc) VALUES ('더 퍼스트 슬램덩크', 'THEFIRSTSLAMDUNK', '12세 이상 관람가', 107, 'images/THEFIRSTSLAMDUNK.jpg');
INSERT INTO movie.movie (moviename, movieenglishname, agelimit, time, imgsrc) VALUES ('가디언즈 오브 갤럭시 3', 'Guardians Galaxy', '12세 이상 관람가', 150, 'images/Guardians.jpg');
INSERT INTO movie.movie (moviename, movieenglishname, agelimit, time, imgsrc) VALUES ('미션 임파서블 데드 레코닝', 'Mission', '15세 이상 관람가', 163, 'images/Mission.jpg');
INSERT INTO movie.movie (moviename, movieenglishname, agelimit, time, imgsrc) VALUES ('콘크리트 유토피아', 'Concrete Utopia', '15세 이상 관람가', 130, 'images/ConcreteUtopia.jpg');
INSERT INTO movie.movie (moviename, movieenglishname, agelimit, time, imgsrc) VALUES ('오펜하이머', 'Oppenheimer', '15세 이상 관람가', 180, 'images/Oppenheimer.jpg');
```

### Customer
![image](https://github.com/gd-hi/Movie-Reservation-Project/assets/148930703/db1dc842-fa60-4851-a368-7133d1754fe5)

### Movie
![image](https://github.com/gd-hi/Movie-Reservation-Project/assets/148930703/85faf4de-5d7d-43c7-9fcc-271bfe2321e0)

### Seat
![image](https://github.com/gd-hi/Movie-Reservation-Project/assets/148930703/5e72759c-7ef2-43f1-a00b-9ef4dee16353)

### Theather
![image](https://github.com/gd-hi/Movie-Reservation-Project/assets/148930703/51c11f6b-345c-4c0d-b54b-765daade8e91)

### Ticket
![image](https://github.com/gd-hi/Movie-Reservation-Project/assets/148930703/98e2a819-b8ad-4559-8e3d-d6a6555de4d8)

![image](https://github.com/gd-hi/Movie-Reservation-Project/assets/148930703/b9082e69-fd63-4b5b-a299-4bc5e223a0bc)

![image](https://github.com/gd-hi/Movie-Reservation-Project/assets/148930703/ad67ea04-2366-4a02-a5b3-d53bc6b977d9)

![image](https://github.com/gd-hi/Movie-Reservation-Project/assets/148930703/1bb6003f-bba3-486f-aae6-8bdfff0a62d1)

![image](https://github.com/gd-hi/Movie-Reservation-Project/assets/148930703/af24de9c-1547-4d6b-9e5f-814ef4d5943e)

![image](https://github.com/gd-hi/Movie-Reservation-Project/assets/148930703/9436f278-1feb-40bf-8d67-4b1c86fd28d0)

![image](https://github.com/gd-hi/Movie-Reservation-Project/assets/148930703/09797d59-2719-42e4-b940-8c967456f861)

![image](https://github.com/gd-hi/Movie-Reservation-Project/assets/148930703/5c47a1dc-124a-4fb1-a2a7-bc76772ba774)

![image](https://github.com/gd-hi/Movie-Reservation-Project/assets/148930703/1ec30656-7fc1-4c1b-a67b-fa00138bf18d)

![image](https://github.com/gd-hi/Movie-Reservation-Project/assets/148930703/0cba21b9-443b-4d91-af52-e6a63e9a65d4)


