<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Fungsi Delete</title>
</head>
<body>
    <center>
        <?php
        // include database connection file
        include_once("koneksi.php");
 
        // Get id from URL to delete that user
        $id = $_GET['id'];
 
        // Delete user row from table based on given id
        $sql        = "DELETE FROM data_profil WHERE id_profil=$id";

        $check      = mysqli_query($connect,$sql);

        if($check){
            echo "Data Berhasil Dihapus";
        }else{
            echo "Data Gagal Dihapus";
            myqli_close($connect);
        }
        ?>

        <div class="btn-back">
            <button><a href="data_table.php">Kembali</a></button>
        </div>
    </center>
</body>
</html>