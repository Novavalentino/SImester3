<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Fungsi Insert </title>
</head>
<body>
    <center>

        <?php
        include "koneksi.php";

        $nama           = $_POST['nama'];
        $tempat_lahir   = $_POST['tempat_lahir'];
        $tanggal_lahir  = $_POST['tanggal_lahir'];
        $jenis_kelamin  = $_POST['jenis_kelamin'];
        $alamat         = $_POST['alamat'];
        $pekerjaan      = $_POST['pekerjaan'];
        
        $sql            = "INSERT INTO data_profil(nama, tempat_lahir, tanggal_lahir, jenis_kelamin, alamat, pekerjaan)
                            VALUES('$nama', '$tempat_lahir', '$tanggal_lahir', '$jenis_kelamin', '$alamat', '$pekerjaan')";
        
        $check          = mysqli_query($connect,$sql);
        
        if($check){
            echo "Data Berhasil Ditambahkan";
        }else{
            echo "Data Gagal Ditambahkan";
            myqli_close($connect);
        }

        ?>

        <div class="btn-back">
            <button><a href="data_table.php">Kembali</a></button>
        </div>
    </center>
</body>
</html>