alter table purchase_item_table
	add order_id int;

alter table purchase_item_table
	add constraint purchase_item_table_order_table_id_fk
		foreign key (order_id) references order_table;

alter table order_table drop constraint order_table_purchase_item_table_id_fk;

alter table order_table drop column purchase_item_id;



