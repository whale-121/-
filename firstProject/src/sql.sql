<<<<<<< HEAD
select * from reviews;

delete reviews where review_title = 'test';
=======
select * from MEMBER;

select * from reviews
<<<<<<< HEAD

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