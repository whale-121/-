select * from MEMBER;

select * from reviews

select * from favorite;

insert into favorite values (null, '�Ǿ�', (select count(*) from reviews where mem_nn='�Ǿ�'), 'crong');
delete favorite where nickname = '�Ǿ�';

insert into favorite values (null, '����', (select count(*) from reviews where mem_nn='����'), 'crong');
insert into favorite values (null, '����', (select count(*) from reviews where mem_nn='����'), 'crong');
insert into favorite values (null, 'pccccy', (select count(*) from reviews where mem_nn='pccccy'), 'crong');
insert into favorite values (null, '���� ��', (select count(*) from reviews where mem_nn='���� ��'), 'crong');

insert into favorite values (null, '���� ��', (select count(*) from reviews where mem_nn='���� ��'), 'pcccy');

