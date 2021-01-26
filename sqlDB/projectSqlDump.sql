CREATE TABLE STOCK(
stockID varchar2(6) primary key,
mnfDate date,
expDate date,
quantityBought number(10),
quantityAvailable number(10)
);



Insert All
into stock values('A124','12-Jan-19','13-Feb-22',90,475)
into stock values('A125','13-Jan-20','23-Feb-24',50,90000)
into stock values('A126','23-Mar-20','13-Jul-22',45,700)
into stock values('A127','12-Jan-21','13-Feb-24',50,900)
into stock values('B014','22-Jun-18','24-Mar-20',0,45)
into stock values('B170','05-Sep-20','20-Nov-22',0,10)
into stock values('D144','11-Jan-18','10-Feb-24',0,10000)
into stock values('F224','25-Dec-19','13-Apr-22',100,145)
into stock values('F124','17-Mar-18','31-Jul-22',25,60)
into stock values('G135','23-May-20','27-Jan-21',0,67)
into stock values('G234','22-Oct-20','13-Mar-22',20,485)
into stock values('G987','12-Oct-19','13-Mar-22',0,987)
into stock values('G122','16-Dec-19','13-Jul-22',25,5)
select * from dual;




create table product(
productID varchar2(6) primary key,
stockID references stock(stockID),
productName varchar2(20),
productPrice number(8,2)
);


insert all
into product values('P011','A124','Eggs',6)
into product values('P012','A125','Honey',65)
into product values('P013','A126','Lays',10)
into product values('P014','A127','Cheetos',20)
into product values('P015','B014','Kurkure',5)
into product values('P016','D144','Celebrations',100)
into product values('P017','F224','Eclairs',1)
into product values('P018','F124','Coca-cola',12.50)
into product values('P019','G234','Aloo Bhujia',10)
into product values('P020','G987','Amul Cool',12)
into product values('P021','G122','KitKat',10)
select * from dual;





create table placedOrder(
OrderID varchar2(6),
OrderDate date,
status varchar2(10),
productID references product(productID),
qauntity number(5),
primary key(OrderID,ProductID)
);



insert all
into placedOrder values('OD11','02-Jan-21','Shipped','P011',25)
into placedOrder values('OD11','02-Jan-21','Delivered','P012',50)
into placedOrder values('OD11','02-Jan-21','Shipped','P014',50)
into placedOrder values('OD12','17-Jan-21','Ordered','P011',65)
into placedOrder values('OD12','22-Jan-21','Ordered','P017',100)
into placedOrder values('OD13','22-Jan-21','Ordered','P013',45)
into placedOrder values('OD14','14-Jan-21','Delivered','P018',25)
into placedOrder values('OD14','15-Jan-21','Shipped','P021',25)
into placedOrder values('OD15','02-Jan-21','Shipped','P019',20)
select * from dual;



create table customer(
custID varchar2(5),
custName varchar2(20),
custEmail varchar2(30),
custAddress varchar2(50),
orderID varchar2(6),
productID varchar2(6),
constraint Fk_B_01 foreign key (orderID,ProductID) references placedOrder(orderID,ProductID)
);

 
insert all
into customer values('C01','Michael Scott','scott.michael@gmail.com','260 Charter Street Mission, KS 66202','OD11','P011')
into customer values('C01','Michael Scott','scott.michael@gmail.com','260 Charter Street Mission, KS 66202','OD11','P012')
into customer values('C01','Michael Scott','scott.michael@gmail.com','260 Charter Street Mission ,  KS 66202','OD11','P014')
into customer values('C02','Jeffrey T. Williams','jtwilliams@gmail.com','160 Jones AvenueGreensboro, KS 66202','OD12','P011')
into customer values('C02','Jeffrey T. Williams','jtwilliams@gmail.com','160 Jones AvenueGreensboro, KS 66202','OD12','P017')
into customer values('C03','Judith Lewis','lewisj@gmail.com','1164 Brooklyn Street Eugene, OR 97402','OD13','P013')
into customer values('C04','Robin Williams','rwilliams@rediffmail.com','4659 Bridge Avenue Lafayette, LA 70503','OD14','P018')
into customer values('C04','Robin Williams','rwilliams@rediffmail.com','4659 Bridge Avenue Lafayette, LA 70503','OD14','P021')
into customer values('C05','Martha Eastwood','meastwood@yahoo.com','4276 Karen Lane Eminence, KY 40019','OD15','P019')
select * from dual;


