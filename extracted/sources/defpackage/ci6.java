package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class ci6 implements bi6 {
    public final Object[] a;
    public int b;

    public ci6(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.a = new Object[i];
    }

    public void a(yv yvVar) {
        int i = this.b;
        Object[] objArr = this.a;
        if (i < objArr.length) {
            objArr[i] = yvVar;
            this.b = i + 1;
        }
    }

    @Override // defpackage.bi6
    public boolean d(Object obj) {
        Object[] objArr;
        boolean z;
        js3.p(obj, "instance");
        int i = this.b;
        int i2 = 0;
        while (true) {
            objArr = this.a;
            if (i2 >= i) {
                z = false;
                break;
            }
            if (objArr[i2] == obj) {
                z = true;
                break;
            }
            i2++;
        }
        if (z) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i3 = this.b;
        if (i3 >= objArr.length) {
            return false;
        }
        objArr[i3] = obj;
        this.b = i3 + 1;
        return true;
    }

    @Override // defpackage.bi6
    public Object e() {
        int i = this.b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.a;
        Object obj = objArr[i2];
        js3.n(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        objArr[i2] = null;
        this.b--;
        return obj;
    }

    public ci6() {
        this.a = new Object[256];
    }
}
