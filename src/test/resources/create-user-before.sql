delete
from user_role;
delete
from usr;

insert into usr(id, username, password, active)
values (1, 'admin', '$2a$08$YANa9NjBg.mTiFi6.PKau.cM00wyew8eQ3jZaHiDkiLZgRkTUcDZm', true),
       (2, 'mazafaker', '$2a$08$YANa9NjBg.mTiFi6.PKau.cM00wyew8eQ3jZaHiDkiLZgRkTUcDZm', true);

insert into user_role(user_id, roles)
values (1, 'USER'),
       (1, 'ADMIN'),
       (2, 'USER');


