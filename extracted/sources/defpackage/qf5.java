package defpackage;

import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qf5 implements bp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MyketTextView b;

    public /* synthetic */ qf5(MyketTextView myketTextView, int i) {
        this.a = i;
        this.b = myketTextView;
    }

    @Override // defpackage.bp2
    public final Object invoke() {
        int i = this.a;
        MyketTextView myketTextView = this.b;
        switch (i) {
            case 0:
                int i2 = MyketTextView.k;
                CharSequence text = myketTextView.getText();
                js3.o(text, "getText(...)");
                return text;
            default:
                int i3 = MyketTextView.k;
                CharSequence text2 = myketTextView.getText();
                js3.o(text2, "getText(...)");
                return text2;
        }
    }
}
