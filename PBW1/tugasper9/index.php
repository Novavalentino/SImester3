<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Tugas Nova Valentino Lambert</title>
</head>
<body>
    <main>
        <script></script>
        <div class="nomor1">
            <h2>Cetak Nama dan Umur</h2>
            <form action="" method="POST">
                <label for="nama"><strong>Nama:</strong></label>
                <input type="text" name="nama" id="nama" value="<?php echo isset($_POST['nama']) ? $_POST['nama'] : ''; ?>"> <br> <br>
                <label for="umur"><strong>Umur :</strong></label>
                <input type="number" name="umur" id="umur" value="<?php echo isset($_POST['umur']) ? $_POST['umur'] : ''; ?>"><br> <br>
                <label for="hasil1"> <strong>Hasil :</strong></label>
                <input type="text" name="hasil1" readonly value="<?php echo isset($_POST['nama']) ? $_POST['nama'] : ''; ?>, <?php echo isset($_POST['umur']) ? $_POST['umur'] : ''; ?> Tahun"> <br>
                <br>
                <input type="submit" name="proses" value="Proses">
                <input type="reset" value="Clear">
            </form>
        </div>
        <hr>
        <div class="nomor2">
            <h2>Membuat Bintang</h2>
            <form action="" method="POST">
                <label for="bintang"><strong>Jumlah : </strong></label>
                <input type="number" name="bintang" id="bintang" value="<?php echo isset($_POST['bintang']) ? $_POST['bintang'] : 0; ?>" min="1" size="1">
                <input type="submit" name="proses2" value="Proses"> <br><br>
                <label for="hasil"><strong>Hasil :</strong></label>
                <textarea name="hasil" rows="5" cols="30" readonly>
                    <?php
                    if(isset($_POST['proses2'])){
                      $bintang = $_POST['bintang'];
                      echo"\n";
                      for($i=1;$i<=$bintang;$i++){
                        for($j=1;$j<=$i;$j++){
                          echo"*";
                        }
                        echo"\n";
                      }                    
                    }
                  ?>
                </textarea>
            </form>
        </div>

    </main>
</body>
</html>