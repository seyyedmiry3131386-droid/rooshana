package defpackage;

import androidx.compose.foundation.text.contextmenu.internal.a;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class di implements bp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;
    public final /* synthetic */ ag8 c;

    public /* synthetic */ di(a aVar, ag8 ag8Var, int i) {
        this.a = i;
        this.b = aVar;
        this.c = ag8Var;
    }

    @Override // defpackage.bp2
    public final Object invoke() {
        switch (this.a) {
            case 0:
                a aVar = this.b;
                ei eiVar = aVar.f;
                x2 x2Var = new x2(3, this.c);
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                aVar.e.d("dataBuilder", eiVar, new d(ref$ObjectRef, x2Var, 5));
                Object obj = ref$ObjectRef.a;
                if (obj != null) {
                    return (zf8) obj;
                }
                js3.V("result");
                throw null;
            case 1:
                a aVar2 = this.b;
                ei eiVar2 = aVar2.g;
                di diVar = new di(aVar2, this.c, 2);
                Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                aVar2.e.d("positioner", eiVar2, new d(ref$ObjectRef2, diVar, 5));
                Object obj2 = ref$ObjectRef2.a;
                if (obj2 != null) {
                    return (sy6) obj2;
                }
                js3.V("result");
                throw null;
            default:
                v04 v04Var = (v04) this.b.c.invoke();
                return this.c.j(v04Var).i(v04Var.K(0L));
        }
    }
}
