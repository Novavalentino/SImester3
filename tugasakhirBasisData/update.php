<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Fungsi Update </title>
</head>
<body>
    <center>

        <?php
        include "koneksi.php";
        $id             = $_POST['id_profil'];
        $nama           = $_POST['nama'];
        $tempat_lahir   = $_POST['tempat_lahir'];
        $tanggal_lahir  = $_POST['tanggal_lahir'];
        $jenis_kelamin  = $_POST['jenis_kelamin'];
        $alamat         = $_POST['alamat'];
        $pekerjaan      = $_POST['pekerjaan'];
        
        $sql            = "UPDATE data_profil SET nama='$nama', tempat_lahir='$tempat_lahir', tanggal_lahir='$tanggal_lahir', jenis_kelamin='$jenis_kelamin', alamat='$alamat', pekerjaan='$pekerjaan' WHERE id_profil='$id' ";

        $check          = mysqli_query($connect,$sql);
        
        if($check){
            echo "Data Berhasil DiUpdate";
        }else{
            echo "Data Gagal DiUpdate";
            myqli_close($connect);
        }

        ?>

        <div class="btn-back">
            <button><a href="data_table.php">Kembali</a></button>
        </div>
    </center>
</body>
</html>