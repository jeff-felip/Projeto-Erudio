CREATE TABLE public.person (
	id int8 NOT NULL,
    fist_name varchar(80) NOT NULL,
    last_name varchar(80) NOT NULL,
	address varchar(100) NOT NULL,
	gender varchar(6) NOT NULL,
	CONSTRAINT person_pkey PRIMARY KEY (id)
);