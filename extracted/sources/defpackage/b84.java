package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class b84 extends h1 {
    public final Object a;
    public Object b;
    public b84 c;
    public b84 d;
    public b84 e;
    public b84 f;

    public b84(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.b;
    }

    @Override // defpackage.h1, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.b;
        this.b = obj;
        return obj2;
    }
}
