# Movie-Reservation-Project
자바 JDBC와 MySQL DB를 연동하여 자바 GUI를 통해 영화를 예매하는 프로그램 제작

[시연 영상입니다(3분이내)](https://www.youtube.com/watch?v=p3Ag17ESiH4)

## 같이 첨부한 jcalendar-1.4와 mysql-connector-j-8.2.0 jar 파일, images 폴더 경로 설정 확인해주세요.
![image](https://github.com/gd-hi/JDBC-Movie-Reservation-Project/assets/148930703/8ccc4655-f8dd-4190-9382-b728353890bb)





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

![image](https://github.com/gd-hi/JDBC-Movie-Reservation-Project/assets/148930703/4dee763f-e9c2-4d35-a8e6-a796c7d1128d)


### Customer
![image](https://github.com/gd-hi/JDBC-Movie-Reservation-Project/assets/148930703/c852fcfb-e385-44e4-8bbb-1d7c635923c4)

### Movie
![image](https://github.com/gd-hi/JDBC-Movie-Reservation-Project/assets/148930703/a1b43aaf-02ea-4f4b-92b9-5b00bb1eedff)

### Seat
![image](https://github.com/gd-hi/JDBC-Movie-Reservation-Project/assets/148930703/98cb09ee-b927-4001-8fc2-180bd73c7b95)

### Theather
![image](https://github.com/gd-hi/JDBC-Movie-Reservation-Project/assets/148930703/44097860-0fab-42a8-8f71-9c772ce013c0)

### Ticket
![image](https://github.com/gd-hi/JDBC-Movie-Reservation-Project/assets/148930703/cb05d440-d1f4-489d-a4c6-b9bf5ffed3ee)

![image](https://github.com/gd-hi/JDBC-Movie-Reservation-Project/assets/148930703/0db452d4-6004-4620-abf6-b801b24ef9a2)

![image](https://github.com/gd-hi/JDBC-Movie-Reservation-Project/assets/148930703/bc2665d3-a26e-43ef-a7b8-cd9d409742b3)

![image](https://github.com/gd-hi/JDBC-Movie-Reservation-Project/assets/148930703/079977b4-fcb6-4868-ba70-1dfc9374e86f)

![image](https://github.com/gd-hi/JDBC-Movie-Reservation-Project/assets/148930703/b0f88652-2d6b-4c11-9be8-58af2798d62f)

![image](https://github.com/gd-hi/JDBC-Movie-Reservation-Project/assets/148930703/629f4f95-1c12-4717-92c1-ce8d2ca83a63)

![image](https://github.com/gd-hi/JDBC-Movie-Reservation-Project/assets/148930703/a278a837-b629-4165-9a29-d472c8c1f777)

![image](https://github.com/gd-hi/JDBC-Movie-Reservation-Project/assets/148930703/af3d70ef-b700-4f9a-a051-35676e8abf85)

![image](https://github.com/gd-hi/JDBC-Movie-Reservation-Project/assets/148930703/4a12d2ad-2ad9-440c-bc4c-e84b9404a0d8)

![image](https://github.com/gd-hi/JDBC-Movie-Reservation-Project/assets/148930703/23e182e2-fdee-4fa5-9c3d-84bd49f6fdf7)

![image](https://github.com/gd-hi/JDBC-Movie-Reservation-Project/assets/148930703/f07d24bb-789f-41fb-922e-bbb2cd26ec1c)

![image](https://github.com/gd-hi/JDBC-Movie-Reservation-Project/assets/148930703/c1e482f2-2e1a-4d12-a9c8-17a5e7c868ac)

![image](https://github.com/gd-hi/JDBC-Movie-Reservation-Project/assets/148930703/78fbd578-86f8-4e4f-a479-29fcc6daea7b)

![image](https://github.com/gd-hi/JDBC-Movie-Reservation-Project/assets/148930703/6a32d485-b5eb-42fd-9db0-777455f4d4d2)

![image](https://github.com/gd-hi/JDBC-Movie-Reservation-Project/assets/148930703/e1820026-c490-413a-9ea4-6db7cc48cabb)

![image](https://github.com/gd-hi/JDBC-Movie-Reservation-Project/assets/148930703/86eed311-0c87-4e7e-9ea6-a39c72a9c508)





