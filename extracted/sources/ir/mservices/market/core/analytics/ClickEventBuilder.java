package ir.mservices.market.core.analytics;

import android.os.Parcelable;
import defpackage.fr5;

/* JADX INFO: loaded from: classes3.dex */
public class ClickEventBuilder extends EventBuilder {
    public static final Parcelable.Creator<ClickEventBuilder> CREATOR = new fr5(8);

    public ClickEventBuilder() {
        super("click");
    }

    public final void b(String str) {
        this.c.putString("on", str);
    }
}
