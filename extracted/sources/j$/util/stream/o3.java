package j$.util.stream;

import j$.util.Spliterator;

/* JADX INFO: loaded from: classes2.dex */
public final class o3 extends p3 {
    public final Object[] h;

    public o3(Spliterator spliterator, t3 t3Var, Object[] objArr) {
        super(spliterator, t3Var, objArr.length);
        this.h = objArr;
    }

    public o3(o3 o3Var, Spliterator spliterator, long j, long j2) {
        super(o3Var, spliterator, j, j2, o3Var.h.length);
        this.h = o3Var.h;
    }

    @Override // j$.util.stream.p3
    public final p3 a(Spliterator spliterator, long j, long j2) {
        return new o3(this, spliterator, j, j2);
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void n(Object obj) {
        int i = this.f;
        if (i >= this.g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f));
        }
        Object[] objArr = this.h;
        this.f = i + 1;
        objArr[i] = obj;
    }
}
