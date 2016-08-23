# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table person (
  id                            integer auto_increment not null,
  name                          varchar(255),
  email                         varchar(255),
  password                      varchar(255),
  constraint pk_person primary key (id)
);

create table product (
  id                            bigint auto_increment not null,
  name                          varchar(255),
  price                         integer,
  location                      varchar(255),
  constraint pk_product primary key (id)
);


# --- !Downs

drop table if exists person;

drop table if exists product;

