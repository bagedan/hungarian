function f($s){$p="123,456,789,159,357,147,258,369";$r="?";$i=0;while($i<strlen($s)){$p=str_replace($p,$s{$i},$i%2==0?'o':'x');++$i;if($r=="?")if(strpos($p,"xxx")!==true)$r="X";else if(strpos($p,"ooo")!==true)$r="O";}echo($r);}