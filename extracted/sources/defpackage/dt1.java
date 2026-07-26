package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import ir.mservices.market.movie.download.quality.recycler.DownloadQualityRecentData;
import ir.mservices.market.movie.download.quality.recycler.a;

/* JADX INFO: loaded from: classes3.dex */
public final class dt1 extends ClickableSpan {
    public final /* synthetic */ a a;
    public final /* synthetic */ DownloadQualityRecentData b;

    public dt1(a aVar, DownloadQualityRecentData downloadQualityRecentData) {
        this.a = aVar;
        this.b = downloadQualityRecentData;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        js3.p(view, "widget");
        a aVar = this.a;
        aVar.w.m(view, aVar, this.b);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        js3.p(textPaint, "ds");
        textPaint.setUnderlineText(false);
    }
}
