package defpackage;

import com.google.android.material.shape.StateListSizeChange$SizeChangeType;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class r70 implements p70 {
    public final /* synthetic */ int a;
    public float b;
    public Object c;

    @Override // defpackage.p70
    public boolean a(float f) {
        if (this.b == f) {
            return true;
        }
        this.b = f;
        return false;
    }

    @Override // defpackage.p70
    public uy3 c() {
        return (uy3) this.c;
    }

    @Override // defpackage.p70
    public boolean h(float f) {
        return !((uy3) this.c).c();
    }

    @Override // defpackage.p70
    public boolean isEmpty() {
        return false;
    }

    @Override // defpackage.p70
    public float l() {
        return ((uy3) this.c).a();
    }

    @Override // defpackage.p70
    public float m() {
        return ((uy3) this.c).b();
    }

    public String toString() {
        switch (this.a) {
            case 1:
                StringBuilder sb = new StringBuilder("Dimension{value=");
                sb.append(this.b);
                sb.append(", unit='");
                return dw1.s(sb, (String) this.c, "'}");
            default:
                return super.toString();
        }
    }

    public r70(String str, float f) {
        this.a = 1;
        this.b = f;
        this.c = str;
    }

    public r70(StateListSizeChange$SizeChangeType stateListSizeChange$SizeChangeType, float f) {
        this.a = 3;
        this.c = stateListSizeChange$SizeChangeType;
        this.b = f;
    }

    public r70(List list) {
        this.a = 0;
        this.b = -1.0f;
        this.c = (uy3) list.get(0);
    }
}
