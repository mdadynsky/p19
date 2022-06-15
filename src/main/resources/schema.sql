drop table if exists user;

create table user
(
    id       int auto_increment primary key,
    username varchar(250) not null,
    password varchar(250) not null,
    phone varchar(20) null
);
create table tags
(
    id       int auto_increment primary key,
    tagName varchar(250) not null
);
create table category
(
    id       int auto_increment primary key,
    category varchar(250) not null
);

create table points
(
    id       int auto_increment primary key,
    points   varchar(250) not null
);

create table promo
(
    id               int auto_increment primary key,
    promoName        varchar(250) not null,
    promoDescription varchar(250) not null,
    promoPrice       varchar(250) not null
);

create table country
(
    id               int auto_increment primary key,
    countryName      varchar(250) not null
);

create table delivery
(
    id               int auto_increment primary key,
    companyName      varchar(250) not null
);

create table producer
(
    id               int auto_increment primary key,
    producerName     varchar(250) not null,
    producerCountry  varchar(250) not null
);

create table product
(
    id              int auto_increment primary key,
    productName     varchar(250) not null,
    productAge      varchar(250) null,
    productType     varchar(250) not null,
    productProducer varchar(250) not null,
    productCost     double       not null,
    rating          int null,
    ratingCount     int null
);

create table banner
(
    id   int auto_increment primary key,
    name varchar(250) not null
);

create table city
(
    id             int auto_increment primary key,
    cityName       varchar(250) not null,
    cityRegion     varchar(250) not null,
    cityWarehouses int          not null
);