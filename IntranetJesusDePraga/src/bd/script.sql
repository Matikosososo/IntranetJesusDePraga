create database intranet_bd; --drop database intranet_bd

use intranet_bd;

create table tipo_de_usuario(
    id int primary key auto_increment,
    nombre varchar(13)     
);

insert into tipo_de_usuario values(null,"profesor");
insert into tipo_de_usuario values(null,"alumno");
insert into tipo_de_usuario values(null,"Admin");


create table usuario(
    id int primary key auto_increment,
    rut varchar(13),
    tipo_de_usuario int,
    contraseña varchar(50),
    foreign key (tipo_de_usuario) references tipo_de_usuario(id)   
);
insert into usuario values(null,'22-2',2,md5('1234'));
insert into usuario values(null, '11-1',1,md5('1234'));
insert into usuario values(null, '00-0',3,md5('1234'));
insert into usuario values(null,'33-3',2,md5('1234'));
select contraseña FROM usuario;



create table profesor(
    id int primary key auto_increment,
    nombre varchar(50),
    rut varchar(13) UNIQUE
);

insert into profesor values(null, 'patito', '11-1');
insert into profesor values(null, 'maria', '00-0');

create table asignatura(
    id int primary key auto_increment,
    nombre varchar(100),
    profesor int,
    foreign key (profesor) references profesor(id)
);

insert into asignatura values(null, 'Programacion', 1);
insert into asignatura values(null, 'Arquitectura de Software', 1);

create table alumno(
    id int primary key auto_increment,
    nombre varchar(50),
    rut varchar(13) UNIQUE,
    asignatura_fk int,
    foreign key(asignatura_fk) references asignatura(id)
    
);

insert into alumno values(null, 'vero', '22-2',1);
insert into alumno values(null, 'Mati', '33-3',2);

create table nota(
    id int primary key auto_increment,
    asignatura int,
    alumno_fk int,
    nota float,
    foreign key(alumno_fk) references alumno(id),
    ponderacion float,
    foreign key(asignatura) references asignatura(id)
);



Create table horario(
    id int primary key auto_increment,
    asignatura_fk int,
    alumno_fk int,
    foreign key(alumno_fk) references alumno(id),
    foreign key(asignatura_fk) references asignatura(id),
    dia datetime,
    cantidad_horas float
);

Create table observacion(
    id int primary key auto_increment,
    alumno_fk int,
    asignatura_fk int,
    comentario varchar(5000),
    foreign key(alumno_fk) references alumno(id),
    foreign key(asignatura_fk) references asignatura(id)
);

create table asistencia(
    id int primary key auto_increment,
    alumno_fk int,
    asignatura_fk int,
    foreign key(asignatura_fk) references asignatura(id),
    foreign key(alumno_fk) references alumno (id),
    fecha date
);
/*
select * from alumno
select * from asignatura
select * from profesor

Select * from usuario where rut = '11-1'

Select * from usuario where rut LIKE '%22-2%'

Select * from alumno where asignatura_fk = 1

update usuario set contraseña = md5('1234') where id =3

*/