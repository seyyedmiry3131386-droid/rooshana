package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class m39 extends l39 {
    public t36[] a;
    public String b;
    public int c;

    public m39() {
        this.a = null;
        this.c = 0;
    }

    public t36[] getPathData() {
        return this.a;
    }

    public String getPathName() {
        return this.b;
    }

    public void setPathData(t36[] t36VarArr) {
        if (!wq2.k(this.a, t36VarArr)) {
            this.a = wq2.q(t36VarArr);
            return;
        }
        t36[] t36VarArr2 = this.a;
        for (int i = 0; i < t36VarArr.length; i++) {
            t36VarArr2[i].a = t36VarArr[i].a;
            int i2 = 0;
            while (true) {
                float[] fArr = t36VarArr[i].b;
                if (i2 < fArr.length) {
                    t36VarArr2[i].b[i2] = fArr[i2];
                    i2++;
                }
            }
        }
    }

    public m39(m39 m39Var) {
        this.a = null;
        this.c = 0;
        this.b = m39Var.b;
        this.a = wq2.q(m39Var.a);
    }
}
