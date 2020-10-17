// Scripts 
CREATE TABLE public."CLIENTES"
(
    "idCliente" integer,
    "NombreCliente" character varying(100),,
    "FechaCreacion" date,
    "Estado" "char",
    PRIMARY KEY ("idCliente")
);

ALTER TABLE public."CLIENTES"
    OWNER to postgres;
	
	
	
	CREATE TABLE public."Productos"
(
    "IdProducto" integer,
    "NombreProducto" character varying(100),
    "FechaCreacion" date,
    "Estado" "char",
    PRIMARY KEY ("IdProducto")
);

ALTER TABLE public."Productos"
    OWNER to postgres;
	
	
		CREATE TABLE public."productos_Cliente"
(
    "idCliente" integer,
    "idProducto" integer,
    "fecha_adicion" date
);

ALTER TABLE public."Productos"
    OWNER to postgres;
	
	
	
	
INSERT INTO "CLIENTES" ("idCliente", "NombreCliente", "FechaCreacion", "Estado") VALUES (1,'Julio Rodriguez',CURRENT_DATE,'A');

INSERT INTO "Productos" ("IdProducto", "NombreProducto", "FechaCreacion", "Estado") VALUES (1,'Smartphone',CURRENT_DATE,'A');

INSERT INTO "productos_Cliente"("idCliente", "idProducto", "fecha_adicion")VALUES(1,1,CURRENT_DATE);