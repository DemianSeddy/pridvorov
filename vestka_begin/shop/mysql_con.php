<?php
$result = array();
$mysqli=new mysqli("192.168.159.130"
,"root"
,"101326"
,"tbase") or die ("Не удалось поцепиться к базе");
/* проверка соединения */
if ($mysqli->connect_errno) {
    printf("Соединение не удалось: %s\n", $mysqli->connect_error);
    exit();
}

$query = "SELECT path,id_feature from horses";

if ($result = $mysqli->query($query)) {

    /* извлечение ассоциативного массива */
    while ($row = $result->fetch_assoc()) {
        printf ("%s (%s)\n", $row["path"], $row["id_feature"]);
    }

    /* удаление выборки */
    $result->free();
}

/* закрытие соединения */
$mysqli->close();