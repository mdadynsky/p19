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
    id               int auto_increment primary key,
    pointsName        varchar(250) not null,
    pointsDescription varchar(250) not null,
    pointsPrice       varchar(250) not null
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

create table promotion
(
    id               int auto_increment primary key,
    promotionName        varchar(250) not null,
    promotionDescription varchar(250) not null,
    promotionPrice       varchar(250) not null
);

create table gift
(
    id               int auto_increment primary key,
    giftName        varchar(250) not null,
    giftDescription varchar(250) not null,
    giftPrice       varchar(250) not null
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

create table level
(
    id                                int auto_increment primary key,
    levelName                         varchar(250) not null,
    levelTotalAmountOfPurchases       int          not null
);

create table promoCode
(
    id                  int auto_increment primary key,
    promoCodeName       varchar(250) not null,
    promoCodeDiscount   int          not null,
    promoCodeNumbers    varchar(250) not null
);