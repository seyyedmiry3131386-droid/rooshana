package defpackage;

import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class of5 implements bp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MyketTextView b;
    public final /* synthetic */ String c;

    public /* synthetic */ of5(int i, MyketTextView myketTextView, String str) {
        this.a = i;
        this.b = myketTextView;
        this.c = str;
    }

    @Override // defpackage.bp2
    public final Object invoke() {
        int i = this.a;
        tx8 tx8Var = tx8.a;
        String str = this.c;
        MyketTextView myketTextView = this.b;
        switch (i) {
            case 0:
                int i2 = MyketTextView.k;
                myketTextView.setText(str);
                break;
            default:
                int i3 = MyketTextView.k;
                if (str == null) {
                    str = "";
                }
                myketTextView.setMarkdownText(str);
                break;
        }
        return tx8Var;
    }
}
