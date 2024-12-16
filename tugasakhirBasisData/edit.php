<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="style.css">
    <title>Data Tabel</title>
</head>
<?php

?>
<body>
    <?php
    include "koneksi.php";
    $id = $_GET['id'];
    $sql = "SELECT * FROM data_profil WHERE id_profil='$id' ";
    $query = mysqli_query($connect,$sql);
    while ($row = mysqli_fetch_array($query)){
    ?>

    <fieldset>
        <legend>EDIT DATA</legend>
        <form action="update.php" method="POST">
            
            <input type="hidden" name="id_profil" value="<?php echo $row['id_profil'] ?>">

            <label for="nama">Nama Lengkap</label>
            <input type="text" name="nama" value="<?php echo $row['nama'] ?>"><br>

            <label for="tempat_lahir">Tempat Lahir</label>
            <input type="text" name="tempat_lahir" value="<?php echo $row['tempat_lahir'] ?>"><br>

            <label for="tanggal_lahir">Tanggal Lahir</label>
            <input type="date" name="tanggal_lahir" value="<?php echo $row['tanggal_lahir'] ?>"><br>

            <label for="jenis_kelamin">Jenis Kelamin</label>
            <select name="jenis_kelamin" value="<?php echo $row['jenis_kelamin'] ?>">
                <option value="L">Laki-Laki</option>
                <option value="P">Perempuan</option>
            </select> <br>

            <label for="alamat">Alamat</label>
            <input type="text" name="alamat" value="<?php echo $row['alamat'] ?>"><br>

            <label for="pekerjaan">Pekerjaan</label>
            <input type="text" name="pekerjaan" value="<?php echo $row['pekerjaan'] ?>"><br>

            <input type="submit" name="submit" value="submit">

        </form>
    </fieldset>

    <?php } ?>

</body>
</html>