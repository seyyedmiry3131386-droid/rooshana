package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class df0 implements rp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ df0(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // defpackage.rp2
    public final Object a(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                qz0 qz0Var = (qz0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                js3.p((db7) obj, "$this$OutlinedButton");
                if (qz0Var.R(iIntValue & 1, (iIntValue & 17) != 16)) {
                    mi8.b(this.b, null, 0L, 0L, 0L, new of8(3), 0L, 0, false, 0, 0, ((wf5) qz0Var.j(aw8.a)).f, qz0Var, 0, 0, 130046);
                } else {
                    qz0Var.U();
                }
                break;
            case 1:
                wv0 wv0Var = (wv0) obj;
                qz0 qz0Var2 = (qz0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                js3.p(wv0Var, "$this$BottomSheetScaffold");
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= qz0Var2.f(wv0Var) ? 4 : 2;
                }
                if (qz0Var2.R(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    wq2.a(new nc3(eq.p), this.b, qz0Var2, 0);
                } else {
                    qz0Var2.U();
                }
                break;
            case 2:
                wv0 wv0Var2 = (wv0) obj;
                qz0 qz0Var3 = (qz0) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                js3.p(wv0Var2, "$this$BottomSheetScaffold");
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= qz0Var3.f(wv0Var2) ? 4 : 2;
                }
                if (qz0Var3.R(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    wq2.a(new nc3(eq.p), this.b, qz0Var3, 0);
                } else {
                    qz0Var3.U();
                }
                break;
            default:
                wv0 wv0Var3 = (wv0) obj;
                qz0 qz0Var4 = (qz0) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                js3.p(wv0Var3, "$this$BottomSheetScaffold");
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= qz0Var4.f(wv0Var3) ? 4 : 2;
                }
                if (qz0Var4.R(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    wq2.a(new nc3(eq.p), this.b, qz0Var4, 0);
                } else {
                    qz0Var4.U();
                }
                break;
        }
        return tx8.a;
    }
}
