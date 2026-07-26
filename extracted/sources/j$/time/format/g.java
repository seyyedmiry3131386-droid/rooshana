package j$.time.format;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends i {
    public final boolean g;

    public g(j$.time.temporal.p pVar, int i, int i2, boolean z, int i3) {
        super(pVar, i, i2, u.NOT_NEGATIVE, i3);
        this.g = z;
    }

    @Override // j$.time.format.i
    public final i a() {
        if (this.e == -1) {
            return this;
        }
        return new g(this.a, this.b, this.c, this.g, -1);
    }

    @Override // j$.time.format.i
    public final i b(int i) {
        return new g(this.a, this.b, this.c, this.g, this.e + i);
    }

    @Override // j$.time.format.i, j$.time.format.f
    public final boolean i(p pVar, StringBuilder sb) {
        j$.time.temporal.p pVar2 = this.a;
        Long lA = pVar.a(pVar2);
        if (lA == null) {
            return false;
        }
        s sVar = pVar.b.c;
        long jLongValue = lA.longValue();
        j$.time.temporal.t tVarK = pVar2.k();
        tVarK.b(jLongValue, pVar2);
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(tVarK.a);
        BigDecimal bigDecimalAdd = BigDecimal.valueOf(tVarK.d).subtract(bigDecimalValueOf).add(BigDecimal.ONE);
        BigDecimal bigDecimalSubtract = BigDecimal.valueOf(jLongValue).subtract(bigDecimalValueOf);
        RoundingMode roundingMode = RoundingMode.FLOOR;
        BigDecimal bigDecimalDivide = bigDecimalSubtract.divide(bigDecimalAdd, 9, roundingMode);
        BigDecimal bigDecimal = BigDecimal.ZERO;
        if (bigDecimalDivide.compareTo(bigDecimal) != 0) {
            bigDecimal = bigDecimalDivide.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimalDivide.stripTrailingZeros();
        }
        int iScale = bigDecimal.scale();
        boolean z = this.g;
        int i = this.b;
        if (iScale != 0) {
            String strSubstring = bigDecimal.setScale(Math.min(Math.max(bigDecimal.scale(), i), this.c), roundingMode).toPlainString().substring(2);
            sVar.getClass();
            if (z) {
                sb.append('.');
            }
            sb.append(strSubstring);
            return true;
        }
        if (i > 0) {
            if (z) {
                sVar.getClass();
                sb.append('.');
            }
            for (int i2 = 0; i2 < i; i2++) {
                sVar.getClass();
                sb.append('0');
            }
        }
        return true;
    }

    @Override // j$.time.format.i
    public final String toString() {
        return "Fraction(" + this.a + "," + this.b + "," + this.c + (this.g ? ",DecimalPoint" : "") + ")";
    }
}
