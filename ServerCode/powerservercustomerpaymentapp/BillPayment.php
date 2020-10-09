<?php
//this code recive client AES(SignClentPri(ServerPublic))

// if you are doing ajax with application-json headers
if (empty($_POST)) {
    $_POST = json_decode(file_get_contents("php://input"), true) ? : [];
}
$cid = str_replace("\n", "", $_POST['customerID']);
$iv = str_replace("\n", "", $_POST['iv']);
$endata = str_replace("\n", "", $_POST['customerENPdata']);

$input =  $cid."-------".$iv."-------".$endata;

file_put_contents("paymenttext.txt",$input);

?>