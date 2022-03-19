insert into user (username, password)
values ('admin', 'admin');
insert into user (username, password)
values ('user', 'pass');

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