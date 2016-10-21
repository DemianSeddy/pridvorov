<?php
/* Функция для удаления лишних файлов: сюда, помимо удаления текущей и родительской директории, так же можно добавить файлы, не являющиеся картинкой (проверяя расширение) */
$result = array();
$dir = "images";
$mysqli=new mysqli("192.168.100.99","root","SQLbase123","tbase") or die ("Не удалось поцепиться к базе");
if ($mysqli->connect_errno) {
    printf("Соединение не удалось: %s\n", $mysqli->connect_error);
    exit();
}

if (!$mysqli->set_charset("utf8")) {
    printf("Ошибка при загрузке набора символов utf8: %s\n", $mysqli->error);
} else {
    printf("Текущий набор символов: %s\n", $mysqli->character_set_name());
}
?>