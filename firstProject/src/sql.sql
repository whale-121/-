
delete reviews where review_title = 'test';
=======
select * from MEMBER;

select * from reviews

select * from favorite;

insert into favorite values (null, '�Ǿ�', (select count(*) from reviews where mem_nn='�Ǿ�'), 'crong');
delete favorite where nickname = '�Ǿ�';

insert into favorite values (null, '����', (select count(*) from reviews where mem_nn='����'), 'crong');
insert into favorite values (null, '����', (select count(*) from reviews where mem_nn='����'), 'crong');
insert into favorite values (null, 'pccccy', (select count(*) from reviews where mem_nn='pccccy'), 'crong');
insert into favorite values (null, '���� ��', (select count(*) from reviews where mem_nn='���� ��'), 'crong');

insert into favorite values (null, '���� ��', (select count(*) from reviews where mem_nn='���� ��'), 'duddnr');

=======
select * from reviews where MEM_NN = '����' order by review_no asc
>>>>>>> refs/remotes/origin/master
>>>>>>> refs/remotes/origin/master

insert into favorite values (null, '����',(select count(*) from reviews where nickname = '����'), 'duddnr');

update member set like_genre = 'ACTION' where id = 'duddnr';

select count(*) from reviews where mem_nn = (select nickname from member where id = 'wldnd' ) and genre = 'ACTION';

select * from reviews;

insert into title values('ACTION','���� 1�� 10�� �̻�', '1���� �����ΰ� �����ΰ�','wldnd');

select count(*) from reviews where mem_nn = (select nickname from member where id = 'wldnd' ) and point = 3


select title
from member
where nickname = (select mem_nn from reviews where review_no = 1);



select * from title where mem_id='wldnd';
				