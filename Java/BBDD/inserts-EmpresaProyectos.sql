USE EmpresaProyectos;
SET FOREIGN_KEY_CHECKS=0;
INSERT INTO departamentos (id_depart,nombre,direccion)
VALUES
	(1,"Ventas","Avenida Comercial, 234"),
	(2,"Recursos Humanos","Calle del Empleado, 123"),
	(3,"Producción","Carretera Industrial, 456"),
	(4,"Contabilidad","Plaza Financiera, 789"),
	(5,"Desarrollo","Calle Tecnológica, 678");

INSERT INTO perfiles (id_perfil,nombre)
VALUES
	(1,"Administrador"),
	(2,"Usuario Estándar"),
	(3,"Gerente"),
	(4,"Analista"),
	(5,"Visitante"),
	(6,"Jefe de Proyecto");

INSERT INTO clientes (cif,nombre,apellidos,domicilio,facturacion_anual,numero_empleados)
VALUES
	("1234567890","Empresa A","García","Calle Principal, 123",1500000.00,50),
	("9876543210","Empresa B","Martínez","Avenida Secundaria, 456",750000.50,20),
	("5678901234","Empresa C","López","Plaza Central, 789",300000.75,15);

INSERT INTO empleados (id_empl, nombre, apellidos, email, password, salario, fecha_ingreso, fecha_nacimiento, id_perfil, id_depart)
VALUES
    (1, 'Juan', 'Pérez', 'juan@example.com', 'clave123', 50000.00, '2022-01-15', '1990-05-10', 1, 3),
    (2, 'María', 'López', 'maria@example.com', 'contraseña456', 60000.00, '2021-08-10', '1988-12-20', 2, 4),
    (3, 'Carlos', 'García', 'carlos@example.com', 'pwd789', 75000.00, '2022-03-20', '1985-02-15', 3, 2),
    (4, 'Laura', 'Rodríguez', 'laura@example.com', 'secure123', 55000.00, '2023-02-05', '1995-09-30', 6, 5),
    (5, 'Pedro', 'Martínez', 'pedro@example.com', 'clave123', 48000.00, '2022-06-18', '1992-07-12', 5, 1),
    (6, 'Ana', 'Fernández', 'ana@example.com', 'contraseña456', 65000.00, '2020-11-30', '1987-04-25', 1, 3),
    (7, 'Luis', 'Sánchez', 'luis@example.com', 'pwd789', 72000.00, '2021-03-10', '1991-10-08', 2, 4),
    (8, 'Elena', 'Ramírez', 'elena@example.com', 'secure123', 51000.00, '2023-04-22', '1993-06-05', 3, 2),
    (9, 'Andrés', 'Díaz', 'andres@example.com', 'clave123', 49000.00, '2022-08-27', '1994-01-18', 4, 5),
    (10, 'Isabel', 'Gómez', 'isabel@example.com', 'contraseña456', 67000.00, '2020-12-05', '1986-08-02', 5, 1);
    
INSERT INTO proyectos (id_proyecto,descripcion,fecha_inicio,fecha_fin_previsto,fecha_fin_real,venta_previsto,costes_previsto,coste_real,estado,jefe_proyecto,cif)
VALUES
	(1, 'Proyecto A', '2022-02-10', '2022-09-30', '2022-10-15', 150000.00, 100000.00, 110000.00, 'Finalizado', 1, '1234567890'),
    (2, 'Proyecto B', '2022-06-20', '2022-12-15', NULL, 220000.00, 180000.00, NULL, 'En Progreso', 3, '9876543210'),
    (3, 'Proyecto C', '2023-01-05', '2023-07-31', NULL, 90000.00, 60000.00, NULL, 'Planificado', 5, '5678901234'),
    (4, 'Proyecto D', '2023-03-15', '2023-11-30', NULL, 350000.00, 280000.00, NULL, 'En Progreso', 2, '1122334455'),
    (5, 'Proyecto E', '2023-09-08', '2024-04-15', NULL, 180000.00, 150000.00, NULL, 'Planificado', 4, '2233445566');

INSERT INTO facturas (id_factura,descripcion,id_proyecto)
VALUES
	(1, 'Factura 001', 1),
    (2, 'Factura 002', 3),
    (3, 'Factura 003', 2),
    (4, 'Factura 004', 4),
    (5, 'Factura 005', 5);
    
INSERT INTO proyecto_con_empleados (numero_orden,id_proyecto,id_empl,horas_asignadas,fecha_incorporacion)
VALUES
	(1, 1, 1, 120, '2022-02-10'),
    (2, 2, 3, 80, '2022-06-20'),
    (3, 3, 5, 100, '2023-01-05'),
    (4, 4, 2, 150, '2023-03-15'),
    (5, 5, 4, 90, '2023-09-08'),
    (6, 1, 6, 110, '2022-02-15'),
    (7, 2, 7, 70, '2022-07-05'),
    (8, 3, 9, 120, '2023-01-15'),
    (9, 4, 10, 130, '2023-04-01'),
    (10, 5, 8, 80, '2023-09-15');
commit;
SET FOREIGN_KEY_CHECKS=0;
commit;