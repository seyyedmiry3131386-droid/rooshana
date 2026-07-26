package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class gc0 extends hk2 {
    public final /* synthetic */ int b = 2;
    public Object c;

    public /* synthetic */ gc0(t18 t18Var) {
        super(t18Var);
    }

    @Override // defpackage.hk2, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        switch (this.b) {
            case 1:
                ((zj0) this.c).b.close();
                super.close();
                break;
            default:
                super.close();
                break;
        }
    }

    @Override // defpackage.hk2, defpackage.t18
    public long f0(gh0 gh0Var, long j) throws Exception {
        switch (this.b) {
            case 0:
                try {
                    return super.f0(gh0Var, j);
                } catch (Exception e) {
                    this.c = e;
                    throw e;
                }
            case 1:
            default:
                return super.f0(gh0Var, j);
            case 2:
                try {
                    return super.f0(gh0Var, j);
                } catch (IOException e2) {
                    ((ds5) this.c).d = e2;
                    throw e2;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gc0(ds5 ds5Var, ph0 ph0Var) {
        super(ph0Var);
        this.c = ds5Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gc0(t18 t18Var, zj0 zj0Var) {
        super(t18Var);
        this.c = zj0Var;
    }
}
