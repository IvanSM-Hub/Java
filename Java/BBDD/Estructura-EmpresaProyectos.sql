CREATE DATABASE EmpresaProyectos;
USE EmpresaProyectos;
CREATE TABLE departamentos (
    id_depart INT NOT NULL PRIMARY KEY,
    nombre VARCHAR(45),
    direccion VARCHAR(45)
);

CREATE TABLE perfiles (
    id_perfil INT NOT NULL PRIMARY KEY,
    nombre VARCHAR(45)
);

CREATE TABLE clientes (
    cif varchar(10) NOT NULL PRIMARY KEY,
    nombre VARCHAR(45),
    apellidos VARCHAR(45),
    domicilio varchar(100),
    facturacion_anual decimal(15,2),
    numero_empleados int
);

CREATE TABLE empleados (
	id_empl int not null primary key,
    nombre varchar(20),
    apellidos varchar(45),
    email varchar(100),
    password varchar(45),
    salario decimal(9,2),
    fecha_ingreso DATE,
    fecha_nacimiento DATE,
    id_perfil int,
    id_depart int,
    foreign key (id_perfil) references perfiles(id_perfil) on delete cascade on update cascade,
    foreign key (id_depart) references departamentos(id_depart) on delete cascade on update cascade
);

CREATE TABLE proyectos (
	id_proyecto int not null primary key,
    descripcion varchar(45),
    fecha_inicio DATE,
    fecha_fin_previsto DATE,
    fecha_fin_real DATE,
    venta_previsto decimal,
    costes_previsto decimal,
    coste_real decimal,
    estado varchar(15),
    jefe_proyecto int,
    cif varchar(10),
    foreign key (jefe_proyecto) references empleados(id_empl) on delete cascade on update cascade,
    foreign key (cif) references clientes(cif) on delete cascade on update cascade
);

CREATE TABLE facturas (
    id_factura INT NOT NULL PRIMARY KEY,
    descripcion VARCHAR(45),
    id_proyecto int,
    foreign key (id_proyecto) references proyectos(id_proyecto) on delete cascade on update cascade
);

CREATE TABLE proyecto_con_empleados (
	numero_orden int not null primary key,
    id_proyecto int,
    id_empl int,
    horas_asignadas int,
    fecha_incorporacion DATE,
    foreign key (id_proyecto) references proyectos(id_proyecto) on delete cascade on update cascade,
    foreign key (id_empl) references empleados(id_empl) on delete cascade on update cascade
);
commit;