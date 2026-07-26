package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import ir.mservices.market.app.detail.data.MoreDescriptionData;
import ir.mservices.market.appDetail.ToolbarData;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class tx4 implements ai5 {
    public final MoreDescriptionData a;
    public final ToolbarData b;

    public tx4(MoreDescriptionData moreDescriptionData, ToolbarData toolbarData) {
        this.a = moreDescriptionData;
        this.b = toolbarData;
    }

    public static final tx4 fromBundle(Bundle bundle) {
        if (!t61.B(bundle, "bundle", tx4.class, "descriptionData")) {
            throw new IllegalArgumentException("Required argument \"descriptionData\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(MoreDescriptionData.class) && !Serializable.class.isAssignableFrom(MoreDescriptionData.class)) {
            throw new UnsupportedOperationException(MoreDescriptionData.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        MoreDescriptionData moreDescriptionData = (MoreDescriptionData) bundle.get("descriptionData");
        if (moreDescriptionData == null) {
            throw new IllegalArgumentException("Argument \"descriptionData\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("application")) {
            throw new IllegalArgumentException("Required argument \"application\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(ToolbarData.class) && !Serializable.class.isAssignableFrom(ToolbarData.class)) {
            throw new UnsupportedOperationException(ToolbarData.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        ToolbarData toolbarData = (ToolbarData) bundle.get("application");
        if (toolbarData != null) {
            return new tx4(moreDescriptionData, toolbarData);
        }
        throw new IllegalArgumentException("Argument \"application\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tx4)) {
            return false;
        }
        tx4 tx4Var = (tx4) obj;
        return js3.i(this.a, tx4Var.a) && js3.i(this.b, tx4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MoreDescriptionFragmentArgs(descriptionData=" + this.a + ", application=" + this.b + ")";
    }
}
