package parcial1Progra2;

public class ConversoraDecimal {
    private String numBinario;

    public ConversoraDecimal(String binaryStr) {
        this.numBinario = binaryStr;
    }

    public int convertir() {
        int decimal = 0;
        int aux = numBinario.length() - 1; 

        for (int i = numBinario.length() - 1; i >= 0; i--) {
            if (numBinario.charAt(i) == '1') {
                decimal += Math.pow(2, aux);
            }
            aux++;
        }

        return decimal;
    }


}

