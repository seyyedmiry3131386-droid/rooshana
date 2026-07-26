package defpackage;

import androidx.appcompat.widget.AppCompatTextView;

/* JADX INFO: loaded from: classes.dex */
public class mo extends ca7 {
    public final /* synthetic */ AppCompatTextView h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mo(AppCompatTextView appCompatTextView) {
        super(6, appCompatTextView);
        this.h = appCompatTextView;
    }

    @Override // defpackage.ca7, defpackage.lo
    public final void a(int i) {
        super/*android.widget.TextView*/.setLastBaselineToBottomHeight(i);
    }

    @Override // defpackage.ca7, defpackage.lo
    public final void c(int i) {
        super/*android.widget.TextView*/.setFirstBaselineToTopHeight(i);
    }
}
