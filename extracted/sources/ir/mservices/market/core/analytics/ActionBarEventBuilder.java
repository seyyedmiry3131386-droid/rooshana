package ir.mservices.market.core.analytics;

import android.os.Parcelable;
import defpackage.fr5;

/* JADX INFO: loaded from: classes3.dex */
public class ActionBarEventBuilder extends EventBuilder {
    public static final Parcelable.Creator<ActionBarEventBuilder> CREATOR = new fr5(2);

    public ActionBarEventBuilder() {
        super("action_bar");
    }

    public final void b(String str) {
        this.c.putString("on", str);
    }
}
