-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 19-11-2023 a las 17:33:06
-- Versión del servidor: 10.1.25-MariaDB
-- Versión de PHP: 5.6.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bdbanco`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbcliente`
--

CREATE TABLE `tbcliente` (
  `rut` varchar(10) NOT NULL,
  `nombre` varchar(25) NOT NULL,
  `edad` int(3) NOT NULL,
  `telefono` int(9) NOT NULL,
  `saldo` int(12) NOT NULL,
  `numCuenta` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tbcliente`
--

INSERT INTO `tbcliente` (`rut`, `nombre`, `edad`, `telefono`, `saldo`, `numCuenta`) VALUES
('14432109-K', 'Jaime', 45, 978901234, 950000, '78901234'),
('16876543-1', 'Michael', 40, 956789012, 800000, '34567890'),
('17224574-1', 'Pedro', 36, 954879455, 4500000, '22789888'),
('17554488-3', 'Maria', 35, 958583471, 4160000, '77618913'),
('17765432-8', 'Sofia', 35, 923456789, 600000, '45678901'),
('18321098-7', 'Olivia', 32, 945678901, 750000, '89012345'),
('19109876-3', 'Charlotte', 26, 923456780, 650000, '34561278'),
('19210987-6', 'William', 29, 967890123, 550000, '90123456'),
('19543210-3', 'Emma', 28, 934567890, 900000, '67890123'),
('19987654-2', 'Alice', 30, 912345678, 700000, '23456789'),
('20654321-5', 'David', 22, 965432189, 400000, '56789012'),
('20789487-K', 'Juana', 23, 978495784, 132000, '47851488'),
('5918377-8', 'Gloria', 78, 944781991, 35000000, '14578248');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbtrabajador`
--

CREATE TABLE `tbtrabajador` (
  `rut` varchar(10) NOT NULL,
  `nombre` varchar(25) NOT NULL,
  `edad` int(3) NOT NULL,
  `telefono` int(9) NOT NULL,
  `sueldoBase` int(7) NOT NULL,
  `cargo` varchar(16) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tbtrabajador`
--

INSERT INTO `tbtrabajador` (`rut`, `nombre`, `edad`, `telefono`, `sueldoBase`, `cargo`) VALUES
('12432109-K', 'Andres', 55, 978900000, 1400000, 'Gerente'),
('13876543-1', 'Daniel', 50, 956780123, 1300000, 'Gerente'),
('14765432-8', 'Maria', 45, 923456700, 1100000, 'Cajero'),
('15221098-7', 'Amanda', 42, 945678000, 1200000, 'Cajero'),
('16120987-6', 'Mateo', 39, 967890000, 1000000, 'Analista'),
('16182345-9', 'Jose', 40, 947526933, 850000, 'Gerente'),
('16543210-3', 'Jessica', 38, 934567800, 1100000, 'Ejecutivo'),
('16987654-2', 'Linda', 40, 912345600, 1200000, 'Ejecutivo'),
('17019876-3', 'Samantha', 36, 923456700, 1100000, 'Ejecutivo'),
('17553366-4', 'Roberto', 35, 947112233, 1000000, 'Analista'),
('18654321-5', 'Christopher', 32, 965400000, 900000, 'Analista'),
('18874656-2', 'Marta', 33, 994435210, 700000, 'Ejecutivo'),
('19565837-8', 'Vanesa', 26, 984396788, 550000, 'Analista');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `tbcliente`
--
ALTER TABLE `tbcliente`
  ADD PRIMARY KEY (`rut`);

--
-- Indices de la tabla `tbtrabajador`
--
ALTER TABLE `tbtrabajador`
  ADD PRIMARY KEY (`rut`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
