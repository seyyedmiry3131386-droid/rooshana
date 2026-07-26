package ir.mservices.market.core.analytics;

import android.os.Parcelable;
import defpackage.qt4;

/* JADX INFO: loaded from: classes3.dex */
public class MultiSelectEventBuilder extends EventBuilder {
    public static final Parcelable.Creator<MultiSelectEventBuilder> CREATOR = new qt4(4);

    public MultiSelectEventBuilder() {
        super("multi_select");
    }
}
