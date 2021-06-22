-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 07-Jun-2021 às 18:42
-- Versão do servidor: 10.4.19-MariaDB
-- versão do PHP: 8.0.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `bdeleicoes`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `candidato`
--

CREATE TABLE `candidato` (
  `can_numero` int(11) NOT NULL,
  `can_nome` varchar(60) DEFAULT NULL,
  `can_vice` varchar(60) DEFAULT NULL,
  `can_partido` varchar(10) DEFAULT NULL,
  `can_foto` varchar(20) DEFAULT NULL,
  `can_fotovice` varchar(20) DEFAULT NULL,
  `can_votos` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `candidato`
--

INSERT INTO `candidato` (`can_numero`, `can_nome`, `can_vice`, `can_partido`, `can_foto`, `can_fotovice`, `can_votos`) VALUES
(0, 'Nulos', NULL, NULL, NULL, NULL, 1),
(13, 'Lular', 'Gabriel Freitas', 'PT', 'lular.jpg', 'freitas.jpg', 0),
(17, 'Jair Borsonaro', 'Copa América', 'PSL', 'borsonaro.jpg', 'cpamerica.jpg', 0),
(18, 'Marina Silva', 'Natureza', 'REDE', 'marina.jpg', 'natureza.jpg', 0),
(50, 'Cabo Dacilolo', 'Repitiliano', 'PATRI', 'dacilolo.jpg', 'repitiliano.jpg', 0);

-- --------------------------------------------------------

--
-- Estrutura da tabela `eleitor`
--

CREATE TABLE `eleitor` (
  `ele_titulo` varchar(20) NOT NULL,
  `ele_rg` varchar(20) DEFAULT NULL,
  `ele_nome` varchar(60) DEFAULT NULL,
  `ele_dataNasc` varchar(10) DEFAULT NULL,
  `ele_zona` varchar(4) DEFAULT NULL,
  `ele_secao` varchar(4) DEFAULT NULL,
  `ele_votou` varchar(1) DEFAULT NULL,
  `ele_foto` varchar(20) DEFAULT NULL,
  `ele_cidade` varchar(40) DEFAULT NULL,
  `ele_estado` varchar(2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `eleitor`
--

INSERT INTO `eleitor` (`ele_titulo`, `ele_rg`, `ele_nome`, `ele_dataNasc`, `ele_zona`, `ele_secao`, `ele_votou`, `ele_foto`, `ele_cidade`, `ele_estado`) VALUES
('1', '21.711.866-5', 'Marcos Vinicius Elias Duarte', '24/01/1981', '298', '0083', 'S', 'f1.png', 'Bragança Paulista', 'SP'),
('10', '54.056.520-9', 'Karine Geronimo de Lemos', '19/05/1946', '298', '0083', 'N', 'f10.png', 'Bragança Paulista', 'SP'),
('11', '25.875.324-9', 'Isabel Heloise das Neves', '24/12/1963', '298', '0083', 'N', 'f11.png', 'Bragança Paulista', 'SP'),
('12', '19.544.691-4', 'Fernanda Stefany Isabelle Corte Real', '19/05/1945', '298', '0083', 'N', 'f12.png', 'Bragança Paulista', 'SP'),
('13', '48.456.552-7', 'Lorenzo Erick Baptista', '25/10/1953', '298', '0083', 'N', 'f13.png', 'Bragança Paulista', 'SP'),
('14', '47.668.380-4', 'Clarice Olivia Tânia da Rosa', '22/08/1998', '298', '0083', 'N', 'f14.png', 'Bragança Paulista', 'SP'),
('15', '33.958.318-6', 'Emanuelly Maitê Silva', '10/07/1992', '298', '0083', 'N', 'f15.png', 'Bragança Paulista', 'SP'),
('2', '30.534.312-9', 'Augusto Lorenzo Murilo Santos', '17/01/1971', '298', '0083', 'N', 'f2.png', 'Bragança Paulista', 'SP'),
('3', '32.750.462-6', 'Anderson Otávio Galvão', '18/11/1999', '298', '0083', 'N', 'f3.png', 'Bragança Paulista', 'SP'),
('4', '48.377.932-5', 'Marcela Laura Daiane Peixoto', '14/10/1978', '298', '0083', 'N', 'f4.png', 'Bragança Paulista', 'SP'),
('5', '26.810.090-1', 'Emanuel Osvaldo Cauê Barbosa', '13/09/1966', '298', '0083', 'N', 'f5.png', 'Bragança Paulista', 'SP'),
('6', '18.688.153-8', 'Mário Breno Assis', '02/04/1975', '298', '0083', 'N', 'f6.png', 'Bragança Paulista', 'SP'),
('7', '31.564.921-5', 'Isabelle Antonella Raquel Pires', '18/11/1958', '298', '0083', 'N', 'f7.png', 'Bragança Paulista', 'SP'),
('8', '19.437.690-4', 'Sarah Débora Maitê Aragão', '23/05/1989', '298', '0083', 'N', 'f8.png', 'Bragança Paulista', 'SP'),
('9', '27.872.608-2', 'Milena Sara Bárbara Cardoso', '26/11/1986', '298', '0083', 'N', 'f9.png', 'Bragança Paulista', 'SP');

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `candidato`
--
ALTER TABLE `candidato`
  ADD PRIMARY KEY (`can_numero`);

--
-- Índices para tabela `eleitor`
--
ALTER TABLE `eleitor`
  ADD PRIMARY KEY (`ele_titulo`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
