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

insert into points (pointsName, pointsDescription, pointsPrice)
values ('Новокузнецк', 'проспект Металлургов 21', '1500.00 руб.');
insert into points (pointsName, pointsDescription, pointsPrice)
values ('Новокузнецк', 'ул. Бардина 14', '900.00 руб.');
insert into points (pointsName, pointsDescription, pointsPrice)
values ('Новокузнецк', 'ул. Кутузова 34', '1100.00 руб.');

insert into promo (promoName, promoDescription, promoPrice)
values ('Кубик Рубика', 'Классическая головоломка, которую можно решить дома или в дороге.', '450.00 руб.');
insert into promo (promoName, promoDescription, promoPrice)
values ('Настольная игра "Штука"', 'Объясни. Найди. Схвати!', '1699.00 руб.');
insert into promo (promoName, promoDescription, promoPrice)
values ('Игрушка-антистресс', 'Мягкая игрушка, которую можно сжимать, растягивать и подбрасывать.', '240.00 руб.');

insert into promotion (promotionName, promotionDescription, promotionPrice)
values ('Пенсионеры', 'Скидка для всех пенсионеров', '30%');
insert into promotion (promotionName, promotionDescription, promotionPrice)
values ('Двоечники', 'Скидка для двоечников колледжей и ВУЗов', '99%');
insert into promotion (promotionName, promotionDescription, promotionPrice)
values ('Инвалиды', 'Скидка для всех инвалидов', '50%');

insert into gift (giftName, giftDescription, giftPrice)
values ('Пенсионеры и ветераны', 'Скидка для всех пенсионеров и ветеранов', '60%');
insert into gift (giftName, giftDescription, giftPrice)
values ('Отличники', 'Скидка для отличников колледжей и ВУЗов', '80%');
insert into gift (giftName, giftDescription, giftPrice)
values ('Инвалиды', 'Скидка для всех инвалидов', '90');

insert into banner (name)
values ('подарок со смыслом');
insert into banner (name)
 values ('супер скидки');
insert into banner (name)
values ('свет мой зеркальце');

insert into tags (tagName)
values ('Игрушки');
insert into tags (tagName)
values ('Хрупкий предмет');
insert into tags (tagName)
values ('Коллекционное издание');

insert into country (countryName)
values ('Россия');
insert into country (countryName)
values ('Украина');
insert into country (countryName)
values ('Беларусь');
insert into country (countryName)
values ('США');
insert into country (countryName)
values ('Япония');


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

insert into product(productName, productType,productProducer,productCost)
values ( 'Кубик рубика','Головоломка','Qiyi',4100 );
insert into product(productName, productAge,productType,productProducer,productCost)
values ( 'Монополия','6','Семейные','Pinito',2500 );
insert into product(productName, productAge,productType,productProducer,productCost)
values ( 'Самокат 1','10','Самокаты','AccesStyle',34100 );
insert into product(productName, productAge, productType, productProducer, productCost)
values ('Самокат 2', '16', 'Самокаты', 'Halten', 24100);
insert into product(productName, productAge, productType, productProducer, productCost)
values ('Самокат 3', '16', 'Самокаты', 'Kugoo', 54100);
insert into product(productName, productAge, productType, productProducer, productCost)
values ('Самокат 4', '16', 'Самокаты', 'Novatrack', 64100);
insert into product(productName, productAge, productType, productProducer, productCost)
values ('Самокат 5', '16', 'Самокаты', 'Reactive', 74100);
insert into product(productName, productAge, productType, productProducer, productCost)
values ('Самокат 6', '16', 'Самокаты', 'Thunderbird', 75100);

insert into city (cityName, cityRegion, cityWarehouses)
values ('Новокузнецк', 'Кемеровская область', 1);
insert into city (cityName, cityRegion, cityWarehouses)
values ('Москва', 'Московская область', 7);
insert into city (cityName, cityRegion, cityWarehouses)
values ('Омск', 'Омская область', 2);
