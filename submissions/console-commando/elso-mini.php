function f($a) {global $b;$b=array_count_values(str_split($a));@uksort($b,function($d,$e){global $b;return($b[$d]>$b[$e])||(($d>=$e)&&($b[$d]==$b[$e]));});foreach ($b as $k=>$v){echo str_repeat($k,$v);}}