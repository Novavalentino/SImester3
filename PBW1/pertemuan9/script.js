function hitungTotal(){

    //ambil jumlah minuman
    let jumlahkopi = document.getElementById("kopi").value;
    let jumlahteh = document.getElementById("teh").value;
    let jumlahjusjeruk = document.getElementById("jusjeruk").value;
    let jumlahchococok = document.getElementById("chococok").value;
    let jumlahmatcha = document.getElementById("matcha").value;
    let jumlahdoger = document.getElementById("doger").value;
    let jumlahthaitea = document.getElementById("thaitea").value;
    let jumlahpopice = document.getElementById("popice").value;
    let jumlahsusu = document.getElementById("susu").value;
    let jumlahcola = document.getElementById("cola").value;

    //hitung total harga per minuman
    let totalkopi = jumlahkopi * 5000;
    let totalteh = jumlahteh * 3000;
    let totaljusjeruk = jumlahjusjeruk * 7000;
    let totalchococok = jumlahchococok * 6000;
    let totalmatcha = jumlahmatcha * 10000;
    let totaldoger = jumlahdoger * 10000;
    let totalthaitea = jumlahthaitea * 10000;
    let totalpopice = jumlahpopice * 5000;
    let totalsusu = jumlahsusu * 5000;
    let totalcola = jumlahcola * 8000;

    // menampiklan harga per minuman
    document.getElementById("totalkopi").textContent = totalkopi;
    document.getElementById("totalteh").textContent = totalteh;
    document.getElementById("totaljusjeruk").textContent = totaljusjeruk;
    document.getElementById("totalchococok").textContent = totalchococok;
    document.getElementById("totalmatcha").textContent = totalmatcha;
    document.getElementById("totaldoger").textContent = totaldoger;
    document.getElementById("totalthaitea").textContent = totalthaitea;
    document.getElementById("totalpopice").textContent = totalpopice;
    document.getElementById("totalsusu").textContent = totalsusu;
    document.getElementById("totalcola").textContent = totalcola;

    // hitung Jumlah total
    //PARSE INT = mengubah string menjadi integer
    let totaljumlah = parseInt(jumlahkopi) + parseInt(jumlahteh) + parseInt(jumlahjusjeruk) + parseInt(jumlahchococok) + parseInt(jumlahmatcha) + parseInt(jumlahdoger) + parseInt(jumlahthaitea) + parseInt(jumlahpopice) + parseInt(jumlahsusu) + parseInt(jumlahcola);
    document.getElementById("totaljumlah").textContent = totaljumlah;

    // Hitung total beli
    let totalbeli = totalkopi + totalteh + totaljusjeruk + totalchococok + totalmatcha + totaldoger + totalthaitea + totalpopice + totalsusu + totalcola;
    document.getElementById("totalbeli").textContent = "Rp. " + totalbeli;

    // hitung total bayar
    let totalbayar = totalbeli + totalbeli * 0.1;
    document.getElementById("totalbayar").textContent = "Rp. " + totalbayar;

}