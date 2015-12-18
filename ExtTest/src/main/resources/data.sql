

CREATE TABLE IF NOT EXISTS item_mst (
 item_id INT NOT NULL PRIMARY KEY,
 item_name CHAR(100),
 item_expire_date CHAR(10),
 price FLOAT(20),
 version INT,
 delete_flag boolean
);