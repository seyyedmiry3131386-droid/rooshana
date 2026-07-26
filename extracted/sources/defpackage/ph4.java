package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class ph4 implements sh4 {
    public final Object a;
    public final int b;

    public ph4(int i, Object obj) {
        this.a = obj;
        this.b = i;
    }

    @Override // defpackage.sh4
    public sh4 a() {
        return null;
    }

    @Override // defpackage.sh4
    public final int c() {
        return this.b;
    }

    @Override // defpackage.sh4
    public final Object getKey() {
        return this.a;
    }
}
