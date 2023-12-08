-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost
-- Tiempo de generación: 08-12-2023 a las 01:51:25
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `integrador_cac`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `oradores`
--

CREATE TABLE `oradores` (
  `id_orador` int(11) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `apellido` varchar(30) NOT NULL,
  `mail` varchar(30) NOT NULL,
  `tema` varchar(60) NOT NULL,
  `fecha_alta` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `oradores`
--

INSERT INTO `oradores` (`id_orador`, `nombre`, `apellido`, `mail`, `tema`, `fecha_alta`) VALUES
(1, 'Luis', 'González', 'luisgonzalez@gmail.com', 'Inteligencia Artificial', '2023-09-15'),
(2, 'Sofía', 'Martínez', 'sofiamartinez@gmail.com', 'Desarrollo Web', '2023-08-20'),
(3, 'Martín', 'Rodríguez', 'martinrodriguez@gmail.com', 'Machine Learning', '2023-09-05'),
(4, 'Valentina', 'López', 'valentinalopez@gmail.com', 'Big Data', '2023-09-10'),
(5, 'Lucas', 'García', 'lucasgarcia@gmail.com', 'Ciberseguridad', '2023-08-25'),
(6, 'Camila', 'Fernández', 'camilafernandez@gmail.com', 'Cloud Computing', '2023-07-30'),
(7, 'Mateo', 'Díaz', 'mateodiaz@gmail.com', 'Programación en Java', '2023-07-15'),
(8, 'Renata', 'Pérez', 'renataperez@gmail.com', 'Blockchain', '2023-09-01'),
(9, 'Benjamín', 'Sánchez', 'benjaminsanchez@gmail.com', 'Desarrollo de Apps', '2023-08-05'),
(10, 'Catalina', 'Torres', 'catalinatorres@gmail.com', 'Programación en Python', '2023-09-20'),
(11, 'Lucas', 'Fernández', 'lucasfernandez@gmail.com', 'Programación en Java', '2023-11-18'),
(12, 'Sofía', 'García', 'sofiagarcia@gmail.com', 'Introducción a Python', '2023-10-20'),
(13, 'Mateo', 'López', 'mateolopez@gmail.com', 'Programación Web con JavaScript', '2023-11-03'),
(14, 'Valentina', 'Martínez', 'valentinamartinez@gmail.com', 'Machine Learning y Data Science', '2023-10-18'),
(15, 'Thiago', 'Rodríguez', 'thiagorodriguez@gmail.com', 'Ciberseguridad: Retos y Soluciones', '2023-11-08'),
(16, 'Isabella', 'Díaz', 'isabelladiaz@gmail.com', 'Desarrollo de Aplicaciones Móviles', '2023-11-15'),
(17, 'Benjamín', 'Pérez', 'benjaminperez@gmail.com', 'Cloud Computing y Servicios Web', '2023-11-15'),
(18, 'Mía', 'González', 'miagonzalez@gmail.com', 'Automatización de Procesos con Python', '2023-10-18'),
(19, 'Joaquín', 'Silva', 'joaquinsilva@gmail.com', 'Blockchain', '2023-10-10'),
(20, 'Emilia', 'Torres', 'emiliatorres@gmail.com', 'Desarrollo de Videojuegos', '2023-11-05');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `oradores`
--
ALTER TABLE `oradores`
  ADD PRIMARY KEY (`id_orador`),
  ADD UNIQUE KEY `mail` (`mail`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `oradores`
--
ALTER TABLE `oradores`
  MODIFY `id_orador` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
