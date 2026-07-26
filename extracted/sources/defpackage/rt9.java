package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class rt9 extends tt9 {
    @Override // defpackage.tt9
    public final double A(long j, Object obj) {
        return Double.longBitsToDouble(((Unsafe) this.b).getLong(obj, j));
    }

    @Override // defpackage.tt9
    public final void B(Object obj, long j, double d) {
        ((Unsafe) this.b).putLong(obj, j, Double.doubleToLongBits(d));
    }

    @Override // defpackage.tt9
    public final void v(Object obj, long j, byte b) {
        if (ut9.g) {
            ut9.c(obj, j, b);
        } else {
            ut9.d(obj, j, b);
        }
    }

    @Override // defpackage.tt9
    public final boolean w(long j, Object obj) {
        return ut9.g ? ut9.n(j, obj) : ut9.o(j, obj);
    }

    @Override // defpackage.tt9
    public final void x(Object obj, long j, boolean z) {
        if (ut9.g) {
            ut9.c(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            ut9.d(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // defpackage.tt9
    public final float y(long j, Object obj) {
        return Float.intBitsToFloat(((Unsafe) this.b).getInt(obj, j));
    }

    @Override // defpackage.tt9
    public final void z(Object obj, long j, float f) {
        ((Unsafe) this.b).putInt(obj, j, Float.floatToIntBits(f));
    }
}
