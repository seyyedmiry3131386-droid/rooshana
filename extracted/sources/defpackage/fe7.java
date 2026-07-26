package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fe7 extends ik5 {
    public final ee7 a;

    public fe7(ee7 ee7Var) {
        this.a = ee7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || fe7.class != obj.getClass()) {
            return false;
        }
        return js3.i(this.a, ((fe7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SceneInfo(scene=" + this.a + ')';
    }
}
