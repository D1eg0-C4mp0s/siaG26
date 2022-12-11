-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 11-12-2022 a las 01:54:12
-- Versión del servidor: 10.4.25-MariaDB
-- Versión de PHP: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `votaaap`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `candidato`
--

CREATE TABLE `candidato` (
  `idenCandidato` int(10) NOT NULL,
  `nombres` varchar(60) NOT NULL,
  `foto` varchar(20) DEFAULT NULL,
  `descripcion` text DEFAULT NULL,
  `urlPartido` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `candidato`
--

INSERT INTO `candidato` (`idenCandidato`, `nombres`, `foto`, `descripcion`, `urlPartido`) VALUES
(1, 'Diego', NULL, NULL, NULL),
(2, 'David', NULL, NULL, NULL),
(3, 'Laura', NULL, NULL, NULL),
(4, 'Estiven', NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `votante`
--

CREATE TABLE `votante` (
  `identificacion` int(10) NOT NULL,
  `nombres` varchar(60) NOT NULL,
  `clave` varchar(8) NOT NULL,
  `telefono` int(10) DEFAULT NULL,
  `correo` varchar(40) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `votante`
--

INSERT INTO `votante` (`identificacion`, `nombres`, `clave`, `telefono`, `correo`) VALUES
(0, '88', '12', 0, ''),
(1, 'e', '12', 1, 'w@gmail.com'),
(88, 'est', '12', 88, 'e8@g.com'),
(111, 'car', '12', 111, 'r@g.com'),
(123, 'Estiven', '123', 312555, 'estiven@outlook.es'),
(1037, 'estiven por ultima vez', '12', 31212, 'essss@outlook.es'),
(1414, 'tsts', '12', 3333333, 'fgxgf@gmail.com'),
(2020, '.kgyjfv', '12', 464546, 'fgxgf@gmail.com');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `voto`
--

CREATE TABLE `voto` (
  `codVoto` int(8) NOT NULL,
  `idenCandidato` int(10) NOT NULL,
  `identificacion` int(10) NOT NULL,
  `fechaHora` datetime DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `voto`
--

INSERT INTO `voto` (`codVoto`, `idenCandidato`, `identificacion`, `fechaHora`) VALUES
(3, 1, 88, '2022-12-08 19:57:36'),
(4, 3, 123, '2022-12-09 23:16:58'),
(5, 1, 1414, '2022-12-10 18:35:12'),
(6, 3, 2020, '2022-12-10 18:36:01'),
(7, 4, 1037, '2022-12-10 18:38:42');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `candidato`
--
ALTER TABLE `candidato`
  ADD PRIMARY KEY (`idenCandidato`);

--
-- Indices de la tabla `votante`
--
ALTER TABLE `votante`
  ADD PRIMARY KEY (`identificacion`);

--
-- Indices de la tabla `voto`
--
ALTER TABLE `voto`
  ADD PRIMARY KEY (`codVoto`),
  ADD KEY `identificacion` (`identificacion`),
  ADD KEY `idenCandidato` (`idenCandidato`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `voto`
--
ALTER TABLE `voto`
  MODIFY `codVoto` int(8) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `voto`
--
ALTER TABLE `voto`
  ADD CONSTRAINT `voto_ibfk_1` FOREIGN KEY (`identificacion`) REFERENCES `votante` (`identificacion`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `voto_ibfk_2` FOREIGN KEY (`idenCandidato`) REFERENCES `candidato` (`idenCandidato`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
