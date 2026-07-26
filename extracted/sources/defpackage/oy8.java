package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes3.dex */
public final class oy8 extends sy8 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oy8(Unsafe unsafe, int i) {
        super(unsafe);
        this.b = i;
    }

    @Override // defpackage.sy8
    public final void c(long j, byte[] bArr, long j2, long j3) {
        switch (this.b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // defpackage.sy8
    public final boolean d(long j, Object obj) {
        switch (this.b) {
            case 0:
                if (uy8.h) {
                    if (uy8.h(j, obj) == 0) {
                    }
                } else if (uy8.i(j, obj) == 0) {
                }
                break;
            default:
                if (uy8.h) {
                    if (uy8.h(j, obj) == 0) {
                    }
                } else if (uy8.i(j, obj) == 0) {
                }
                break;
        }
        return false;
    }

    @Override // defpackage.sy8
    public final byte e(long j) {
        switch (this.b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // defpackage.sy8
    public final byte f(long j, Object obj) {
        switch (this.b) {
            case 0:
                if (!uy8.h) {
                }
                break;
            default:
                if (!uy8.h) {
                }
                break;
        }
        return uy8.i(j, obj);
    }

    @Override // defpackage.sy8
    public final double g(long j, Object obj) {
        switch (this.b) {
        }
        return Double.longBitsToDouble(k(j, obj));
    }

    @Override // defpackage.sy8
    public final float h(long j, Object obj) {
        switch (this.b) {
        }
        return Float.intBitsToFloat(i(j, obj));
    }

    @Override // defpackage.sy8
    public final long j(long j) {
        switch (this.b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // defpackage.sy8
    public final void n(Object obj, long j, boolean z) {
        switch (this.b) {
            case 0:
                if (!uy8.h) {
                    uy8.m(obj, j, z ? (byte) 1 : (byte) 0);
                } else {
                    uy8.l(obj, j, z ? (byte) 1 : (byte) 0);
                }
                break;
            default:
                if (!uy8.h) {
                    uy8.m(obj, j, z ? (byte) 1 : (byte) 0);
                } else {
                    uy8.l(obj, j, z ? (byte) 1 : (byte) 0);
                }
                break;
        }
    }

    @Override // defpackage.sy8
    public final void o(Object obj, long j, byte b) {
        switch (this.b) {
            case 0:
                if (!uy8.h) {
                    uy8.m(obj, j, b);
                } else {
                    uy8.l(obj, j, b);
                }
                break;
            default:
                if (!uy8.h) {
                    uy8.m(obj, j, b);
                } else {
                    uy8.l(obj, j, b);
                }
                break;
        }
    }

    @Override // defpackage.sy8
    public final void p(Object obj, long j, double d) {
        switch (this.b) {
            case 0:
                s(obj, j, Double.doubleToLongBits(d));
                break;
            default:
                s(obj, j, Double.doubleToLongBits(d));
                break;
        }
    }

    @Override // defpackage.sy8
    public final void q(Object obj, long j, float f) {
        switch (this.b) {
            case 0:
                r(Float.floatToIntBits(f), j, obj);
                break;
            default:
                r(Float.floatToIntBits(f), j, obj);
                break;
        }
    }

    @Override // defpackage.sy8
    public final boolean v() {
        switch (this.b) {
        }
        return false;
    }
}
