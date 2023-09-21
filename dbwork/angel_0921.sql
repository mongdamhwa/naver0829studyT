--2023-09-21 DB 정규화
--DB 정규화(Normalization)
--정규화란? 한마디로 db 서버의 메모리를 낭비하지 않기 위해서
--어떤 테이블을 식별자를 가지는 여러개의 테이블로 나누는 과정을 정규화라 한다
--정규화된 데이타베이스는 중복이 최소화되도록 설계된 데이타베이스이다
--장점 : 메모리를 절약할수 있다. 
--      구조화된 시스템으로 인해서 관리가 편하다
--단점 : 조회비율이 매우 높은 시스템의 경우에는 테이블간의 join 연산이 반복적으로
--       이뤄지기 때문에 질의 응답 속도가 살짝 늦어질수 있다

--student 의 num 을 외부키로 갖는 새로운 테이블 stuinfo 를 만들어보자
--외부키는 테이블 생성시에 설정해도 되고 나중에 설정해도된다

create table stuinfo (
      idx number(5) CONSTRAINT stuinfo_pk_idx primary key,
      num number(5),
      addr varchar2(20),
      hp varchar2(20));

-- student 의 num 을 외부키로 설정(이때 주의: student 의 num 은 반드시 primary key 라야 한다)
--ppt 29페이지에 있음
alter table stuinfo add CONSTRAINT stuinfo_fk_num FOREIGN key(num) references student(num);

--stuinfo 에 데이타를 추가해보자, 없는번호인 9번으로 insert 시 어떤 오류가 나는지 확인필요
-- 오류메세지: 무결성 제약조건(ANGEL.STUINFO_FK_NUM)이 위배되었습니다- 부모 키가 없습니다
--student 테이블이 부모테이블: 거기에 num 9 가 없어서 오류가 나는것
insert into stuinfo values (seq_stu.nextval,9,'서울시 강남구','010-2323-4545');
--만약 김말자의 정보일경우 김말자의 num 이 3 이므로 3으로 추가해야만 한다
insert into stuinfo values (seq_stu.nextval,3,'서울시 강남구','010-2323-4545');
      
      
      
      
      
      
      
      
      
      

