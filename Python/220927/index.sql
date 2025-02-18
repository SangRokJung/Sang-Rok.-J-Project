CREATE [UNIQUE | FULLTEXT | SPATIAL] INDEX index_name
	[index_type]
    ON tbl_name (key_part, ...)
    [index_option]
    [algorithm_option | lock_option] ...
    
key_part :
	{col_name [(length) | (expr)] [ASC | DESC]
    
index_option :
	KEY_BLOCK_SIZE [=] value
  | index_type
  | WITH PARSER parser_name
  | COMMENT 'string'
  | {VISIBLE | INVISIBLE}

index_type :
	USING {BTREE | HASH}

algorithm_option : 
	ALGORITHM [=] {DEFAULT | INPLACE | COPY}

lock_option :
	LOCK [=] {DEFAULT | NONE | SHARED | EXCLUSIVE}

DROP INDEX index_name ON tbl_name
	[algorithm_option | lock_option] ...

algorithm_option :
	ALGORITHM [=] {DEFAULT | INPLACE | COPY}
    
lock_option :
	LOCK [=] {DEFAULT | NONE | SHARED | EXCLUSIVE}