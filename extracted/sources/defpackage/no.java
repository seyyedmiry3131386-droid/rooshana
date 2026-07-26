package defpackage;

import androidx.appcompat.widget.AppCompatTextView;

/* JADX INFO: loaded from: classes.dex */
public final class no extends mo {
    public final /* synthetic */ AppCompatTextView i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public no(AppCompatTextView appCompatTextView) {
        super(appCompatTextView);
        this.i = appCompatTextView;
    }

    @Override // defpackage.ca7, defpackage.lo
    public final void e(int i, float f) {
        super/*android.widget.TextView*/.setLineHeight(i, f);
    }
}
