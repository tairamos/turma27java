use db_ecommerce;

Create table tb_produtos(
	id bigint (10) auto_increment,
	nome varchar (20) not null,
    valor decimal (6,0) not null,
    disponibilidade boolean,
    cor varchar (10),
    primary key (id)
    );
    
insert into tb_produtos (nome, valor, disponibilidade, cor) Values ("Celular", 800, true, "Azul");
insert into tb_produtos (nome, valor, disponibilidade, cor) Values ("Gravata", 70, true, "Preto");
insert into tb_produtos (nome, valor, disponibilidade, cor) Values ("Blusa social", 150, false, "Rosa");
insert into tb_produtos (nome, valor, disponibilidade, cor) Values ("Calça social", 250, true, "preto");
insert into tb_produtos (nome, valor, disponibilidade, cor) Values ("Sapato social", 350, false, "Vermelho");

select * from tb_produtos where valor > 500.00;
select * from tb_produtos where valor < 500.00;