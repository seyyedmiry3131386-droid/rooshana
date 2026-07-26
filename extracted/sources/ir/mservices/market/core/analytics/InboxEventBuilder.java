package ir.mservices.market.core.analytics;

import android.os.Parcelable;
import defpackage.fr5;

/* JADX INFO: loaded from: classes3.dex */
public class InboxEventBuilder extends EventBuilder {
    public static final Parcelable.Creator<InboxEventBuilder> CREATOR = new fr5(15);

    public InboxEventBuilder() {
        super("inbox");
    }

    @Override // ir.mservices.market.core.analytics.EventBuilder, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }
}
