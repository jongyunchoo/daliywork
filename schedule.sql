CREATE TABLE  AUTHOR
(
    id bigint primary key comment '아이디',
    name varchar(100) not null comment '이름',
    author_password varchar(100) not null comment '비밀번호',
      foreign key(author_password) references AUTHOR(author_password)
    );



