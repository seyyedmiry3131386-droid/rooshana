package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class py8 extends ty8 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ py8(Unsafe unsafe, int i) {
        super(unsafe);
        this.b = i;
    }

    @Override // defpackage.ty8
    public final boolean c(long j, Object obj) {
        switch (this.b) {
            case 0:
                if (vy8.g) {
                    if (vy8.g(j, obj) == 0) {
                    }
                } else if (vy8.h(j, obj) == 0) {
                }
                break;
            default:
                if (vy8.g) {
                    if (vy8.g(j, obj) == 0) {
                    }
                } else if (vy8.h(j, obj) == 0) {
                }
                break;
        }
        return false;
    }

    @Override // defpackage.ty8
    public final double d(long j, Object obj) {
        switch (this.b) {
        }
        return Double.longBitsToDouble(g(j, obj));
    }

    @Override // defpackage.ty8
    public final float e(long j, Object obj) {
        switch (this.b) {
        }
        return Float.intBitsToFloat(f(j, obj));
    }

    @Override // defpackage.ty8
    public final void j(Object obj, long j, boolean z) {
        switch (this.b) {
            case 0:
                if (!vy8.g) {
                    vy8.l(obj, j, z ? (byte) 1 : (byte) 0);
                } else {
                    vy8.k(obj, j, z ? (byte) 1 : (byte) 0);
                }
                break;
            default:
                if (!vy8.g) {
                    vy8.l(obj, j, z ? (byte) 1 : (byte) 0);
                } else {
                    vy8.k(obj, j, z ? (byte) 1 : (byte) 0);
                }
                break;
        }
    }

    @Override // defpackage.ty8
    public final void k(Object obj, long j, byte b) {
        switch (this.b) {
            case 0:
                if (!vy8.g) {
                    vy8.l(obj, j, b);
                } else {
                    vy8.k(obj, j, b);
                }
                break;
            default:
                if (!vy8.g) {
                    vy8.l(obj, j, b);
                } else {
                    vy8.k(obj, j, b);
                }
                break;
        }
    }

    @Override // defpackage.ty8
    public final void l(Object obj, long j, double d) {
        switch (this.b) {
            case 0:
                o(obj, j, Double.doubleToLongBits(d));
                break;
            default:
                o(obj, j, Double.doubleToLongBits(d));
                break;
        }
    }

    @Override // defpackage.ty8
    public final void m(Object obj, long j, float f) {
        switch (this.b) {
            case 0:
                n(Float.floatToIntBits(f), j, obj);
                break;
            default:
                n(Float.floatToIntBits(f), j, obj);
                break;
        }
    }

    @Override // defpackage.ty8
    public final boolean r() {
        switch (this.b) {
        }
        return false;
    }
}
