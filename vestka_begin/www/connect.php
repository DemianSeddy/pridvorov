<?php

/**
 * Created by PhpStorm.
 * User: asutp
 * Date: 13.10.2016
 * Time: 16:12
 */
class select_from_base{

	var $what_base;       //Вид базы
	var $what_port;       //Порт базы
	var $charset;         //Кодовая страница
	var $ipbase;          //IP базы или DNS
	var $name_base;       //
	var $user;            //Пользователь
	var $password_user;   //Пароль
	var $select_sql;      //Запрос

     //Название базы

	/**
	 * select_from_base constructor.
	 * @param $what_base
	 * @param $what_port
	 * @param $charset
	 * @param $ipbase
	 * @param $name_base
	 * @param $user
	 * @param $password_user
	 * @param $select_sql
	 */
	public function __construct($what_base, $what_port, $charset, $ipbase, $name_base, $user, $password_user, $select_sql)
	{
		$this->what_base = $what_base;
		$this->what_port = $what_port;
		$this->charset = $charset;
		$this->ipbase = $ipbase;
		$this->name_base = $name_base;
		$this->user = $user;
		$this->password_user = $password_user;
		$this->select_sql = $select_sql;
	}
	/**
	 * @param mixed $what_base
	 */
	public function setWhatBase($what_base)
	{
		$this->what_base = $what_base;
		if isset($this->what_base) echo("");
	}

	/**
	 * @param mixed $what_port
	 */
	public function setWhatPort($what_port)
	{
		$this->what_port = $what_port;
	}

	/**
	 * @param mixed $charset
	 */
	public function setCharset($charset)
	{
		$this->charset = $charset;
	}

	/**
	 * @param mixed $ipbase
	 */
	public function setIpbase($ipbase)
	{
		$this->ipbase = $ipbase;
	}

	/**
	 * @param mixed $name_base
	 */
	public function setNameBase($name_base)
	{
		$this->name_base = $name_base;
	}

	/**
	 * @param mixed $user
	 */
	public function setUser($user)
	{
		$this->user = $user;
	}

	/**
	 * @param mixed $password_user
	 */
	public function setPasswordUser($password_user)
	{
		$this->password_user = $password_user;
	}

	/**
	 * @param mixed $select_sql
	 */
	public function setSelectSql($select_sql)
	{
		$this->select_sql = $select_sql;
	}

}
?>