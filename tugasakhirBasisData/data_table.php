<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="style.css">
    <title>Data Tabel</title>
</head>
<?php
include "koneksi.php";
$sql = "SELECT*FROM data_profil";
$query = mysqli_query($connect,$sql);
?>
<body>
    <fieldset>
        <legend>INSERT TABLE</legend>
        <form action="insert.php" method="POST">

            <label for="nama">Nama Lengkap</label>
            <input type="text" name="nama"><br>

            <label for="tempat_lahir">Tempat Lahir</label>
            <input type="text" name="tempat_lahir"><br>

            <label for="tanggal_lahir">Tanggal Lahir</label>
            <input type="date" name="tanggal_lahir"><br>

            <label for="jenis_kelamin">Jenis Kelamin</label>
            <select name="jenis_kelamin">
                <option value="L">Laki-Laki</option>
                <option value="P">Perempuan</option>
            </select> <br>

            <label for="alamat">Alamat</label>
            <input type="text" name="alamat"><br>

            <label for="pekerjaan">Pekerjaan</label>
            <input type="text" name="pekerjaan"><br>

            <input type="submit" name="submit" value="submit">

        </form>
    </fieldset> <br><br> <hr> <br>
    <div class="table">
        <table border="1px">
            <thead>
                <tr>
                    <th>No</th>
                    <th>Nama</th>
                    <th>Tempat Lahir</th>
                    <th>Tanggal Lahir</th>
                    <th>Jenis Kelamin</th>
                    <th>Alamat</th>
                    <th>Pekerjaan</th>
                    <th>Aksi</th>
                </tr>
            </thead>
            <tbody>
                <?php
                    while ($row = mysqli_fetch_array($query)){
                        echo "
                    
                        <tr>
                        <td>$row[id_profil]</td>
                        <td>$row[nama]</td>
                        <td>$row[tempat_lahir]</td>
                        <td>$row[tanggal_lahir]</td>
                        <td>$row[jenis_kelamin]</td>
                        <td>$row[alamat]</td>
                        <td>$row[pekerjaan]</td>
                        <td><button><a href='edit.php?id=$row[id_profil]'>Edit</a></button> | <button><a href='delete.php?id=$row[id_profil]'>Delete</a></button></td></tr>
                        </tr>";
                    }
                ?>
            
            </tbody>
        </table>
    </div>
    

</body>
</html>