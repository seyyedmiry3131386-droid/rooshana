package j$.util.stream;

import j$.util.Spliterator;

/* JADX INFO: loaded from: classes2.dex */
public final class j extends f5 {
    public final /* synthetic */ int b = 2;
    public boolean c;
    public Object d;

    public /* synthetic */ j(j5 j5Var) {
        super(j5Var);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(e8 e8Var, j5 j5Var) {
        super(j5Var);
        this.d = e8Var;
        this.c = true;
    }

    @Override // j$.util.stream.f5, j$.util.stream.j5
    public final void c(long j) {
        switch (this.b) {
            case 0:
                this.c = false;
                this.d = null;
                this.a.c(-1L);
                break;
            case 1:
                this.a.c(-1L);
                break;
            default:
                this.a.c(-1L);
                break;
        }
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void n(Object obj) throws Exception {
        switch (this.b) {
            case 0:
                j5 j5Var = this.a;
                if (obj == null) {
                    if (this.c) {
                        return;
                    }
                    this.c = true;
                    this.d = null;
                    j5Var.n((Object) null);
                    return;
                }
                Object obj2 = this.d;
                if (obj2 == null || !obj.equals(obj2)) {
                    this.d = obj;
                    j5Var.n(obj);
                    return;
                }
                return;
            case 1:
                Stream stream = (Stream) ((j$.util.p) ((o) this.d).t).apply(obj);
                if (stream != null) {
                    try {
                        boolean z = this.c;
                        j5 j5Var2 = this.a;
                        if (!z) {
                            ((Stream) stream.sequential()).forEach(j5Var2);
                        } else {
                            Spliterator spliterator = ((Stream) stream.sequential()).spliterator();
                            while (!j5Var2.e() && spliterator.tryAdvance(j5Var2)) {
                            }
                        }
                    } catch (Throwable th) {
                        try {
                            stream.close();
                            break;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                    break;
                }
                if (stream != null) {
                    stream.close();
                    return;
                }
                return;
            default:
                if (this.c) {
                    boolean zTest = ((e8) this.d).t.test(obj);
                    this.c = zTest;
                    if (zTest) {
                        this.a.n(obj);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // j$.util.stream.f5, j$.util.stream.j5
    public boolean e() {
        switch (this.b) {
            case 1:
                this.c = true;
                return this.a.e();
            case 2:
                return !this.c || this.a.e();
            default:
                return super.e();
        }
    }

    @Override // j$.util.stream.f5, j$.util.stream.j5
    public void end() {
        switch (this.b) {
            case 0:
                this.c = false;
                this.d = null;
                this.a.end();
                break;
            default:
                super.end();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(o oVar, j5 j5Var) {
        super(j5Var);
        this.d = oVar;
    }
}
