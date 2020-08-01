
delete reviews where review_title = 'test';
=======
select * from MEMBER;

select * from reviews

select * from favorite;

insert into favorite values (null, '¾Ç¾î', (select count(*) from reviews where mem_nn='¾Ç¾î'), 'crong');
delete favorite where nickname = '¾Ç¾î';

insert into favorite values (null, '¾ÓÆÎ', (select count(*) from reviews where mem_nn='¾ÓÆÎ'), 'crong');
insert into favorite values (null, 'Àü¾²', (select count(*) from reviews where mem_nn='Àü¾²'), 'crong');
insert into favorite values (null, 'pccccy', (select count(*) from reviews where mem_nn='pccccy'), 'crong');
insert into favorite values (null, '±×Àú ºû', (select count(*) from reviews where mem_nn='±×Àú ºû'), 'crong');

insert into favorite values (null, '±×Àú ºû', (select count(*) from reviews where mem_nn='±×Àú ºû'), 'duddnr');

=======
select * from reviews where MEM_NN = '¾ÓÆÎ' order by review_no asc
>>>>>>> refs/remotes/origin/master
>>>>>>> refs/remotes/origin/master

insert into favorite values (null, '¾ÓÆÎ',(select count(*) from reviews where nickname = '¾ÓÆÎ'), 'duddnr');

update member set like_genre = 'ACTION' where id = 'duddnr';

select count(*) from reviews where mem_nn = (select nickname from member where id = 'wldnd' ) and genre = 'ACTION';

select * from reviews;

insert into title values('ACTION','ÆòÁ¡ 1Á¡ 10°³ ÀÌ»ó', '1Á¡Àº ÆòÁ¡ÀÎ°¡ ¼ýÀÚÀÎ°¡','wldnd');

select count(*) from reviews where mem_nn = (select nickname from member where id = 'wldnd' ) and point = 3


select title
from member
where nickname = (select mem_nn from reviews where review_no = 1);



select * from title where mem_id='wldnd';
				