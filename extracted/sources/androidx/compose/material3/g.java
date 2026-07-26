package androidx.compose.material3;

import defpackage.bp2;
import defpackage.bt2;
import defpackage.e71;
import defpackage.qw4;
import defpackage.s08;
import defpackage.tx8;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements bp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ n b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ e71 d;

    public /* synthetic */ g(e71 e71Var, bp2 bp2Var, n nVar) {
        this.a = 1;
        this.b = nVar;
        this.c = bp2Var;
        this.d = e71Var;
    }

    @Override // defpackage.bp2
    public final Object invoke() {
        switch (this.a) {
            case 0:
                bp2 bp2Var = (bp2) this.c;
                n nVar = this.b;
                if (((Boolean) nVar.d.d.invoke(SheetValue.a)).booleanValue()) {
                    bt2.G(this.d, null, null, new ModalBottomSheetKt$ModalBottomSheet$animateToDismiss$1$1$1(nVar, null), 3).s0(new qw4(nVar, bp2Var, 0));
                }
                return tx8.a;
            case 1:
                bp2 bp2Var2 = (bp2) this.c;
                n nVar2 = this.b;
                int iOrdinal = ((SheetValue) ((s08) nVar2.d.g).getValue()).ordinal();
                if (iOrdinal != 1) {
                    e71 e71Var = this.d;
                    if (iOrdinal != 2) {
                        bt2.G(e71Var, null, null, new ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$2(nVar2, null), 3);
                    } else {
                        bt2.G(e71Var, null, null, new ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$1(nVar2, null), 3);
                    }
                } else {
                    bp2Var2.invoke();
                }
                return tx8.a;
            default:
                n nVar3 = (n) this.c;
                if (((Boolean) this.b.d.d.invoke(SheetValue.b)).booleanValue()) {
                    bt2.G(this.d, null, null, new ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$2$1$1$2$1(nVar3, null), 3);
                }
                return Boolean.TRUE;
        }
    }

    public /* synthetic */ g(n nVar, e71 e71Var, Object obj, int i) {
        this.a = i;
        this.b = nVar;
        this.d = e71Var;
        this.c = obj;
    }
}
