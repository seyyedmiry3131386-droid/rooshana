package com.microsoft.clarity.models.observers;

import android.app.Activity;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.dw1;
import defpackage.js3;
import defpackage.rm7;
import defpackage.yd1;

/* JADX INFO: loaded from: classes3.dex */
public final class ScreenMetadata {
    public static final Companion Companion = new Companion(null);
    private final int activityHashCode;
    private final String activityName;
    private final String name;

    public static final class Companion {
        public /* synthetic */ Companion(yd1 yd1Var) {
            this();
        }

        public static /* synthetic */ ScreenMetadata create$default(Companion companion, Activity activity2, String str, int i, Object obj) {
            if ((i & 2) != 0) {
                str = null;
            }
            return companion.create(activity2, str);
        }

        public final ScreenMetadata create(Activity activity2, String str) {
            js3.p(activity2, "activity");
            if (str == null) {
                str = activity2.getClass().getSimpleName();
            }
            return new ScreenMetadata(str, activity2.getClass().getSimpleName(), activity2.hashCode());
        }

        private Companion() {
        }
    }

    public ScreenMetadata(String str, String str2, int i) {
        js3.p(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        js3.p(str2, "activityName");
        this.name = str;
        this.activityName = str2;
        this.activityHashCode = i;
    }

    public static /* synthetic */ ScreenMetadata copy$default(ScreenMetadata screenMetadata, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = screenMetadata.name;
        }
        if ((i2 & 2) != 0) {
            str2 = screenMetadata.activityName;
        }
        if ((i2 & 4) != 0) {
            i = screenMetadata.activityHashCode;
        }
        return screenMetadata.copy(str, str2, i);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.activityName;
    }

    public final int component3() {
        return this.activityHashCode;
    }

    public final ScreenMetadata copy(String str, String str2, int i) {
        js3.p(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        js3.p(str2, "activityName");
        return new ScreenMetadata(str, str2, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScreenMetadata)) {
            return false;
        }
        ScreenMetadata screenMetadata = (ScreenMetadata) obj;
        return js3.i(this.name, screenMetadata.name) && js3.i(this.activityName, screenMetadata.activityName) && this.activityHashCode == screenMetadata.activityHashCode;
    }

    public final int getActivityHashCode() {
        return this.activityHashCode;
    }

    public final String getActivityName() {
        return this.activityName;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.activityHashCode + rm7.k(this.activityName, this.name.hashCode() * 31, 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("(name: ");
        sb.append(this.name);
        sb.append(", activity name: ");
        sb.append(this.activityName);
        sb.append(", activity hash code: ");
        return dw1.q(sb, this.activityHashCode, ')');
    }
}
