package defpackage;

import com.google.gson.internal.LazilyParsedNumber;
import j$.util.Objects;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public final class iw3 extends lv3 {
    public final Serializable a;

    public iw3(Boolean bool) {
        Objects.requireNonNull(bool);
        this.a = bool;
    }

    public static boolean e(iw3 iw3Var) {
        Serializable serializable = iw3Var.a;
        if (!(serializable instanceof Number)) {
            return false;
        }
        Number number = (Number) serializable;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    public final BigInteger a() {
        Serializable serializable = this.a;
        if (serializable instanceof BigInteger) {
            return (BigInteger) serializable;
        }
        if (e(this)) {
            return BigInteger.valueOf(c().longValue());
        }
        String strD = d();
        wu8.m(strD);
        return new BigInteger(strD);
    }

    public final Number c() {
        Serializable serializable = this.a;
        if (serializable instanceof Number) {
            return (Number) serializable;
        }
        if (serializable instanceof String) {
            return new LazilyParsedNumber((String) serializable);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    public final String d() {
        Serializable serializable = this.a;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        if (serializable instanceof Number) {
            return c().toString();
        }
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).toString();
        }
        throw new AssertionError("Unexpected value type: " + serializable.getClass());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || iw3.class != obj.getClass()) {
            return false;
        }
        iw3 iw3Var = (iw3) obj;
        Serializable serializable = iw3Var.a;
        Serializable serializable2 = this.a;
        if (serializable2 == null) {
            return serializable == null;
        }
        if (e(this) && e(iw3Var)) {
            return ((serializable2 instanceof BigInteger) || (serializable instanceof BigInteger)) ? a().equals(iw3Var.a()) : c().longValue() == iw3Var.c().longValue();
        }
        if (!(serializable2 instanceof Number) || !(serializable instanceof Number)) {
            return serializable2.equals(serializable);
        }
        if ((serializable2 instanceof BigDecimal) && (serializable instanceof BigDecimal)) {
            return (serializable2 instanceof BigDecimal ? (BigDecimal) serializable2 : wu8.F(d())).compareTo(serializable instanceof BigDecimal ? (BigDecimal) serializable : wu8.F(iw3Var.d())) == 0;
        }
        double dDoubleValue = serializable2 instanceof Number ? c().doubleValue() : Double.parseDouble(d());
        double dDoubleValue2 = serializable instanceof Number ? iw3Var.c().doubleValue() : Double.parseDouble(iw3Var.d());
        if (dDoubleValue != dDoubleValue2) {
            return Double.isNaN(dDoubleValue) && Double.isNaN(dDoubleValue2);
        }
        return true;
    }

    public final int hashCode() {
        long jDoubleToLongBits;
        Serializable serializable = this.a;
        if (serializable == null) {
            return 31;
        }
        if (e(this)) {
            jDoubleToLongBits = c().longValue();
        } else {
            if (!(serializable instanceof Number)) {
                return serializable.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(c().doubleValue());
        }
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    public iw3(Number number) {
        Objects.requireNonNull(number);
        this.a = number;
    }

    public iw3(String str) {
        Objects.requireNonNull(str);
        this.a = str;
    }
}
