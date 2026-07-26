package ir.mservices.market.core.analytics;

import android.os.Parcelable;
import defpackage.qt4;

/* JADX INFO: loaded from: classes3.dex */
public class MenuEventBuilder extends EventBuilder {
    public static final Parcelable.Creator<MenuEventBuilder> CREATOR = new qt4(0);

    public MenuEventBuilder() {
        super("menu");
    }

    public final void b(String str) {
        this.c.putString("on", str);
    }
}
