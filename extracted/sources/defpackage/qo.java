package defpackage;

import android.text.StaticLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class qo extends po {
    @Override // defpackage.po, defpackage.ro
    public void a(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection(textView.getTextDirectionHeuristic());
    }

    @Override // defpackage.ro
    public boolean b(TextView textView) {
        return textView.isHorizontallyScrollable();
    }
}
