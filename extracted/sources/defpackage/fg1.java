package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fg1 implements vb8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fg1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.vb8
    public final Object get() {
        switch (this.a) {
            case 0:
                try {
                    return (js4) ((Class) this.b).getConstructor(null).newInstance(null);
                } catch (Exception e) {
                    throw new IllegalStateException(e);
                }
            case 1:
                return (ig1) this.b;
            case 2:
                return (td1) this.b;
            case 3:
                return (qg1) this.b;
            case 4:
                return (ci1) this.b;
            default:
                return (yf1) this.b;
        }
    }
}
