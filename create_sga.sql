CREATE SCHEMA `db_sga` ;

CREATE TABLE IF NOT EXISTS `db_sga`.`usuario` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `cpf` VARCHAR(255) NULL DEFAULT NULL,
  `data_nascimento` DATETIME NULL DEFAULT NULL,
  `endereco` VARCHAR(255) NULL DEFAULT NULL,
  `login` VARCHAR(255) NULL DEFAULT NULL,
  `role` VARCHAR(255) NULL DEFAULT NULL,
  `senha` VARCHAR(255) NULL DEFAULT NULL,
  `telefone` VARCHAR(255) NULL DEFAULT NULL,
  PRIMARY KEY (`id`))
ENGINE = MyISAM
DEFAULT CHARACTER SET = latin1;

CREATE TABLE IF NOT EXISTS `db_sga`.`procedimento` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `descricao` VARCHAR(255) NULL DEFAULT NULL,
  `titulo` VARCHAR(255) NULL DEFAULT NULL,
  `valor_sugerido` DOUBLE NULL DEFAULT NULL,
  PRIMARY KEY (`id`))
ENGINE = MyISAM
DEFAULT CHARACTER SET = latin1;

CREATE TABLE IF NOT EXISTS `db_sga`.`horario_disponivel` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `data_final` DATETIME NULL DEFAULT NULL,
  `data_inicial` DATETIME NULL DEFAULT NULL,
  `descricao` VARCHAR(255) NULL DEFAULT NULL,
  `titulo` VARCHAR(255) NULL DEFAULT NULL,
  `usuario_id` BIGINT(20) NOT NULL,
  `procedimento_id` BIGINT(20) NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_horario_disponivel_usuario_idx` (`usuario_id` ASC),
  INDEX `fk_horario_disponivel_procedimento_idx` (`procedimento_id` ASC))
ENGINE = MyISAM
DEFAULT CHARACTER SET = latin1;

CREATE TABLE IF NOT EXISTS `db_sga`.`horario_agendado` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `data_final` DATETIME NULL DEFAULT NULL,
  `data_inicial` DATETIME NULL DEFAULT NULL,
  `descricao` VARCHAR(255) NULL DEFAULT NULL,
  `pago` BIT(1) NULL DEFAULT NULL,
  `realizado` BIT(1) NULL DEFAULT NULL,
  `titulo` VARCHAR(255) NULL DEFAULT NULL,
  `valor` DOUBLE NULL DEFAULT NULL,
  `usuario_id` BIGINT(20) NOT NULL,
  `procedimento_id` BIGINT(20) NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_horario_agendado_usuario_idx` (`usuario_id` ASC),
  INDEX `fk_horario_agendado_procedimento_idx` (`procedimento_id` ASC))
ENGINE = MyISAM
DEFAULT CHARACTER SET = latin1;

CREATE TABLE IF NOT EXISTS `db_sga`.`receita` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `data` DATETIME NULL DEFAULT NULL,
  `descricao` VARCHAR(255) NULL DEFAULT NULL,
  `titulo` VARCHAR(255) NULL DEFAULT NULL,
  `valor` DOUBLE NULL DEFAULT NULL,
  `usuario_id` BIGINT(20) NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_receita_usuario_idx` (`usuario_id` ASC))
ENGINE = MyISAM
DEFAULT CHARACTER SET = latin1;

CREATE TABLE IF NOT EXISTS `db_sga`.`despesa` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `data` DATETIME NULL DEFAULT NULL,
  `descricao` VARCHAR(255) NULL DEFAULT NULL,
  `titulo` VARCHAR(255) NULL DEFAULT NULL,
  `valor` DOUBLE NULL DEFAULT NULL,
  `usuario_id` BIGINT(20) NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_despesa_usuario_idx` (`usuario_id` ASC))
ENGINE = MyISAM
DEFAULT CHARACTER SET = latin1;
