# 테이블 조회
show tables; -- 전체 테이블 조회
select * from test01; -- test01 조회
desc test01; -- 테이블 구조 확인

-- insert
insert into test01 (name,age) values ('kim',40);
-- num 에 null 값을 주면 null 이 들어가는게 아니라 auto 숫자가 발생된다
insert into test01 values (null,'son',26,189.9,now(),'2023-01-01');

-- 테이블 구조 변경(add ,drop column,modify, rename column)
alter table test01 add hp varchar(20) default '010-111-1111'; -- 컬럼 추가
alter table test01 drop column age;-- age 컬럼 제거
alter table test01 rename column birthday to birth; -- 컬럼명 수정

-- 테이블명 변경이됨  test01을 member 로 변경
alter table test01 rename member;

-- sawon 테이블 생성-제약조건들도 추가하기
create table sawon (
              num smallint auto_increment,
              name varchar(20),
              score smallint,
              gender varchar(10),
              buseo varchar(10),
              constraint pk_sawon_num primary key(num),
  		constraint ck_sawon_score check (score between 0 and 100),
 		constraint ck_sawon_gender check (gender in ('여자','남자')));
        
 desc sawon;    
 -- sawon 의 제약조건들 확인하기
 select * from information_schema.table_constraints where table_name='sawon';
 
 -- 데이타 추가
 insert into sawon values (null,'이하나',89,'여자','홍보부');
 -- 제약 조건 오류 확인하기
 -- Error Code: 3819. Check constraint 'ck_sawon_score' is violated.
insert into sawon values (null,'이두나',120,'여자','홍보부');
-- Error Code: 3819. Check constraint 'ck_sawon_gender' is violated.
insert into sawon values (null,'이두나',120,'여','홍보부');

-- 제대로 된 데이타 각자 7개 정도 추가
 insert into sawon values (null,'강호동',90,'남자','인사부');
insert into sawon values (null,'한가인',67,'여자','교육부');
insert into sawon values (null,'오연수',79,'여자','홍보부');
insert into sawon values (null,'손지창',99,'남자','인사부');
insert into sawon values (null,'손호준',100,'남자','교육부');
insert into sawon values (null,'이서진',87,'남자','인사부');
insert into sawon values (null,'광수',74,'남자','홍보부');
insert into sawon values (null,'이이랑',97,'남자','인사부');

-- select limit 
select * from sawon order by name;
select * from sawon order by name limit 0,3; -- 0(첫글)번부터 3개 조회
select * from sawon order by name limit 3,3; -- 3번부터 3개
   
-- 문자함수들 연습
select concat('Hello','Kitty','!!') from dual;
-- sawon 의 name 에서 '이' 를 포함한 데이타 조회
select * from sawon where name like concat('%','이','%');
select replace('Happy Day!!','Happy','Nice') from dual;-- Happy 를 Nice 로 변경해서 출력
select instr('Happy Day','Day') from dual; -- 7 : Day 의 위치찾기 (1부터)
select instr('Happy Day','Hello') from dual; -- 없을경우 0

-- 추출
select left('Have a Nice Day',4) from dual; -- 왼쪽에서 4글자 추출 : Have
select right('Have a Nice Day',8) from dual; -- 오른쪽에서 8글자 추출 : Nice Day
select mid('Have a Nice Day',6,6) from dual; -- 왼쪽에서 4글자 추출 :6번부터 6글자 : a Nice
select substring('Have a Nice Day',6,6) from dual; -- 왼쪽에서 4글자 추출 :6번부터 6글자 : a Nice

-- 공백제거
select ltrim('    Hello    ') from dual; -- 왼쪽 공백 제거
select rtrim('    Hello    ') from dual; -- 오른쪽 공백 제거
select trim('    Hello    ') from dual; -- 양쪽 공백 제거

-- 대소문자 변환
select lcase('Happy') from dual; -- 소문자
select lower('Happy') from dual; -- 소문자
select ucase('Happy') from dual; -- 대문자
select upper('Happy') from dual; -- 대문자

select reverse('Happy') from dual; -- 거꾸로














