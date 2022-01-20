create database if not exists DB_Recipe;

use DB_Recipe;


CREATE TABLE IF NOT EXISTS user(
	id INT auto_increment,
    email VARCHAR(30) NOT NULL UNIQUE,
    password VARCHAR(30) NOT NULL,
    status INT,
	fullname NVARCHAR(50),
    DOB DATE,
    avatar VARCHAR(255),
    primary key(id)
);

CREATE TABLE IF NOT EXISTS recipe(
	id INT auto_increment,
    iduser INT NOT NULL,
    idchude INT NOT NULL,
    idtheloai INT NOT NULL,
    ten NVARCHAR(255) NOT NULL UNIQUE,
    mota NVARCHAR(1000) NOT NULL,
    nguyenlieu NVARCHAR(1000) NOT NULL,
    hinhanh VARCHAR(255) NOT NULL,
	luotthich INT,
    tgdang DATE NOT NULL,
    tgthuchien INT NOT NULL,
    
    PRIMARY KEY(id)
);
CREATE TABLE IF NOT EXISTS step(
	id INT auto_increment,
    buoc INT,
    idrecipe INT,
    hinhanh VARCHAR(255),
    des NVARCHAR(255) NOT NULL,
    PRIMARY KEY(id)
);
CREATE TABLE IF NOT EXISTS chude(
	id INT auto_increment,
    ten NVARCHAR(255) NOT NULL,
    mota NVARCHAR(500) NOT NULL,
    hinhanh VARCHAR(255) NOT NULL,
   
   PRIMARY KEY(id)
);
CREATE TABLE IF NOT EXISTS chude_theloai(
	idchude INT,
    idtheloai INT,
    PRIMARY KEY(idchude,idtheloai)
);

CREATE TABLE IF NOT EXISTS theloai(
	id INT auto_increment,
    tentheloai NVARCHAR(255),
    PRIMARY KEY(id)
);


CREATE TABLE IF NOT EXISTS event(
	id INT auto_increment,
    iduser INT NOT NULL,
    tenuser NVARCHAR(255),
    ten NVARCHAR(255) NOT NULL,
    mota NVARCHAR(500) NOT NULL,
    tgbatdau DATE NOT NULL,
    tgketthuc DATE NOT NULL,
    soluong INT NOT NULL,
    hinhanh VARCHAR(255) NOT NULL,
    hinhquangcao VARCHAR(255) NOT NULL,
    giaithuong VARCHAR(255) NOT NULL,
    
    PRIMARY KEY(id)
);

CREATE TABLE IF NOT EXISTS comment(
	id INT auto_increment,
    idrecipe INT, 
    iduser INT,
    content NVARCHAR(255),
    ngaydang DATE,
    PRIMARY KEY(id)
);


CREATE TABLE IF NOT EXISTS album_recipe(
	id_user INT,
    recipe_id INT,
    
    PRIMARY KEY(id_user,recipe_id)
);

CREATE TABLE IF NOT EXISTS thamgiaevent(
	iduser INT,
    idevent INT,
    idrecipe INT,
    primary key(idrecipe,idevent)
);

ALTER TABLE album_recipe ADD FOREIGN KEY(id_user) REFERENCES user(id);
ALTER TABLE album_recipe ADD FOREIGN KEY(recipe_id) REFERENCES recipe(id);

ALTER TABLE comment ADD FOREIGN KEY(idrecipe) REFERENCES recipe(id);
ALTER TABLE comment ADD FOREIGN KEY(iduser) REFERENCES user(id);

ALTER TABLE event ADD FOREIGN KEY(iduser) REFERENCES user(id);

ALTER TABLE thamgiaevent ADD FOREIGN KEY(iduser) REFERENCES user(id);
ALTER TABLE thamgiaevent ADD FOREIGN KEY(idevent) REFERENCES event(id);
ALTER TABLE thamgiaevent ADD FOREIGN KEY(idrecipe) REFERENCES recipe(id);

ALTER TABLE recipe ADD FOREIGN KEY(iduser) REFERENCES user(id);

ALTER TABLE step ADD FOREIGN KEY(idrecipe) REFERENCES recipe(id);



ALTER TABLE chude_theloai ADD FOREIGN KEY(idchude) REFERENCES chude(id);
ALTER TABLE chude_theloai ADD FOREIGN KEY(idtheloai) REFERENCES theloai(id);


DELIMITER &&  
CREATE PROCEDURE SP_ThamgiaEvent(IN iduser INT, IN idevent INT, IN idrecipe INT)
BEGIN  
	DECLARE sl INT DEFAULT 0;
    -- Them vao bang thamgiaevent
    INSERT INTO thamgiaevent VALUES(iduser, idevent, idrecipe);
    
    -- Cap nhat lai so luong tham gia
    SET sl = (SELECT soluong FROM event WHERE id = idevent);
    SET sl = sl + 1;
	UPDATE event SET soluong = sl WHERE id = idevent;
END &&  
DELIMITER ;

DELIMITER &&  
CREATE PROCEDURE SP_Tangluotthich(IN id_recipes INT)
BEGIN  
    DECLARE lt INT DEFAULT 0;
    SET lt = (SELECT luotthich FROM recipe WHERE id = id_recipes);
    SET lt = lt + 1;
	UPDATE recipe SET luotthich = lt WHERE id = id_recipes;
END &&  
DELIMITER ;



