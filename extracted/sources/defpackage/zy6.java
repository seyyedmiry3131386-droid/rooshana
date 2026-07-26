package defpackage;

import com.airbnb.lottie.b;
import com.airbnb.lottie.model.content.ShapeTrimPath$Type;

/* JADX INFO: loaded from: classes.dex */
public final class zy6 implements l41 {
    public final /* synthetic */ int a = 1;
    public final Object b;
    public final cj c;
    public final boolean d;
    public final jj e;
    public final Object f;

    public zy6(String str, cj cjVar, cj cjVar2, hj hjVar, boolean z) {
        this.b = str;
        this.c = cjVar;
        this.e = cjVar2;
        this.f = hjVar;
        this.d = z;
    }

    @Override // defpackage.l41
    public final r31 a(b bVar, gf4 gf4Var, t70 t70Var) {
        switch (this.a) {
            case 0:
                return new yy6(bVar, t70Var, this);
            case 1:
                return new d47(bVar, t70Var, this);
            default:
                return new ws8(t70Var, this);
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "RectangleShape{position=" + this.e + ", size=" + ((jj) this.f) + '}';
            case 1:
            default:
                return super.toString();
            case 2:
                return "Trim Path: {start: " + this.c + ", end: " + ((cj) this.e) + ", offset: " + ((cj) this.f) + "}";
        }
    }

    public zy6(String str, jj jjVar, bj bjVar, cj cjVar, boolean z) {
        this.b = str;
        this.e = jjVar;
        this.f = bjVar;
        this.c = cjVar;
        this.d = z;
    }

    public zy6(String str, ShapeTrimPath$Type shapeTrimPath$Type, cj cjVar, cj cjVar2, cj cjVar3, boolean z) {
        this.b = shapeTrimPath$Type;
        this.c = cjVar;
        this.e = cjVar2;
        this.f = cjVar3;
        this.d = z;
    }
}
