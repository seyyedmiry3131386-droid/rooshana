package j$.time.format;

/* JADX INFO: loaded from: classes2.dex */
public class i implements f {
    public static final long[] f = {0, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000L};
    public final j$.time.temporal.p a;
    public final int b;
    public final int c;
    public final u d;
    public final int e;

    public i(j$.time.temporal.p pVar, int i, int i2, u uVar) {
        this.a = pVar;
        this.b = i;
        this.c = i2;
        this.d = uVar;
        this.e = 0;
    }

    public i(j$.time.temporal.p pVar, int i, int i2, u uVar, int i3) {
        this.a = pVar;
        this.b = i;
        this.c = i2;
        this.d = uVar;
        this.e = i3;
    }

    public i a() {
        if (this.e == -1) {
            return this;
        }
        return new i(this.a, this.b, this.c, this.d, -1);
    }

    public i b(int i) {
        return new i(this.a, this.b, this.c, this.d, this.e + i);
    }

    @Override // j$.time.format.f
    public boolean i(p pVar, StringBuilder sb) {
        j$.time.temporal.p pVar2 = this.a;
        Long lA = pVar.a(pVar2);
        if (lA == null) {
            return false;
        }
        long jLongValue = lA.longValue();
        s sVar = pVar.b.c;
        String string = jLongValue == Long.MIN_VALUE ? "9223372036854775808" : Long.toString(Math.abs(jLongValue));
        int length = string.length();
        int i = this.c;
        if (length > i) {
            throw new j$.time.b("Field " + pVar2 + " cannot be printed as the value " + jLongValue + " exceeds the maximum print width of " + i);
        }
        sVar.getClass();
        int i2 = this.b;
        u uVar = this.d;
        if (jLongValue >= 0) {
            int i3 = c.a[uVar.ordinal()];
            if (i3 != 1) {
                if (i3 == 2) {
                    sb.append('+');
                }
            } else if (i2 < 19 && jLongValue >= f[i2]) {
                sb.append('+');
            }
        } else {
            int i4 = c.a[uVar.ordinal()];
            if (i4 == 1 || i4 == 2 || i4 == 3) {
                sb.append('-');
            } else if (i4 == 4) {
                throw new j$.time.b("Field " + pVar2 + " cannot be printed as the value " + jLongValue + " cannot be negative according to the SignStyle");
            }
        }
        for (int i5 = 0; i5 < i2 - string.length(); i5++) {
            sb.append('0');
        }
        sb.append(string);
        return true;
    }

    public String toString() {
        int i = this.c;
        j$.time.temporal.p pVar = this.a;
        u uVar = this.d;
        int i2 = this.b;
        if (i2 == 1 && i == 19 && uVar == u.NORMAL) {
            return "Value(" + pVar + ")";
        }
        if (i2 == i && uVar == u.NOT_NEGATIVE) {
            return "Value(" + pVar + "," + i2 + ")";
        }
        return "Value(" + pVar + "," + i2 + "," + i + "," + uVar + ")";
    }
}
