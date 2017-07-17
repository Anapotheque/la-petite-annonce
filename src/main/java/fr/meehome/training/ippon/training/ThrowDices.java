package fr.meehome.training.ippon.training;

import java.math.BigDecimal;

public class ThrowDices {

    public BigDecimal throwDices(int D, int F) {
        BigDecimal faces = BigDecimal.valueOf(F);
        BigDecimal echec = faces.subtract(BigDecimal.ONE);
        BigDecimal pow = echec.divide(faces, 100, BigDecimal.ROUND_HALF_UP).pow(D).setScale(5, BigDecimal.ROUND_HALF_UP);
        return BigDecimal.ONE.subtract(pow);
    }

}
