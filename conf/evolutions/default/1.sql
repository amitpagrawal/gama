# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table book (
  book_id                   bigint auto_increment not null,
  topic_id                  bigint,
  id                        varchar(255),
  title                     varchar(255),
  small_image               varchar(255),
  big_image                 varchar(255),
  link                      varchar(255),
  rating                    double,
  author_name               varchar(255),
  constraint pk_book primary key (book_id))
;

create table topic (
  id                        bigint auto_increment not null,
  name                      varchar(255),
  description               varchar(255),
  url                       varchar(255),
  constraint pk_topic primary key (id))
;




# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table book;

drop table topic;

SET FOREIGN_KEY_CHECKS=1;

