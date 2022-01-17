--1. 회원가입한 정보를 저장할 수 있는 'web_member'테이블을 만드시오.
--   컬럼명 : m_email / m_pw / m_tel / m_address

-- drop 
drop table web_member cascade constraint 
drop table web_message cascade constraint
drop sequence num_seq;


--create
create table web_member(
   M_email varchar(50),
   M_pw varchar(50) not null, 
   M_tel varchar(50) not null,  
   M_address varchar(50) not null,
 constraint pk_web_member primary key(M_email)
 );

 create table web_message(
   m_num number,
   m_sendName varchar(50) not null,
   m_recieveEmail varchar(50) not null, 
   m_content varchar(200) not null,  
   m_sendDate date not null,
 constraint web_message_pk primary key(m_num)
 );
 
 create sequence num_seq 
 increment by 1 
 start with 1
 nocache;
 
 --select
select * from web_member
select * from web_message

select tel, address from web_member where email= '1' and pw ='1';

--insert
 insert into web_message values(num_seq.nextval, 'test', '1','test1 : text1 ',sysdate);
 
 
 