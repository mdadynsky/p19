insert into user (username, password, phone)
values ('admin', 'admin', '+12345678900');
insert into user (username, password, phone)
values ('user', 'pass', '+72345670000');
insert into user (username, password)
values ('admin2', 'admin');
insert into user (username, password)
values ('user2', 'pass');
insert into user (username, password)
values ('admin3', 'admin');
insert into user (username, password)
values ('user3', 'pass');


insert into category (category)
values ('Для мужчин');
insert into category (category)
values ('Для женщин');
insert into category (category)
values ('Для детей');

insert into promo (promoName, promoDescription, promoPrice)
values ('Кубик Рубика', 'Классическая головоломка, которую можно решить дома или в дороге.', '450.00 руб.');
insert into promo (promoName, promoDescription, promoPrice)
values ('Настольная игра "Штука"', 'Объясни. Найди. Схвати!', '1699.00 руб.');
insert into promo (promoName, promoDescription, promoPrice)
values ('Игрушка-антистресс', 'Мягкая игрушка, которую можно сжимать, растягивать и подбрасывать.', '240.00 руб.');


insert into banner (name)
values ('подарок со смыслом');
insert into banner (name)
 values ('супер скидки');
insert into banner (name)
values ('свет мой зеркальце');


insert into delivery (companyName)
values ('Почта России');
insert into delivery (companyName)
values ('ПЭК');
insert into delivery (companyName)
values ('DHL');
insert into delivery (companyName)
values ('СДЭК');
insert into delivery (companyName)
values ('Boxberry');

insert into producer (producerName, producerCountry)
values ('Экивоки', 'Россия');
insert into producer (producerName, producerCountry)
values ('QiYi', 'Китай');
insert into producer (producerName, producerCountry)
values ('Pinito', 'Китай');

insert into product(productName, productAge,productType,productProducer,productCost)
values ( 'Кубик рубика','+6','Головоломка','Qiyi',4100 );
insert into product(productName, productAge,productType,productProducer,productCost)
values ( 'Монополия','+6','Семейные','Pinito',2500 );
