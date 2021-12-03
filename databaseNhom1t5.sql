Create database CmsNhom5;
use CmsNhom5;

create table member(
	id int primary key AUTO_INCREMENT,
    firstname varchar(200),
    lastname varchar(200),
    username varchar(200) unique,
    password varchar(200),
    phone varchar(200),
    email varchar(200) unique,
    description text,
    createddate datetime DEFAULT NULL,
    updatetime datetime DEFAULT NULL
);

create table content(
	id int primary key auto_increment,
    title varchar(1000) not null,
    brief varchar(1000) not null,
    content text not null,
    createdate datetime default NULL,
    updatetime datetime default NULL,
    authorid int,
    CONSTRAINT lien_ket_01 FOREIGN KEY (authorid) REFERENCES member(id)
);