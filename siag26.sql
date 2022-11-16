-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 16-11-2022 a las 02:20:56
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
-- Base de datos: `siag26`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `curso`
--

CREATE TABLE `curso` (
  `codCurso` int(4) NOT NULL,
  `nombre` varchar(40) NOT NULL,
  `grupo` varchar(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `curso`
--

INSERT INTO `curso` (`codCurso`, `nombre`, `grupo`) VALUES
(1, 'programación basica', 'g16'),
(2, 'programación basica', 'g16'),
(3, 'funda prugram', 'g26');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tripulante`
--

CREATE TABLE `tripulante` (
  `codTripulante` int(6) NOT NULL,
  `identificacion` int(10) NOT NULL,
  `nombres` varchar(30) NOT NULL,
  `apellidos` varchar(30) NOT NULL,
  `sexo` int(1) NOT NULL,
  `fechaNac` date NOT NULL,
  `direccion` varchar(100) DEFAULT NULL,
  `telefono` varchar(10) NOT NULL,
  `correo` varchar(60) NOT NULL,
  `codCurso` int(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `curso`
--
ALTER TABLE `curso`
  ADD PRIMARY KEY (`codCurso`);

--
-- Indices de la tabla `tripulante`
--
ALTER TABLE `tripulante`
  ADD PRIMARY KEY (`codTripulante`),
  ADD KEY `codCurso` (`codCurso`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `curso`
--
ALTER TABLE `curso`
  MODIFY `codCurso` int(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `tripulante`
--
ALTER TABLE `tripulante`
  MODIFY `codTripulante` int(6) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `tripulante`
--
ALTER TABLE `tripulante`
  ADD CONSTRAINT `tripulante_ibfk_1` FOREIGN KEY (`codCurso`) REFERENCES `curso` (`codCurso`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
