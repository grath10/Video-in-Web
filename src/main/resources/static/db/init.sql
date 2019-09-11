CREATE TABLE `device` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Code` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `Name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `Location` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `Type` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `ClientId` char(8) COLLATE utf8mb4_general_ci NOT NULL,
  `Architecture_ID` int(11) NOT NULL,
  `State` char(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `Username` varchar(45) COLLATE utf8mb4_general_ci NOT NULL,
  `Password` varchar(45) COLLATE utf8mb4_general_ci NOT NULL,
  `Historic_Count` int(11) NOT NULL,
  `Annual_Count` int(11) NOT NULL,
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

CREATE TABLE `people` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Account` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `Name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `Password` varchar(65) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `Account_Locked` bit(1) NOT NULL DEFAULT b'0',
  `Account_Expired` bit(1) NOT NULL DEFAULT b'0',
  `Credentials_Expired` bit(1) NOT NULL DEFAULT b'0',
  `Type` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `Phone` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `Organization_ID` int(11) DEFAULT NULL,
  `Status` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '1',
  `GPS` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `Last_Login_Time` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
