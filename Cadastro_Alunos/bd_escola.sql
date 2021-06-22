-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 15-Maio-2021 às 04:12
-- Versão do servidor: 10.4.14-MariaDB
-- versão do PHP: 7.4.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `bd_escola`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `aluno`
--

CREATE TABLE `aluno` (
  `alu_id` int(10) NOT NULL,
  `alu_ra` varchar(15) NOT NULL,
  `alu_cpf` varchar(14) NOT NULL,
  `alu_rg` varchar(14) NOT NULL,
  `alu_nome` varchar(60) NOT NULL,
  `alu_dtnascimento` varchar(10) NOT NULL,
  `alu_email` varchar(60) NOT NULL,
  `alu_email2` varchar(60) NOT NULL,
  `alu_dddtel` varchar(2) NOT NULL,
  `alu_telefone` varchar(20) NOT NULL,
  `alu_dddcel` varchar(2) NOT NULL,
  `alu_celular` varchar(20) NOT NULL,
  `alu_cep` varchar(9) NOT NULL,
  `alu_rua` varchar(60) NOT NULL,
  `alu_numero` int(4) NOT NULL,
  `alu_bairro` varchar(30) NOT NULL,
  `alu_cidade` varchar(30) NOT NULL,
  `alu_uf` varchar(2) NOT NULL,
  `alu_observ` varchar(120) NOT NULL,
  `alu_dtcadastro` varchar(10) NOT NULL,
  `alu_situacao` varchar(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `aluno`
--
ALTER TABLE `aluno`
  ADD PRIMARY KEY (`alu_id`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `aluno`
--
ALTER TABLE `aluno`
  MODIFY `alu_id` int(10) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
