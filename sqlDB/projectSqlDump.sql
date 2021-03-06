CREATE TABLE STOCK(
stockID varchar2(6) primary key,
mnfDate date,
expDate date,
quantityBought number(10),
quantityAvailable number(10),
productID references product(productID)
);



Insert All
into stock values('A124','12-Jan-19','13-Feb-22',90,475,'P011')
into stock values('A125','13-Jan-20','23-Feb-24',50,90000,'P012')
into stock values('A126','23-Mar-20','13-Jul-22',45,700,'P013')
into stock values('A127','12-Jan-21','13-Feb-24',50,900,'P014')
into stock values('B014','22-Jun-18','24-Mar-20',0,45,'P015')
into stock values('D144','11-Jan-18','10-Feb-24',0,10000,'P016')
into stock values('F224','25-Dec-19','13-Apr-22',100,145,'P017')
into stock values('F124','17-Mar-18','31-Jul-22',25,60,'P018')
into stock values('G234','22-Oct-20','13-Mar-22',20,485,'P019')
into stock values('G987','12-Oct-19','13-Mar-22',0,987,'P020')
into stock values('G122','16-Dec-19','13-Jul-22',25,5,'P021')
select * from dual;







create table product(
productID varchar2(6) primary key,
productName varchar2(20),
productPrice number(8)
);


insert all
into product values('P011','Eggs',6)
into product values('P012','Honey',65)
into product values('P013','Lays',10)
into product values('P014','Cheetos',20)
into product values('P015','Kurkure',5)
into product values('P016','Celebrations',100)
into product values('P017','Eclairs',1)
into product values('P018','Coca-cola',12.50)
into product values('P019','Aloo Bhujia',10)
into product values('P020','Amul Cool',12)
into product values('P021','KitKat',10)
select * from dual;








create table placedOrder(
OrderID varchar2(6) primary key,
OrderDate date,
status varchar2(10),
custID references CUSTOMER(custID)
);



insert all
into placedOrder values('OD11','02-Jan-21','Shipped','C01')
into placedOrder values('OD12','17-Jan-21','Ordered','C02')
into placedOrder values('OD13','22-Jan-21','Ordered','C03')
into placedOrder values('OD14','14-Jan-21','Delivered','C04')
into placedOrder values('OD15','02-Jan-21','Shipped','C05')
select * from dual;






create table OrderProdDetails(
orderID references placedOrder(orderID),
productID references product(productID),
qauntity number(5),
primary key(orderID,productID)
);


insert all
into OrderProdDetails values('OD11','P011',25)
into OrderProdDetails values('OD11','P012',50)
into OrderProdDetails values('OD11','P014',50)
into OrderProdDetails values('OD12','P011',65)
into OrderProdDetails values('OD12','P017',100)
into OrderProdDetails values('OD13','P013',45)
into OrderProdDetails values('OD14','P018',25)
into OrderProdDetails values('OD14','P021',25)
into OrderProdDetails values('OD15','P019',20)
select * from dual;








create table customer(
custID varchar2(5),
custName varchar2(20),
custEmail varchar2(30),
custAddress varchar2(50)
);


 
insert all
into customer values('C01','Michael Scott','scott.michael@gmail.com','260 Charter Street Mission, KS 66202')
into customer values('C02','Jeffrey T. Williams','jtwilliams@gmail.com','160 Jones AvenueGreensboro, KS 66202')
into customer values('C03','Judith Lewis','lewisj@gmail.com','1164 Brooklyn Street Eugene, OR 97402')
into customer values('C04','Robin Williams','rwilliams@rediffmail.com','4659 Bridge Avenue Lafayette, LA 70503')
into customer values('C05','Martha Eastwood','meastwood@yahoo.com','4276 Karen Lane Eminence, KY 40019')
select * from dual;


