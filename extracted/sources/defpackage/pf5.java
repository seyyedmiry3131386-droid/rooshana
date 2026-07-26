package defpackage;

import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class pf5 implements bp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ pf5(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // defpackage.bp2
    public final Object invoke() {
        int i = this.a;
        String str = this.b;
        switch (i) {
            case 0:
                int i2 = MyketTextView.k;
                return str != null ? str : "";
            default:
                js3.p(str, "uriPattern");
                return new ti5(str, null, null);
        }
    }
}
