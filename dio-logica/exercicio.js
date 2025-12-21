const valorSalario = parseFloat(gets());
const valorBeneficio = parseFloat(gets());

const valorImposto = calculaImposto(valorSalario);
const saida = valorSalario - valorImposto + valorBeneficio;
print(saida.toFixed(2));

    function calculaImposto(salario){
        let aliquota;
        if(salario >=0 && salario <=1100){
            aliquota = 0.05;
        } else if (salario >= 1100.01 && salario <= 2500.00){
                aliquota = 0.10;
            } else {
                aliquota = 0.15;
                 }
        return aliquota * salario;
    }