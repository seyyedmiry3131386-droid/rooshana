package defpackage;

import com.airbnb.lottie.model.content.ShapeTrimPath$Type;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ws8 implements r31, o70 {
    public final boolean a;
    public final ArrayList b = new ArrayList();
    public final ShapeTrimPath$Type c;
    public final he2 d;
    public final he2 e;
    public final he2 f;

    public ws8(t70 t70Var, zy6 zy6Var) {
        this.a = zy6Var.d;
        this.c = (ShapeTrimPath$Type) zy6Var.b;
        he2 he2VarA = zy6Var.c.a();
        this.d = he2VarA;
        he2 he2VarA2 = ((cj) zy6Var.e).a();
        this.e = he2VarA2;
        he2 he2VarA3 = ((cj) zy6Var.f).a();
        this.f = he2VarA3;
        t70Var.e(he2VarA);
        t70Var.e(he2VarA2);
        t70Var.e(he2VarA3);
        he2VarA.a(this);
        he2VarA2.a(this);
        he2VarA3.a(this);
    }

    @Override // defpackage.o70
    public final void a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return;
            }
            ((o70) arrayList.get(i)).a();
            i++;
        }
    }

    public final void c(o70 o70Var) {
        this.b.add(o70Var);
    }

    @Override // defpackage.r31
    public final void b(List list, List list2) {
    }
}
