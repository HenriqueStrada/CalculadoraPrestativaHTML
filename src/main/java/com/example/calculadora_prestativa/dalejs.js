pegaValores = function(){
    var valorUm = prompt("Digite o primeiro valor: ");
    var valorDois = prompt("Digite o segundo valor: ");
    return [valorUm, valorDois];
}
       
document.getElementById("soma").onclick = function() {
    var valores = pegaValores();
    var resultado = parseFloat(valores[0]) + parseFloat(valores[1]);
    window.alert("O resultado da soma é: " + resultado);
    console.log("O resultado da soma é: " + resultado);
}
document.getElementById("sub").onclick = function() {
    var valores = pegaValores();
    var resultado = parseFloat(valores[0] - parseFloat(valores[1]));
    window.alert("O resultado da subtração é: " + resultado);
    console.log("O resultado da subtração é: " + resultado);
}
document.getElementById("multi").onclick = function() {
    var valores = pegaValores();
    var resultado = parseFloat(valores[0]) * parseFloat(valores[1]);
    window.alert("O resultado da multiplicação é: " + resultado);
    console.log("O resultado da multiplicação é: " + resultado);
}
document.getElementById("div").onclick = function() {
    var valores = pegaValores();
    var resultado = parseFloat(valores[0]) / parseFloat(valores[1]);
    window.alert("O resultado da divisão é: " + resultado);
    console.log("O resultado da divisão é: " + resultado);
}