package defpackage;

import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class gj0 implements la1 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ gj0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.la1
    public final void c() {
        int i = this.a;
    }

    @Override // defpackage.la1
    public final void cancel() {
        int i = this.a;
    }

    @Override // defpackage.la1
    public final DataSource d() {
        switch (this.a) {
        }
        return DataSource.a;
    }

    @Override // defpackage.la1
    public final void e(Priority priority, ka1 ka1Var) {
        switch (this.a) {
            case 0:
                try {
                    ka1Var.f(lj0.a((File) this.b));
                } catch (IOException e) {
                    ka1Var.a(e);
                    return;
                }
                break;
            default:
                ka1Var.f(this.b);
                break;
        }
    }

    @Override // defpackage.la1
    public final Class getDataClass() {
        switch (this.a) {
            case 0:
                return ByteBuffer.class;
            default:
                return this.b.getClass();
        }
    }

    private final void a() {
    }

    private final void b() {
    }

    private final void f() {
    }

    private final void g() {
    }
}
