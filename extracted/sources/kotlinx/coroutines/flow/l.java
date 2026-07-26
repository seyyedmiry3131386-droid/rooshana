package kotlinx.coroutines.flow;

import defpackage.cq2;
import defpackage.g51;
import defpackage.ja1;
import defpackage.js3;
import defpackage.mu3;
import defpackage.om0;
import defpackage.tx8;
import defpackage.u2;
import defpackage.v2;
import defpackage.vy2;
import defpackage.w48;
import defpackage.w61;
import defpackage.xb5;
import defpackage.xe2;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.channels.BufferOverflow;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends u2 implements xb5, xe2, cq2 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater f = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;
    public int e;

    public l(Object obj) {
        this._state$volatile = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x007e, code lost:
    
        if (((kotlinx.coroutines.flow.m) r0).a(r3) == r4) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0096, code lost:
    
        if (r2 != r4) goto L36;
     */
    /* JADX WARN: Path cross not found for [B:44:0x00ac, B:46:0x00b2], limit reached: 74 */
    /* JADX WARN: Path cross not found for [B:46:0x00b2, B:44:0x00ac], limit reached: 74 */
    /* JADX WARN: Path cross not found for [B:46:0x00b2, B:54:0x00cd], limit reached: 74 */
    /* JADX WARN: Path cross not found for [B:66:0x0111, B:67:0x0112], limit reached: 74 */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009e A[Catch: all -> 0x003d, TryCatch #1 {all -> 0x003d, blocks: (B:14:0x0039, B:36:0x0096, B:38:0x009e, B:41:0x00a5, B:42:0x00a9, B:44:0x00ac, B:54:0x00cd, B:57:0x00dd, B:58:0x00f9, B:64:0x0109, B:61:0x0100, B:63:0x0106, B:46:0x00b2, B:50:0x00b9, B:21:0x0052, B:24:0x005d, B:35:0x0087), top: B:73:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ac A[Catch: all -> 0x003d, TryCatch #1 {all -> 0x003d, blocks: (B:14:0x0039, B:36:0x0096, B:38:0x009e, B:41:0x00a5, B:42:0x00a9, B:44:0x00ac, B:54:0x00cd, B:57:0x00dd, B:58:0x00f9, B:64:0x0109, B:61:0x0100, B:63:0x0106, B:46:0x00b2, B:50:0x00b9, B:21:0x0052, B:24:0x005d, B:35:0x0087), top: B:73:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00dd A[Catch: all -> 0x003d, TryCatch #1 {all -> 0x003d, blocks: (B:14:0x0039, B:36:0x0096, B:38:0x009e, B:41:0x00a5, B:42:0x00a9, B:44:0x00ac, B:54:0x00cd, B:57:0x00dd, B:58:0x00f9, B:64:0x0109, B:61:0x0100, B:63:0x0106, B:46:0x00b2, B:50:0x00b9, B:21:0x0052, B:24:0x005d, B:35:0x0087), top: B:73:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x00dc -> B:36:0x0096). Please report as a decompilation issue!!! */
    @Override // defpackage.xe2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.ze2 r18, defpackage.g51 r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 281
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.l.a(ze2, g51):java.lang.Object");
    }

    @Override // defpackage.ub5
    public final void b() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override // defpackage.cq2
    public final xe2 c(w61 w61Var, int i, BufferOverflow bufferOverflow) {
        return (((i < 0 || i >= 2) && i != -2) || bufferOverflow != BufferOverflow.b) ? vy2.A(this, w61Var, i, bufferOverflow) : this;
    }

    @Override // defpackage.ub5
    public final boolean e(Object obj) {
        o(obj);
        return true;
    }

    @Override // defpackage.ub5, defpackage.ze2
    public final Object emit(Object obj, g51 g51Var) {
        o(obj);
        return tx8.a;
    }

    @Override // defpackage.u2
    public final v2 g() {
        return new w48();
    }

    @Override // defpackage.v48
    public final Object getValue() {
        mu3 mu3Var = vy2.f;
        Object obj = f.get(this);
        if (obj == mu3Var) {
            return null;
        }
        return obj;
    }

    @Override // defpackage.u2
    public final v2[] h() {
        return new w48[2];
    }

    public final boolean n(Object obj, Object obj2) {
        mu3 mu3Var = vy2.f;
        if (obj == null) {
            obj = mu3Var;
        }
        if (obj2 == null) {
            obj2 = mu3Var;
        }
        return p(obj, obj2);
    }

    public final void o(Object obj) {
        if (obj == null) {
            obj = vy2.f;
        }
        p(null, obj);
    }

    public final boolean p(Object obj, Object obj2) {
        int i;
        v2[] v2VarArr;
        mu3 mu3Var;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !js3.i(obj3, obj)) {
                return false;
            }
            if (js3.i(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i2 = this.e;
            if ((i2 & 1) != 0) {
                this.e = i2 + 2;
                return true;
            }
            int i3 = i2 + 1;
            this.e = i3;
            v2[] v2VarArr2 = (v2[]) this.c;
            while (true) {
                w48[] w48VarArr = (w48[]) v2VarArr2;
                if (w48VarArr != null) {
                    for (w48 w48Var : w48VarArr) {
                        if (w48Var != null) {
                            AtomicReference atomicReference = w48Var.a;
                            while (true) {
                                Object obj4 = atomicReference.get();
                                if (obj4 != null && obj4 != (mu3Var = ja1.o)) {
                                    mu3 mu3Var2 = ja1.n;
                                    if (obj4 != mu3Var2) {
                                        while (!atomicReference.compareAndSet(obj4, mu3Var2)) {
                                            if (atomicReference.get() != obj4) {
                                                break;
                                            }
                                        }
                                        ((om0) obj4).resumeWith(tx8.a);
                                        break;
                                    }
                                    while (!atomicReference.compareAndSet(obj4, mu3Var)) {
                                        if (atomicReference.get() != obj4) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i = this.e;
                    if (i == i3) {
                        this.e = i3 + 1;
                        return true;
                    }
                    v2VarArr = (v2[]) this.c;
                }
                v2VarArr2 = v2VarArr;
                i3 = i;
            }
        }
    }
}
